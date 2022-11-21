
package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersController {
 
    
    public static ResultSet getQuestions(String id) {

        Connection connection = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT question1, question2 FROM questionsandanswers where userId = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    ////////
    
    public static boolean validateAnswers(String id, String Answer1, String Answer2){
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String sql = "SELECT answer1, answer2 FROM questionsandanswers where userId = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                
                if(rs.getString("answer1").equalsIgnoreCase(Answer1) && rs.getString("answer2").equalsIgnoreCase(Answer2) ){
                    return true;
                }
            }
            
            return false;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        
        
    }
    
}
