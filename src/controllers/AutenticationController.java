package controllers;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;

public class AutenticationController {

    //Verifica que un administrador está registrado en la base de datos
    @SuppressWarnings("UnusedAssignment")
    public static String autenticateAdmin(String user, String password) {

        if (user.isEmpty() || password.isEmpty()) {
            return "Debe llenar todos los campos";
        }

        Connection connection = env.ConnectionDB.getConnection();
        String message = "";

        ResultSet rs = null;
        try {
            String sql = ("SELECT * FROM `admins` WHERE user = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            rs = st.executeQuery();

            if (rs.next()) {

                if (!libraries.Encript.desencriptar(rs.getString("password"), env.GetLocalConfig.getKey()).equals(password)) {
                    message = "La contraseña suministrada es incorrecta";
                } else {
                    message = "ACCESS-GRANTED";
                }

            } else {
                message = "El usuario suministrado no está registrado";
            }

        } catch (HeadlessException | SQLException | UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            return e.getMessage();
        }
        return message;
    }

    //regresa el id
    public static String autenticateUser(String ci, String password) {

        if (ci.isEmpty() || password.isEmpty()) {
            return "Debe llenar todos los campos";
        }

        Connection connection = env.ConnectionDB.getConnection();
        String message = "";

        ResultSet rs = null;
        try {
            String sql = ("SELECT * FROM `users` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            rs = st.executeQuery();

            if (rs.next()) {
                if (!libraries.Encript.desencriptar(rs.getString("password"), env.GetLocalConfig.getKey()).equals(password)) {
                    message = "La contraseña suministrada es incorrecta";
                } else {
                    message = rs.getString("id");
                }
            } else {
                message = "El usuario suministrado no está registrado";
            }

        } catch (HeadlessException | SQLException | UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            return e.getMessage();
        }
        return message;
    }

    ///////////////////////////////////////
    public static ResultSet getUserData(String ci) {

        Connection connection = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT * FROM `users` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static ResultSet getAdminData(String ci) {

        Connection connection = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT * FROM `admins` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    //////////////////////////////

    public static ResultSet getAdminDataByUser(String user) {

        Connection connection = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT * FROM `admins` WHERE user = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /////////////////
    public static boolean userExist(String CI) {

        ResultSet rs = getUserData(CI);

        try {
            rs.last();
            int exist = rs.getRow();

            if (exist > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(0);
        }

        return false;
    }
    /////////////////////////

    public static boolean adminExist(String CI) {

        ResultSet rs = getAdminData(CI);

        try {
            rs.last();
            int exist = rs.getRow();

            if (exist > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(0);
        }

        return false;
    }

}
