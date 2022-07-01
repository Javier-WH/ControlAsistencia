package controllers;

import Actors.Admins;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertAdminController {
    
    
    public static boolean insertAdmin(Admins admin){
               
        Connection connection  = env.ConnectionDB.getConnection();
     
        try {
            String sql = ("INSERT INTO `admins` (`name`, `ci`, `user`, `password`, `email`, `phone`, `address`) VALUES (?, ?, ?, ?, ?, ?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, admin.getName());
            st.setString(2, admin.getCI());
            st.setString(3, admin.getUser());
            st.setString(4, admin.getPassword());
            st.setString(5, admin.getEmail());
            st.setString(6, admin.getPhoneNumber());
            st.setString(7, admin.getAddress());
            
            st.execute();
     
           return true;
            
        } catch (HeadlessException | SQLException e) {
           return false;
        }
    }
}
