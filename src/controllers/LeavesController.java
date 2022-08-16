package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LeavesController {

    public static boolean RegisterLeave(String id, String init, String end, String type, String description) {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("INSERT INTO `leaves` (`userID`, `init`, `end`, `type`, `description`) VALUES (?, ?, ?, ?,?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, init);
            st.setString(3, end);
            st.setString(4, type);
            st.setString(5, description);
            st.execute();

            return true;

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static ResultSet getLeaves(String userID) {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("SELECT * FROM leaves WHERE userID = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, userID);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
