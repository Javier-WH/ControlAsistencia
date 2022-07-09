package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RemoveUserController {
     public static boolean deleteUserByID(String id){
        
        Connection connection  = env.ConnectionDB.getConnection();
        try {
            String sql = ("DELETE FROM `users` WHERE `users`.`id` = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.execute();
            return true;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } 
    } 
}
