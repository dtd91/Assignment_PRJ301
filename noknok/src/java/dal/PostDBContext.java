package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.resource.spi.DissociatableManagedConnection;
import model.Category;
import model.District;
import model.Image;
import model.Post;
import model.Province;
import model.Ward;

/**
 *
 * @author PC
 */
public class PostDBContext extends DBContext {

    public ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select po.id,title,description,address,w.wardid,d.districtid,p.provinceid, area,price,\n"
                    + "                   status,c.categoryid,po.contactname,po.contactphone,po.contactemail,po.contactaddress from Post po\n"
                    + "                    inner join Category c on c.categoryid = po.categoryid\n"
                    + "                   inner join ward w on w.wardid = po.wardid\n"
                    + "                   inner join district d on d.districtid = w.districtid\n"
                    + "                   inner join province p on p.provinceid = d.provinceid  ";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post r = new Post();
                r.setId(rs.getInt("id"));
                r.setTitle(rs.getString("title"));
                r.setDescription(rs.getString("description"));
                r.setAddress(rs.getString("address"));
                r.setWardId(rs.getInt("wardid"));
                r.setDistrictId(rs.getInt("districtid"));
                r.setProvinceId(rs.getInt("provinceid"));
                r.setArea(rs.getFloat("area"));
                r.setPrice(rs.getFloat("price"));
                r.setStatus(rs.getBoolean("status"));
                r.setCategoryId(rs.getInt("categoryid"));
                r.setContactName(rs.getString("contactname"));
                r.setContactPhone(rs.getInt("contactphone"));
                r.setContactEmail(rs.getString("contactemail"));
                r.setContactAddress(rs.getString("contactaddress"));
                posts.add(r);
            }
            return posts;
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Post getPost(int id) {
        Post r = new Post();
        try {
            String sql = "select po.id,title,description,address,w.wardid,d.districtid,p.provinceid, area,price,\n"
                    + "status,c.categoryid,po.contactname,po.contactphone,po.contactemail,po.contactaddress  from Post po\n"
                    + "inner join Category c on c.categoryid = po.categoryid\n"
                    + "inner join ward w on w.wardid = po.wardid\n"
                    + "inner join district d on d.districtid = w.districtid\n"
                    + "inner join province p on p.provinceid = d.provinceid  where po.id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                r.setId(rs.getInt("id"));
                r.setTitle(rs.getString("title"));
                r.setDescription(rs.getString("description"));
                r.setAddress(rs.getString("address"));
                r.setWardId(rs.getInt("wardid"));
                r.setDistrictId(rs.getInt("districtid"));
                r.setProvinceId(rs.getInt("provinceid"));
                r.setArea(rs.getFloat("area"));
                r.setPrice(rs.getFloat("price"));
                r.setStatus(rs.getBoolean("status"));
                r.setCategoryId(rs.getInt("categoryid"));
                r.setContactName(rs.getString("contactname"));
                r.setContactPhone(rs.getInt("contactphone"));
                r.setContactEmail(rs.getString("contactemail"));
                r.setContactAddress(rs.getString("contactaddress"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public void insertPost(Post p) {
        try {
            String sql = "INSERT INTO [Post]\n"
                    + "           ([title]\n"
                    + "           ,[description]\n"
                    + "           ,[categoryid]\n"
                    + "           ,[address]\n"
                    + "           ,[wardid]\n"
                    + "           ,[districtid]\n"
                    + "           ,[provinceid]\n"
                    + "           ,[area]\n"
                    + "           ,[price]\n"
                    + "           ,[status]\n"
                    + "           ,[contactname]\n"
                    + "           ,[contactphone]\n"
                    + "           ,[contactemail]\n"
                    + "           ,[contactaddress])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getTitle());
            stm.setString(2, p.getDescription());
            stm.setInt(3, p.getCategoryId());
            stm.setString(4, p.getAddress());
            stm.setInt(5, p.getWardId());
            stm.setInt(6, p.getDistrictId());
            stm.setInt(7, p.getProvinceId());
            stm.setFloat(8, p.getArea());
            stm.setFloat(9, p.getPrice());
            stm.setBoolean(10, p.isStatus());
            stm.setString(11, p.getContactName());
            stm.setInt(12, p.getContactPhone());
            stm.setString(13, p.getContactEmail());
            stm.setString(14, p.getContactAddress());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<District> getDists() {
        ArrayList<District> dists = new ArrayList<>();
        try {
            String sql = "SELECT * FROM district";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                District d = new District();
                d.setId(rs.getInt("districtid"));
                d.setName(rs.getString("name"));
                dists.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dists;
    }

    public ArrayList<Province> getPros() {
        ArrayList<Province> pros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM province";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Province p = new Province();
                p.setId(rs.getInt("provinceid"));
                p.setName(rs.getString("name"));
                pros.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pros;
    }

    public ArrayList<Ward> getWards() {
        ArrayList<Ward> wards = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ward";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ward w = new Ward();
                w.setId(rs.getInt("wardid"));
                w.setName(rs.getString("name"));
                wards.add(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wards;
    }

    public ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Category";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCategoryid(rs.getInt("categoryid"));
                c.setCname(rs.getString("cname"));
                categories.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    public void delete(int id) {
        try {
            String sql = "DELETE FROM Post WHERE id = ?\n";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Image> getImg(){
        ArrayList<Image> images = new ArrayList<>();
        try {
            String sql = "select * from Image";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Image img = new Image();
                img.setId(rs.getInt("postid"));
                img.setUrl(rs.getString("url"));
                images.add(img);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return images;
    }
}
