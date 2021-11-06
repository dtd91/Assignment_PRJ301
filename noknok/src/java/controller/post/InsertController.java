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
import model.Post;
import model.Province;
import model.Ward;

/**
 *
 * @author PC
 */
public class InsertController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PostDBContext pd = new PostDBContext();
        ArrayList<District> dicts = pd.getDists();
        request.setAttribute("dicts", dicts);

        ArrayList<Province> pros = pd.getPros();
        request.setAttribute("pros", pros);

        ArrayList<Ward> wards = pd.getWards();
        request.setAttribute("wards", wards);
        request.getRequestDispatcher("view/post/insert.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String title = request.getParameter("Title");
        int category = Integer.parseInt(request.getParameter("CategoryId"));
        float area = Float.parseFloat(request.getParameter("Area"));
        float price = Float.parseFloat(request.getParameter("Price"));
        int provinceId = Integer.parseInt(request.getParameter("ProvinceId"));
        int disctrictId = Integer.parseInt(request.getParameter("DistrictId"));
        int wardId = Integer.parseInt(request.getParameter("WardId"));
        String address = request.getParameter("Address");
        String contactName = request.getParameter("ContactName");
        int contactPhone = Integer.parseInt(request.getParameter("ContactMobile"));
        String contactEmail = request.getParameter("ContactEmail");
        String contactAddress = request.getParameter("ContactAddress");
        String description = request.getParameter("Detail");
        String img = request.getParameter("img");

        Post p = new Post();
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
        pd.insertPost(p);

        Account acc = (Account) request.getSession().getAttribute("account");
        pd.insertPostAccount(acc.getUsername(), pd.getLastPostId());
        int lastPostId = pd.getLastPostId();

        if (img.isEmpty()) {
            pd.insertImg(lastPostId, "img/0.jpg");
        } else {
            pd.insertImg(lastPostId, "img/" + img);
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
