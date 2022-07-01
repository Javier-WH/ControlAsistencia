
package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AssistenceController {
    
    
    public static boolean insertAssistance(String id){
               
        Connection connection  = env.ConnectionDB.getConnection();
     
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
    
    
    
    
    
    
    
    
    
    
    
}
