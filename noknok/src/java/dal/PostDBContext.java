package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select po.id,title,description,address,wardid,districtid,provinceid,area,price,\n"
                    + "status,categoryid,po.contactname,po.contactphone,po.contactemail,po.contactaddress from Post po";
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

    public ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select * from Post where status = 1";
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

    public ArrayList<Post> getPosts(int pageindex, int pagesize, int caretogyid) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select * from \n"
                    + "(select ROW_NUMBER() OVER (ORDER BY id asc) as rownum,p.* from Post p where status = 1 ";
            if (caretogyid !=0) {
                sql +="and categoryid = "+caretogyid+") t where rownum >= (? - 1)*? + 1 AND rownum <= ? * ? ";
            }else{
                sql += ") t where rownum >= (? - 1)*? + 1 AND rownum <= ? * ? ";
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
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

    public int getCount() {
        try {
            String sql = "SELECT COUNT(*) as Total FROM Post where status = 1";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int getCountByType(int categoryid) {
        try {
            String sql = "SELECT COUNT(*) as Total FROM Post where status =1 and categoryid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, categoryid);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public ArrayList<Post> getPostsByUser(String username) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select po.id,title,description,address,wardid,districtid,provinceid,area,price,\n"
                    + "status,categoryid,po.contactname,po.contactphone,po.contactemail,po.contactaddress from Post po \n"
                    + "inner join PostAccount pc on pc.postid = po.id\n"
                    + "where username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
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

    public void insertPostAccount(String username, int postid) {
        try {
            String sql = "INSERT INTO [PostAccount]([username],[postid]) VALUES (?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setInt(2, postid);
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
            //Xóa từ bẳng postaccount trước
            String sql1 = "DELETE FROM [PostAccount] WHERE postid = ?";
            PreparedStatement stm1 = connection.prepareStatement(sql1);
            stm1.setInt(1, id);
            stm1.executeUpdate();

            String sql = "DELETE FROM Post WHERE id = ?\n";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Image> getImg() {
        ArrayList<Image> images = new ArrayList<>();
        try {
            String sql = "select * from Image";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Image> getImg(int postid) {
        ArrayList<Image> images = new ArrayList<>();
        try {
            String sql = "select * from Image where postid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, postid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
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

    public void insertImg(int postid, String url) {
        try {
            String sql = "INSERT INTO [Image]\n"
                    + "           ([postid]\n"
                    + "           ,[url])\n"
                    + "     VALUES(?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, postid);
            stm.setString(2, url);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getLastPostId() {
        try {
            String sql = "SELECT id FROM\n"
                    + "            (SELECT ROW_NUMBER() OVER (ORDER BY id desc) as rownum, id\n"
                    + "            FROM Post) t where rownum = 1 \n";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    //id = -1, name = null or blank., from and to null, did = -1
    //BUG: chưa 
    public ArrayList<Post> search(int categoryId, int provinceId, int districtId, int priceId, int areaId) {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            String sql = "select po.id,title,description,address,w.wardid,d.districtid,p.provinceid, area,price,\n"
                    + "status,c.categoryid,po.contactname,po.contactphone,po.contactemail,po.contactaddress from Post po\n"
                    + "inner join Category c on c.categoryid = po.categoryid\n"
                    + "inner join ward w on w.wardid = po.wardid\n"
                    + "inner join district d on d.districtid = w.districtid\n"
                    + "inner join province p on p.provinceid = d.provinceid\n"
                    + "where (1=1)\n";
            int paramIndex = 0;
            HashMap<Integer, Object[]> params = new HashMap<>();

            if (categoryId != 0) {
                sql += " AND po.categoryid = ?\n";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Integer.class.getName();// lấy loại dữ liệu là gì(String/int,..)
                param[1] = categoryId;
                params.put(paramIndex, param);
            }
            if (provinceId != 0) {
                sql += " AND po.provinceid = ?\n";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Integer.class.getName();// lấy loại dữ liệu là gì(String/int,..)
                param[1] = provinceId;
                params.put(paramIndex, param);
            }
            if (districtId != 0) {
                sql += " AND d.districtid = ?\n";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Integer.class.getName();// lấy loại dữ liệu là gì(String/int,..)
                param[1] = districtId;
                params.put(paramIndex, param);
            }
            if (priceId != 0) {
                switch (priceId) {
                    case 1:
                        sql += " AND po.price <= 1";
                        break;
                    case 2:
                        sql += " AND po.price >=1 AND po.price <=2 ";
                        break;
                    case 3:
                        sql += " AND po.price >=2 AND po.price <=3 ";
                        break;
                    case 4:
                        sql += " AND po.price >=3 AND po.price <=5 ";
                        break;
                    case 5:
                        sql += " AND po.price >=5 AND po.price <=7 ";
                        break;
                    case 6:
                        sql += " AND po.price >=7 AND po.price <=10 ";
                        break;
                    case 7:
                        sql += " AND po.price >=10 AND po.price <=15 ";
                        break;
                    case 8:
                        sql += " AND po.price >=15 AND po.price <=20 ";
                        break;
                    case 9:
                        sql += " AND po.price >=20 ";
                        break;
                    default:
                        break;
                }
            }
            if (areaId != -1 && areaId != 0) {
                switch (priceId) {
                    case 1:
                        sql += " AND area <= 20";
                        break;
                    case 2:
                        sql += " AND area >=20 AND area <=30 ";
                        break;
                    case 3:
                        sql += " AND area >=30 AND area <=50 ";
                        break;
                    case 4:
                        sql += " AND area >=50 AND area <=60 ";
                        break;
                    case 5:
                        sql += " AND area >=60 AND area <=70 ";
                        break;
                    case 6:
                        sql += " AND area >=70 AND area <=80 ";
                        break;
                    case 7:
                        sql += " AND area >=80 AND area <=90 ";
                        break;
                    case 8:
                        sql += " AND area >=90 AND area <=100 ";
                        break;
                    case 9:
                        sql += " AND area >=100 ";
                        break;
                }
            }

            PreparedStatement stm = connection.prepareStatement(sql);
            for (Map.Entry<Integer, Object[]> entry
                    : params.entrySet()) {
                Integer index = entry.getKey();
                Object[] value = entry.getValue();
                String type = value[0].toString();
                if (type.equals(Integer.class.getName())) {
                    stm.setInt(index, (Integer) value[1]);
                } else if (type.equals(Integer.class.getName())) {
                    stm.setInt(index, (Integer) value[1]);
                } else if (type.equals(Integer.class.getName())) {
                    stm.setInt(index, (Integer) value[1]);
                }
            }

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

        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
    }

    public void approve(int id) {
        try {
            String sql = "UPDATE [noknok].[dbo].[Post]\n"
                    + "   SET [status] = 'true'\n"
                    + " WHERE id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
