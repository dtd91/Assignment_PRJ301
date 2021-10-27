/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Feature;

/**
 *
 * @author dell
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String username, String password) {
        try {
            String sql = "SELECT a.username,a.password,a.displayname,f.fid,f.url,gname FROM Account a\n"
                    + "LEFT JOIN GroupAccount ga ON a.username = ga.username\n"
                    + "LEFT JOIN [Group] g ON g.gid = ga.gid\n"
                    + "LEFT JOIN GroupFeature gf ON g.gid = gf.gid\n"
                    + "LEFT JOIN Feature f ON gf.fid = f.fid \n"
                    + "WHERE a.username = ? AND a.password = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            Account account = null;
            while (rs.next()) {
                if (account == null) {
                    account = new Account();
                    account.setUsername(username);
                    account.setPassword(password);
                    account.setDisplayName(rs.getString("displayname"));
                    account.setRole(rs.getString("gname"));
                }
                int fid = rs.getInt("fid");
                if(fid!=0){
                    Feature f = new Feature();
                    f.setId(fid);
                    f.setUrl(rs.getString("url"));
                    account.getFeatures().add(f);
                }
            }
            return account;

        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String addAccount(String username, String password, String displayname){
        try {
            String sql = "INSERT INTO [Account]\n" +
                    "           ([username]\n" +
                    "           ,[password]\n" +
                    "           ,[displayname])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, displayname);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            return ex.toString();
        }
       return null;
    }
    
}
