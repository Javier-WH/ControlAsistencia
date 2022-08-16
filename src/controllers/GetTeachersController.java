package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetTeachersController {
    
    public static ResultSet getTeachers(){
        Connection connection  = env.ConnectionDB.getConnection();
                
        try {
            String sql = ("SELECT * FROM `users`");
            PreparedStatement st = connection.prepareStatement(sql);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            return null;
        }
 
    }
    
    //////////////
    
    public static ResultSet getTeachers(String ci){
        Connection connection  = env.ConnectionDB.getConnection();
                
        try {
            String sql = ("SELECT * FROM `users` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            return st.executeQuery();
            
        } catch (HeadlessException | SQLException e) {
            return null;
        }
 
    }
    
}
