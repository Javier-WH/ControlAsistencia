
package env;

import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Enviroment {
    
    ////////// database connection enviroment viables
    private static String databaseName = "assistcontrol";
    private static String databaseAddress = "jdbc:mysql://localhost:3306/";
    private static String dbUser = "root";
    private static String dbPassword = "";
    private static String logoIconPath = System.getProperty("user.dir") + "\\src\\images\\logo.png";
    
    
    public static String getDbUser(){
        return dbUser;
    }
     public static String getDbPassword(){
        return dbPassword;
    }
    public static void setDbUser(String user){
        dbUser = user;
    }
    
    public static void setDbPassword(String password){
      dbPassword = password;
    }
    
    public static String getDatabaseName(){
        return databaseName;
    }
    
    public static void setDatabaseName(String name){
        databaseName = name;
    }
    
    public static String getDatabaseAddress(){
        return databaseAddress;
    }
    public static void setDatabaseAddress(String address){
        databaseAddress = address;
    }
    
    
    public static String getContectionString(){
         
         String dbName = getDatabaseName();
         
        return getDatabaseAddress()+dbName+"?useSSL=false";
    }
     
     
    //////////////////////////////////////// 
    public static void exitApp(Container pannel){
        int opt = JOptionPane.showOptionDialog(pannel, "¿Desea salir de el sistema?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Salir", "Cacelar"}, 1);
        if(opt == 0){
            System.exit(0);
        }
    }
    
    /////////////////////////logo
    
    public static String getLogoPath(){
        return logoIconPath;
    }
     public static void setLogoPath(){
        logoIconPath = System.getProperty("user.dir") + "\\src\\images\\logo.png";
    }
    
    public static void setLogoPath(String Path){
        logoIconPath = Path;
    }
    
    public static ImageIcon getLogoIcon(int width, int height){
        return new ImageIcon(new ImageIcon(getLogoPath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }
    
    
   
    
}
