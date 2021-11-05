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
public class SearchAdvanceController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_categoryId = request.getParameter("CategoryId");
        String raw_provinceId = request.getParameter("ProvinceId");
        String raw_districtId = request.getParameter("DistrictId");
        String raw_priceId = request.getParameter("PriceId");
        String raw_areaId = request.getParameter("AreaId");

        int categoryId = Integer.parseInt(raw_categoryId);
        int provinceId = Integer.parseInt(raw_provinceId);
        int districtId = Integer.parseInt(raw_districtId);
        int priceId = Integer.parseInt(raw_priceId);
        int areaId = Integer.parseInt(raw_areaId);

        PostDBContext pd = new PostDBContext();
        ArrayList<Post> posts = pd.search(categoryId, provinceId, districtId, priceId, areaId);
        request.setAttribute("posts", posts);
        ArrayList<District> dists = pd.getDists();
        request.setAttribute("dists", dists);

        ArrayList<Province> pros = pd.getPros();
        request.setAttribute("pros", pros);

        ArrayList<Image> images = pd.getImg();
        request.setAttribute("images", images);

        request.setAttribute("categoryId", categoryId);
        request.setAttribute("provinceId", provinceId);
        request.setAttribute("districtId", districtId);
        request.setAttribute("priceId", priceId);
        request.setAttribute("areaId", areaId);

        int pageName = Integer.parseInt(request.getParameter("pageName"));
        switch (pageName) {
            case 0:
                request.getRequestDispatcher("/view/post/home.jsp").forward(request, response);
                break;
            case 1:
                request.getRequestDispatcher("/view/post/broadinghouse.jsp").forward(request, response);
                break;
            case 2:
                request.getRequestDispatcher("/view/post/apartment.jsp").forward(request, response);
                break;
            case 3:
                request.getRequestDispatcher("/view/post/house.jsp").forward(request, response);
                break;
            case 4:
                request.getRequestDispatcher("/view/post/resident.jsp").forward(request, response);
                break;
        }
//        request.getRequestDispatcher("/view/post/home.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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
