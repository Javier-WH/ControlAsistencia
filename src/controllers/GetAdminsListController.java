
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
    
}
