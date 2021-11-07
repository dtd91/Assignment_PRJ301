package controller.post;

import dal.PostDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.District;
import model.Image;
import model.Post;
import model.Province;
import model.Ward;

public class MyPostController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PostDBContext rd = new PostDBContext();
        Account acc = (Account) request.getSession().getAttribute("account");
        String username = (String) acc.getUsername();

        ArrayList<Post> posts = rd.getPostsByUser(username);
        request.setAttribute("posts", posts);

        ArrayList<District> dists = rd.getDists();
        request.setAttribute("dists", dists);

        ArrayList<Province> pros = rd.getPros();
        request.setAttribute("pros", pros);

        ArrayList<Ward> wards = rd.getWards();
        request.setAttribute("wards", wards);

        request.getRequestDispatcher("/view/post/mypost.jsp").forward(request, response);
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
