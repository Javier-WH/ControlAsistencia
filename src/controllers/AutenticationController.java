package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AutenticationController {
    
    //Verifica que un administrador está registrado en la base de datos
    @SuppressWarnings("UnusedAssignment")
    public static String autenticateAdmin(String user, String password){
        
        if(user.isEmpty() || password.isEmpty()){
            return "Debe llenar todos los campos";
        }
        
        Connection connection  = env.ConnectionDB.getConnection();
        String message = "";
        
        ResultSet rs= null;
        try {
            String sql = ("SELECT * FROM `admins` WHERE user = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            rs = st.executeQuery();
     
            if(rs.next()){
                if(!rs.getString("password").equals(password)){
                    message = "La contraseña suministrada es incorrecta";
                }else{
                    message = "ACCESS-GRANTED";
                }
            }else{
                message = "El usuario suministrado no está registrado"; 
            }
            
        } catch (HeadlessException | SQLException e) {
           return e.getMessage();
        }
        return message;
    } 
    
    
    public static String autenticateUser(String ci, String password){
        
        if(ci.isEmpty() || password.isEmpty()){
            return "Debe llenar todos los campos";
        }
        
        Connection connection  = env.ConnectionDB.getConnection();
        String message = "";
        
        ResultSet rs= null;
        try {
            String sql = ("SELECT * FROM `users` WHERE ci = ?");
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, ci);
            rs = st.executeQuery();
     
            if(rs.next()){
                if(!rs.getString("password").equals(password)){
                    message = "La contraseña suministrada es incorrecta";
                }else{
                    message = rs.getString("id");
                }
            }else{
                message = "El usuario suministrado no está registrado"; 
            }
            
        } catch (HeadlessException | SQLException e) {
           return e.getMessage();
        }
        return message;
    } 
    
}
