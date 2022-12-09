
package controllers;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class AnswersController {
 
    
    public static ResultSet getQuestions(String id) {

        Connection connection = env.ConnectionDB.getConnection();
        try {
            String sql = ("SELECT question1, question2, question3, question4 FROM questionsandanswers where userId = ?");
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
    
    public static boolean validateAnswers(String id, String Answer1, String Answer2, String Answer3, String Answer4){
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String sql = "SELECT answer1, answer2, answer3, answer4 FROM questionsandanswers where userId = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                //libraries.Encript.desencriptar(rs.getString("password"), env.GetLocalConfig.getKey()).equals(password)
                if( libraries.Encript.desencriptar(rs.getString("answer1"), env.GetLocalConfig.getKey()).equalsIgnoreCase(Answer1) && 
                    libraries.Encript.desencriptar(rs.getString("answer2"), env.GetLocalConfig.getKey()).equalsIgnoreCase(Answer2) &&
                    libraries.Encript.desencriptar(rs.getString("answer3"), env.GetLocalConfig.getKey()).equalsIgnoreCase(Answer3) &&
                    libraries.Encript.desencriptar(rs.getString("answer4"), env.GetLocalConfig.getKey()).equalsIgnoreCase(Answer4)){
                    return true;
                }
            }
            
            return false;
            
        } catch (SQLException |UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException |BadPaddingException e) {
            System.out.println(e.getMessage());
            return false;
        }
        
        
    }
    
}
