
package env;

import Actors.Users;
import java.awt.Container;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Enviroment {
    
    ////////// database connection enviroment viables
    private static String databaseName = "assistcontrol";
    private static String databaseAddress = "jdbc:mysql://localhost:3306/";
    private static String dbUser = "root";
    private static String dbPassword = "";
    private static String logoIconPath = System.getProperty("user.dir") + "\\src\\images\\logo.png";
    private static String BackgroundPath =  System.getProperty("user.dir") + "\\src\\images\\plazaBolivar1.jpg";
    private static String Background2Path =  System.getProperty("user.dir") + "\\src\\images\\iglesia1.jpg";
    private static String Background3Path =  System.getProperty("user.dir") + "\\src\\images\\plazaBolivar2.jpg";
    private static String titlePath =  System.getProperty("user.dir") + "\\src\\images\\title.png";
    private static String logoCartaTrabajoPath =  System.getProperty("user.dir") + "\\src\\images\\logoCartaTrabajo.png";
    private static String textConstanciaTrabajo = "   Quien suscribe, <EMISOR>, titular de la cédula de indentidad N° <CEDULAEMISOR>, <CARGOEMISOR> de <NOMBREINSTITUCION>, que funciona en <DIRECCIONEMISOR>, hace constar por medio de la presente que el ciudadano <NOMBRERECEPTOR>, titular de la cédula de identidad <CEDULARECEPTOR>, se desempeña como <CARGORECEPTOR> en la <NOMBREINSTITUCION>, y en la actualidad cuenta con <TIEMPOSERVICIO> de servicio. Constancia que se expide de parte interesaada a los <DIASEMISION> del mes de <MESEMISION> del año <ANOEMISION>"; 
    private static String ownerName = "Batalla de la victoria";  
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
    
    ////////////////////////////////////////////////background image
    
    
    public static String getBackgroundPath(){
        return BackgroundPath;
    }

    public static void setBackgroundPath(String Path) {
        BackgroundPath = Path;
    }
    
    public static ImageIcon getBackgroundIcon(int width, int height){
        return new ImageIcon(new ImageIcon(getBackgroundPath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    public static String getBackground2Path() {
        return Background2Path;
    }

    public static void setBackground2Path(String Path) {
        Background2Path = Path;
    }

    public static ImageIcon getBackground2Icon(int width, int height) {
        return new ImageIcon(new ImageIcon(getBackground2Path()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }
    
      public static String getBackground3Path() {
        return Background3Path;
    }

    public static void setBackground3Path(String Path) {
        Background3Path = Path;
    }

    public static ImageIcon getBackground3Icon(int width, int height) {
        return new ImageIcon(new ImageIcon(getBackground3Path()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }
    
    
    /////////////////////////
    
    public static String getTitlePath(){
        return titlePath;
    }
    
      public static ImageIcon getTitleIcon(int width, int height){
        return new ImageIcon(new ImageIcon(getTitlePath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }
      
      ////////////////////////////////

       public static String getLogoCartaTrabajoPath(){
        return logoCartaTrabajoPath;
    }
    
      public static ImageIcon getLogoCartaTrabajo(int width, int height){
        return new ImageIcon(new ImageIcon(getLogoCartaTrabajoPath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }
      
      ///////////////////////////////constancia de trabajo
      
      public static String getConstaciaText(){
          return textConstanciaTrabajo;
      }
      
      public static void setConstanciaText(String text){
             textConstanciaTrabajo = text;
      }
      
      //<EMISOR><CEDULAEMISOR><CARGOEMISOR><DIRECCIONEMISOR><NOMBRERECEPTOR><CEDULARECEPTOR><CARGORECEPTOR><NOMBREINSTITUCION><TIEMPOSERVICIO><DIASEMISION><MESEMISION><ANOEMISION>
      public static void setConstanciaText(Users user, Users admin, String address){
         
           String emisorName = admin.getName() + " "+ admin.getLastName();
           String emisorCi = admin.getCI();
           String emisorCharge = admin.getCharge();
           
       
           String userName = user.getName() + " " + user.getLastName();
           String userCi = user.getCI();
           String userCharge = user.getCharge();
           String userServiceTime = user.getServiceTime();
           
           Calendar cal = Calendar.getInstance();
           int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
           System.out.println(dayOfMonth);
           
           
           
           String emptyText = getConstaciaText();
           
           String text = emptyText.replace("<EMISOR>", emisorName); 
           text = text.replace("<CEDULAEMISOR>", emisorCi);
           text = text.replace("<CARGOEMISOR>", emisorCharge);
           text = text.replace("<DIRECCIONEMISOR>", address);
           text = text.replace("<NOMBRERECEPTOR>", userName);
           text = text.replace("<CEDULARECEPTOR>", userCi);
           text = text.replace("<CARGORECEPTOR>", userCharge);
           text = text.replace("<NOMBREINSTITUCION>", ownerName);
           text = text.replace("<NOMBREINSTITUCION>", ownerName);
           text = text.replace("<TIEMPOSERVICIO>", userServiceTime);
           text = text.replace("<DIASEMISION>", "36");
           text = text.replace("<MESEMISION>", "diciembre"); 
           text = text.replace("<ANOEMISION>", "1999");
          
          textConstanciaTrabajo = text;
      }
      
      
      
}////////////////////////////
    