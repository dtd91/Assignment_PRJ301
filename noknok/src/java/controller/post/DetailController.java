package controller.post;

import dal.PostDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.GoogleMap;
import model.Image;
import model.Post;

/**
 *
 * @author PC
 */
public class DetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        PostDBContext rd = new PostDBContext();
        Post post = rd.getPost(id);
//        response.getWriter().print(post.getDescription());
        request.setAttribute("post", post);
        
        ArrayList<Category> categories = rd.getCategories();
        request.setAttribute("category",categories);
        GoogleMap map = rd.getMap(id);
        request.setAttribute("map", map);
        request.getRequestDispatcher("/view/post/detail.jsp").forward(request, response);

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
