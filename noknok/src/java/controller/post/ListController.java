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
import model.District;
import model.Post;
import model.Province;
import model.Ward;


/**
 *
 * @author PC
 */
public class ListController extends HttpServlet {

   

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
        PostDBContext pd = new PostDBContext();
        ArrayList<Post> posts = pd.getAllPosts();
        request.setAttribute("posts", posts);
        
        ArrayList<Category> categories = pd.getCategories();
        request.setAttribute("categories", categories);
        
        ArrayList<District> dists = pd.getDists();
        request.setAttribute("dists", dists);
        
        ArrayList<Province> pros = pd.getPros();
        request.setAttribute("pros", pros);
        
        ArrayList<Ward> wards = pd.getWards();
        request.setAttribute("wards", wards);
        
        boolean t = Boolean.valueOf(request.getParameter("t"));
        request.setAttribute("t", t);
        
        
        request.getRequestDispatcher("view/post/list.jsp").forward(request, response);
    }

    
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
