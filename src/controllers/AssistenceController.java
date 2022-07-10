package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AssistenceController {

    public static boolean insertAssistance(String id) {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("INSERT INTO `assistance` (`userID`) VALUES (?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.execute();

            return true;

        } catch (HeadlessException | SQLException e) {
            return false;
        }
    }
    
    ///////////////////////////////////////
    
    public static ResultSet getAssistanceListByDate(String date){
       
        Connection connection  = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT users.id, users.name, users.lastName, users.ci, users.charge FROM `users` INNER JOIN `assistance` ON users.id = assistance.userID AND DATE(assistance.createdAt) = DATE(?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, date);
            ResultSet rs = st.executeQuery();
             return rs;  
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
         return null;
    } 

}
