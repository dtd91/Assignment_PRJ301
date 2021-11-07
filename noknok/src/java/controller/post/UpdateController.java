package controller.post;

import dal.PostDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Post;

/**
 *
 * @author PC
 */
public class UpdateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        int category = Integer.parseInt(request.getParameter("CategoryId"));
        float area = Float.parseFloat(request.getParameter("area"));
        float price = Float.parseFloat(request.getParameter("price"));
        int provinceId = Integer.parseInt(request.getParameter("ProvinceId"));
        int disctrictId = Integer.parseInt(request.getParameter("DistrictId"));
        int wardId = Integer.parseInt(request.getParameter("WardId"));
        String address = request.getParameter("address");
        String contactName = request.getParameter("contactname");
        int contactPhone = Integer.parseInt(request.getParameter("contactphone"));
        String contactEmail = request.getParameter("contactemail");
        String contactAddress = request.getParameter("contactaddress");
        String description = request.getParameter("description");
        String img = request.getParameter("img");

        Post p = new Post();
        p.setId(id);
        p.setTitle(title);
        p.setCategoryId(category);
        p.setArea(area);
        p.setPrice(price);
        p.setProvinceId(provinceId);
        p.setDistrictId(disctrictId);
        p.setWardId(wardId);
        p.setAddress(address);
        p.setContactName(contactName);
        p.setContactPhone(contactPhone);
        p.setContactEmail(contactEmail);
        p.setContactAddress(contactAddress);
        p.setDescription(description);
        
        PostDBContext pd = new PostDBContext();
        pd.updatePost(p);
        if (img.isEmpty()) {
            pd.updateImg(id, "img/0.jpg");
        } else {
            pd.updateImg(id, "img/" + img);
        }
        response.sendRedirect("mypost");
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
