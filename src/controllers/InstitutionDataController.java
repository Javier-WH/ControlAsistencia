package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InstitutionDataController {

    public static void setOwnerName(String institutionName) {

        if (!institutionName.isEmpty()) {
            Connection connection = env.ConnectionDB.getConnection();
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 2");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, institutionName);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar el nombre de la institución");
                System.out.println(e);
            }
        }
    }

    public static String getOwnerName() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = "SELECT * FROM `config` WHERE ID = 2";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            } else {
                return "Empty Name";
            }

        } catch (HeadlessException | SQLException e) {
            return e.getMessage();
        }
    }

    ///////////////
    public static void setOwnerAddress(String institutionAddress) {

        if (!institutionAddress.isEmpty()) {
            Connection connection = env.ConnectionDB.getConnection();
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 3");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, institutionAddress);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar la direccion de la institución");
                System.out.println(e);
            }
        }
    }

    public static String getOwnerAddress() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = "SELECT * FROM `config` WHERE ID = 3";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            } else {
                return "Empty Address";
            }

        } catch (HeadlessException | SQLException e) {
            return e.getMessage();
        }
    }

    ///////////////////////////////
    public static void setDirectorName(String name) {

        if (!name.isEmpty()) {
            Connection connection = env.ConnectionDB.getConnection();
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 4");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, name);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar el nombre del director");
                System.out.println(e);
            }
        }
    }

    public static String getDirectorName() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = "SELECT * FROM `config` WHERE ID = 4";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            } else {
                return "Empty Name";
            }

        } catch (HeadlessException | SQLException e) {
            return e.getMessage();
        }
    }

    
    
      ///////////////////////////////
    public static void setDirectorLastName(String name) {

        if (!name.isEmpty()) {
            Connection connection = env.ConnectionDB.getConnection();
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 5");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, name);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar el Apellido del director");
                System.out.println(e);
            }
        }
    }

    public static String getDirectorLastName() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = "SELECT * FROM `config` WHERE ID = 5";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            } else {
                return "Empty Last name";
            }

        } catch (HeadlessException | SQLException e) {
            return e.getMessage();
        }
    }
    
     ///////////////////////////////
    public static void setDirectorCi(String CI) {

        if (!CI.isEmpty()) {
            Connection connection = env.ConnectionDB.getConnection();
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 6");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, CI);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar la cedula del director");
                System.out.println(e);
            }
        }
    }

    public static String getDirectorCi() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = "SELECT * FROM `config` WHERE ID = 6";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            } else {
                return "Empty CI";
            }

        } catch (HeadlessException | SQLException e) {
            return e.getMessage();
        }
    }
    
     ///////////////////////////////
    public static void setWorkLetterText(String text) {

        if (!text.isEmpty()) {
            Connection connection = env.ConnectionDB.getConnection();
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 7");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, text);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar la carta de trabajo");
                System.out.println(e);
            }
        }
    }

    public static String getWorkLetterText() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = "SELECT * FROM `config` WHERE ID = 7";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            } else {
                return "Empty CI";
            }

        } catch (HeadlessException | SQLException e) {
            return e.getMessage();
        }
    }
    
    
}
