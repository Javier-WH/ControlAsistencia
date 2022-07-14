package controllers;

import Actors.Admins;
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


public class InsertAdminController {
    
    
    public static boolean insertAdmin(Admins admin){
               
        Connection connection  = env.ConnectionDB.getConnection();
     
        try {
            String sql = ("INSERT INTO `admins` (`name`, `ci`, `user`, `password`, `email`, `phone`, `address`) VALUES (?, ?, ?, ?, ?, ?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, admin.getName());
            st.setString(2, admin.getCI());
            st.setString(3, admin.getUser());
            st.setString(4, libraries.Encript.encriptar(admin.getPassword(), env.GetLocalConfig.getKey()));
            st.setString(5, admin.getEmail());
            st.setString(6, admin.getPhoneNumber());
            st.setString(7, admin.getAddress());
            
            st.execute();
     
           return true;
            
        } catch (HeadlessException | SQLException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | UnsupportedEncodingException | NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
           return false;
        }
    }
}
