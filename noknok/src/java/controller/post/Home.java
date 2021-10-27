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
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PostDBContext rd = new PostDBContext();
        ArrayList<Post> posts = rd.getPosts();
        request.setAttribute("posts", posts);
        
        ArrayList<District> dists = rd.getDists();
        request.setAttribute("dists", dists);
        
        ArrayList<Province> pros = rd.getPros();
        request.setAttribute("pros", pros);
        
        ArrayList<Image> images = rd.getImg();
        request.setAttribute("images", images);
        request.getRequestDispatcher("view/post/home.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}