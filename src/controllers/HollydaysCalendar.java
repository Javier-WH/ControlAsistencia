package controllers;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;


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
    
    //////////////
    
    
        public static ResultSet getHolydaysListRS(){
   
         Connection connection  = env.ConnectionDB.getConnection();
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
    
    public static boolean isHollyDay(String date){
        
        ArrayList<String> hollyDayList = getHolydaysList();
        
        if(hollyDayList.contains(date)){
            return true;
        }
        return false;
    }
    
    /////////////////////////////////
    
    
    public static boolean insertHollyDay(String month, String day, String description){
        
           Connection connection  = env.ConnectionDB.getConnection();
           String date = month + "-"+day;
           
        try {
            String sql = ("INSERT INTO `hollydays` (`date`, `description`) VALUES (?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, date);
            st.setString(2, description);
     
            st.execute();
     
           return true;
            
        } catch (HeadlessException | SQLException  e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
         return false;
    }
    
        
        
    
    
}
