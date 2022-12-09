package controllers;

import Actors.Admins;
import Actors.Questions;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class InsertAdminController {

    public static boolean insertAdmin(Admins admin) {

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("INSERT INTO `admins` (`name`, `ci`, `user`, `password`, `email`, `phone`, `address`) VALUES (?, ?, ?, ?, ?, ?, ?)");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, admin.getName());
            st.setString(2, admin.getCI());
            st.setString(3, admin.getUser());
            st.setString(4, libraries.Encript.encriptar(admin.getPassword(), env.GetLocalConfig.getKey()));
            st.setString(5, admin.getEmail());
            st.setString(6, admin.getPhoneNumber());
            st.setString(7, admin.getAddress());
            st.execute();

           
   
        

            return true;

        } catch (HeadlessException | SQLException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | UnsupportedEncodingException | NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    ///
    public static boolean insertQuestions(String ci, Questions questions) {
        Connection connection = env.ConnectionDB.getConnection();
            
        
        try {

            String sqlCi = "SELECT id from admins where ci = ?";
            PreparedStatement stCi = connection.prepareStatement(sqlCi);
            stCi.setString(1, ci);
            ResultSet rsCi = stCi.executeQuery();

            if (rsCi.next()) {
                int id = rsCi.getInt("id");
                
                String sql = "INSERT INTO `questionsandanswers` (`question1`, `question2`, `answer1`, `answer2`, `userId`, `question3`, `question4`, `answer3`, `answer4`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1,  libraries.Encript.encriptar( questions.getQuestion1() , env.GetLocalConfig.getKey()));
                st.setString(2,  libraries.Encript.encriptar( questions.getQuestion2() , env.GetLocalConfig.getKey()));
                st.setString(3, libraries.Encript.encriptar( questions.getAnswer1(), env.GetLocalConfig.getKey()));
                st.setString(4, libraries.Encript.encriptar( questions.getAnswer2(), env.GetLocalConfig.getKey()));
                st.setString(5, String.valueOf(id));
                st.setString(6, libraries.Encript.encriptar( questions.getQuestion3(), env.GetLocalConfig.getKey()));
                st.setString(7, libraries.Encript.encriptar( questions.getQuestion4(), env.GetLocalConfig.getKey()));
                st.setString(8, libraries.Encript.encriptar( questions.getAnswer3(), env.GetLocalConfig.getKey()));
                st.setString(9, libraries.Encript.encriptar( questions.getAnswer4(), env.GetLocalConfig.getKey()));
                st.execute();
                return true;
            }
                return false;
        } catch (SQLException | UnsupportedEncodingException |NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException  e) {
            System.out.println(e.getMessage());
               return false;
        }

   
    }

}
