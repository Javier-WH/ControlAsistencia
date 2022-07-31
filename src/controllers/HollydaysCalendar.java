package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class HollydaysCalendar {
    
    public static ArrayList<String> getHolydaysList(){
        ArrayList<String> hollyDays = new ArrayList<>();
         Connection connection  = env.ConnectionDB.getConnection();
     
           try {
            String sql = ("SELECT date FROM `hollydays`");
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                hollyDays.add(rs.getString("date"));
            }
            return hollyDays;
       
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
         return null;
    } 
    
    ///////////////////////////////
    
    public static boolean isHollyDay(String date){
        
        ArrayList<String> hollyDayList = getHolydaysList();
        
        if(hollyDayList.contains(date)){
            return true;
        }
        return false;
    }
    
    
    
}
