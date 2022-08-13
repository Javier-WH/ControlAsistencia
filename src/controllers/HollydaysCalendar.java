package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class HollydaysCalendar {

    //////////////
    public static ResultSet getHolydaysListRS() {

        Connection connection = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT * FROM `hollydays`");
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    ///////////////////////////////
    public static void deleteHolyDay(String init) {
        Connection connection = env.ConnectionDB.getConnection();
        
        if(init.contains("hasta")){
            String[] data = init.split(" ");
            init = data[0];
        }
        
        
        try {
            String sql = ("DELETE FROM `hollydays` WHERE init = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, init);
            st.execute();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /////////////////////////////////
    public static boolean insertHollyDay(String month1, String day1, String month2, String day2, String description) {

        Connection connection = env.ConnectionDB.getConnection();
        String init = month1 + "-" + day1;
        String end = month2 + "-" + day2;

        try {
            String sql = ("INSERT INTO `hollydays` (`init`, `end`, `description`) VALUES (?, ?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, init);
            st.setString(2, end);
            st.setString(3, description);

            st.execute();

            return true;

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    /////
    public static void fillDefailtHollyDaysTable() {

        //INSERT INTO `hollydays` (`id`, `init`, `end`, `description`, `createdAT`, `updatedAT`) VALUES (NULL, '1-1', '1-1', 'Año Nuevo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '4-19', '4-19', 'Declaración de la Independencia', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '5-1', '5-1', 'Día del Trabajo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '24-6', '24-6', 'Batalla de Carabobo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '5-7', '5-7', 'Día de la Independencia', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '24-7', '24-7', 'Natalicio de Simón Bolívar', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '12-10', '12-10', 'Día de la Resistencia Indígena', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '24-12', '24-12', 'Víspera de Navidad', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '25-12', '25-12', 'Navidad', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '31-12', '31-12', 'Fin de año', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)
        ResultSet rs = getHolydaysListRS();
        int rows = 0;
        try {
            if (rs.last()) {
                rows = rs.getRow();
                rs.beforeFirst();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (rows == 0) {
            String sql = "INSERT INTO `hollydays` (`id`, `init`, `end`, `description`, `createdAT`, `updatedAT`) VALUES (NULL, '1-1', '1-1', 'Año Nuevo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '4-19', '4-19', 'Declaración de la Independencia', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '5-1', '5-1', 'Día del Trabajo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '6-24', '6-24', 'Batalla de Carabobo', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '5-7', '5-7', 'Día de la Independencia', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '7-24', '7-24', 'Natalicio de Simón Bolívar', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '10-12', '10-12', 'Día de la Resistencia Indígena', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '12-24', '12-24', 'Víspera de Navidad', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '12-25', '12-25', 'Navidad', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP), (NULL, '12-31', '12-31', 'Fin de año', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
            controllers.CheckDB.executeSQLQuery(sql);
        }

    }
    
    ///////
    
    public static String isHollyDay(String date){
        try {
            int month = Integer.parseInt(date.split("-")[0]);
            int day = Integer.parseInt(date.split("-")[1]);
   
            ResultSet rs = getHolydaysListRS();
            while (rs.next()) {
                
                int monthInit = Integer.parseInt(rs.getString("init").split("-")[0]);
                int dayInit = Integer.parseInt(rs.getString("init").split("-")[1]);
                int monthEnd = Integer.parseInt(rs.getString("end").split("-")[0]);
                int dayEnd = Integer.parseInt(rs.getString("end").split("-")[1]);
           
                if(monthInit == monthEnd){
                    if(day >= dayInit && day <= dayEnd){   
                        return rs.getString("description");
                    }
                }
                
                if(month >= monthInit && month <= monthEnd){
                    if(month == monthEnd){
                        if(day <= dayEnd){
                         return rs.getString("description");
                        }
                    }
                    if(month == monthInit){   
                         if(day >= dayInit){
                           return rs.getString("description");
                        }
                    }
                }
            }         
        } catch (NumberFormatException | SQLException e) {
        }
        return "false";
    }

}
