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
            String sql = ("SELECT * FROM leaves WHERE userID = ? order by id desc");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, userID);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    ////
    public static ResultSet getLeavesList() {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("SELECT * FROM users inner join leaves on users.id = leaves.userID");
            PreparedStatement st = connection.prepareStatement(sql);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //////////////////////////
    public static boolean isOnLeave(int selectedMonth, int selectedDay, int month1, int month2, int day1, int day2) {

        if (month1 == month2 && month1 == selectedMonth) {
            if (day1 >= selectedDay && day2 <= selectedDay) {
                return true;
            }
        } else {
            if (selectedMonth >= month1 && selectedMonth <= month2) {
                if (selectedMonth == month1) {
                    if (selectedDay >= day1) {
                        return true;
                    }
                } else if (selectedMonth == month2) {
                    if (selectedDay <= day2) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /////////////////////////
    public static boolean checkLeave(String ci) {
        
        ResultSet rs = controllers.GetTeachersController.getTeachers(ci);
        
        try {
            if(rs.next()){
                
                String id = rs.getString("id");
                
                ResultSet rsLeaves = getLeaves(id);
                
                if(rsLeaves.next()){
                    
                    int currentMont = Integer.parseInt(libraries.GetDate.getCurrentMonth());
                    int currentDay = Integer.parseInt(libraries.GetDate.getDayOfMonth());
                    
                    String date1[] = rsLeaves.getString("init").split("-");
                    String date2[] = rsLeaves.getString("end").split("-");
                    
                    int month1 = Integer.parseInt(date1[0]);
                    int day1 = Integer.parseInt(date1[1]);
                    int month2 = Integer.parseInt(date2[0]);
                    int day2 = Integer.parseInt(date2[1]);
                    
                    return isOnLeave(currentMont, currentDay, month1, month2, day1, day2);
                }  
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return false;
    }

}
