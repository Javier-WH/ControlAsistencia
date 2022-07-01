/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import Actors.Users;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hogar
 */
public class InsertUserController {
    
    public static boolean insertUser(Users admin){
               
        Connection connection  = env.ConnectionDB.getConnection();
     
        try {
            String sql = ("INSERT INTO `users` (`name`, `lastName`, `ci`, `password`, `email`, `phone`, `address`) VALUES (?, ?, ?, ?, ?, ?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, admin.getName());
            st.setString(2, admin.getLastName());
            st.setString(3, admin.getCI());
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
