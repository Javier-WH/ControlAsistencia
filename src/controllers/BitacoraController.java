package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BitacoraController {

    public static ResultSet getBitacora() {

        Connection connection = env.ConnectionDB.getConnection();
        try {
           // String sql = ("select bitacora.admin, bitacora.action, bitacora.createdAt as date, users.name, users.lastName, users.ci from bitacora inner join users on bitacora.userID = users.id where bitacora.admin = 0 union all select bitacora.admin, bitacora.action, bitacora.createdAt as date, admins.name, admins.user, admins.ci from bitacora inner join admins on bitacora.userID = admins.id where bitacora.admin =1 order by date desc");
          
           String sql = "SELECT * FROM gerardo.bitacora order by createdAt desc";
           
           PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
