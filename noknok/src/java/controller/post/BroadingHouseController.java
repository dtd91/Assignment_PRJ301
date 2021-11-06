package controller.post;

import dal.PostDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.District;
import model.Image;
import model.Post;
import model.Province;

/**
 *
 * @author PC
 */
public class BroadingHouseController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_page = request.getParameter("page");
        if (raw_page == null || raw_page.length() == 0) {
            raw_page = "1";
        }
        int page = Integer.parseInt(raw_page);
        PostDBContext rd = new PostDBContext();
        int pagesize = 8;
        ArrayList<Post> posts = rd.getPosts(page, pagesize,1);

        int count = rd.getCountByType(1);
        int totalpage = (count % pagesize == 0) ? count / pagesize : (count / pagesize) + 1;

        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pageindex", page);

        request.setAttribute("posts", posts);

        ArrayList<District> dists = rd.getDists();
        request.setAttribute("dists", dists);

        ArrayList<Province> pros = rd.getPros();
        request.setAttribute("pros", pros);

        ArrayList<Image> images = rd.getImg();
        request.setAttribute("images", images);
        request.getRequestDispatcher("view/post/broadinghouse.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PostDBContext rd = new PostDBContext();
        rd.search(0, 0, 0, 0, 0);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
