package controllers;

import Actors.Users;
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class GetTeachersController {

    public static ResultSet getTeachers() {
        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("SELECT * FROM `users`");
            PreparedStatement st = connection.prepareStatement(sql);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            return null;
        }

    }

    //////////////
    public static ResultSet getTeachers(String ci) {
        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("SELECT * FROM `users` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            return null;
        }
    }
    ///////////////////

    public static boolean updateTeachers(Users user) {
        Connection connection = env.ConnectionDB.getConnection();
       
        try {
            if (user.getPassword().length() > 0) {
                String sql = ("update users set name = ?, lastName = ?, password = ?, charge = ?, email = ?, phone = ?, address = ? where ci = ?");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, user.getName());
                st.setString(2, user.getLastName());
                st.setString(3, libraries.Encript.encriptar(user.getPassword(), env.GetLocalConfig.getKey()));
                st.setString(4, user.getCharge());
                st.setString(5, user.getEmail());
                st.setString(6, user.getPhoneNumber());
                st.setString(7, user.getAddress());
                st.setString(8, user.getCI());
                st.execute();
            } else {
                String sql = ("update users set name = ?, lastName = ?, charge = ?, email = ?, phone = ?, address = ? where ci = ?");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, user.getName());
                st.setString(2, user.getLastName());
                st.setString(3, user.getCharge());
                st.setString(4, user.getEmail());
                st.setString(5, user.getPhoneNumber());
                st.setString(6, user.getAddress());
                st.setString(7, user.getCI());
                st.execute();
            }
            return true;
        } catch (HeadlessException | SQLException | UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            return false;
        }
    }

}
