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
        ArrayList<Post> list = rd.getPosts();
        ArrayList<Post> posts = new ArrayList<>();
        
        //Lấy 10 post cho trang Home -> Tạm thời phân trang đã
        int count = 0;
        for (Post post : list) {
            posts.add(post);
            count++;
//            if (count == 10) {
//                break;
//            }
        }
        
        //Phân trang
        
        
        
        
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
