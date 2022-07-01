package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LogoController {
    
    public static void saveLogoAddress(String address){
        if(!address.isEmpty()){
            Connection connection = env.ConnectionDB.getConnection();
            
            try {
                String sql = ("UPDATE `config` SET `value` = ? WHERE `config`.`ID` = 1");
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, address);
                st.execute();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar almacenar la ruta de la imagen");
                System.out.println(e);
            }
        }
    }
    
    public static String getLogoAddress(){
        
          Connection connection = env.ConnectionDB.getConnection();
          
        try {
            String sql = "SELECT * FROM `config` WHERE ID = 1";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
              return rs.getString("value");
            }else{
                return System.getProperty("user.dir") + "\\src\\images\\logoPlaceholder.png";
            }
            
        } catch (HeadlessException | SQLException e) {
           return e.getMessage();
        }
    }
    
    public static void updateLogoAddress(){
        env.Enviroment.setLogoPath(getLogoAddress());
        
    }
}
