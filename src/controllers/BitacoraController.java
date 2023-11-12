package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BitacoraController {

    public static ResultSet getBitacora() {

        Connection connection = env.ConnectionDB.getConnection();
        try {           
           String sql = "SELECT * FROM bitacora order by createdAt desc;";
           PreparedStatement st = connection.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           return rs;
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
        return null;
    }
}
