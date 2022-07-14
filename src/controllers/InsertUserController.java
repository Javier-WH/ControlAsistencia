package controllers;

import Actors.Users;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Hogar
 */
public class InsertUserController {
    
    public static boolean insertUser(Users admin) throws UnsupportedEncodingException, NoSuchAlgorithmException{
               
        Connection connection  = env.ConnectionDB.getConnection();
     
        try {
            String sql = ("INSERT INTO `users` (`name`, `lastName`, `ci`, `password`, `email`, `phone`, `address`, `charge`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, admin.getName());
            st.setString(2, admin.getLastName());
            st.setString(3, admin.getCI());
            st.setString(4, libraries.Encript.encriptar(admin.getPassword(), env.GetLocalConfig.getKey()));
            st.setString(5, admin.getEmail());
            st.setString(6, admin.getPhoneNumber());
            st.setString(7, admin.getAddress());
            st.setString(8, admin.getCharge());
            
            st.execute();
     
           return true;
            
        } catch (HeadlessException | SQLException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
         return false;
    }
    
}
