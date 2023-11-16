package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetAdminsListController {
    
    public static ResultSet getAdminList(){
        Connection connection  = env.ConnectionDB.getConnection();
                
        try {
            String sql = ("SELECT * FROM `admins`");
            PreparedStatement st = connection.prepareStatement(sql);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            return null;
        }
    }
    
     public static ResultSet getAdmin( String ci ){
        Connection connection  = env.ConnectionDB.getConnection();
                
        try {
            String sql = ("SELECT * FROM `admins` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            return null;
        }
    }
    
}
