package controllers;

import Actors.Users;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MakeUser {
    
    
    public static Users makeNewUser(String CI){
    
        ResultSet rs = controllers.AutenticationController.getUserData(CI);
        
        try {
            if(rs.next()){
                Users user = new Users();
                user.setName(rs.getString("name"));
                user.setLastName(rs.getString("lastName"));
                user.setCI(rs.getString("ci"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNumber(rs.getString("phone"));
                user.setCharge(rs.getString("charge"));
                return user;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    
    
}
