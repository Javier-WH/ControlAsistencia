package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveAdminController {
     public static boolean deleteAdminByID(String id){
        
        Connection connection  = env.ConnectionDB.getConnection();
        try {
            String sql = ("DELETE FROM `admins` WHERE `admins`.`id` = ?");
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
