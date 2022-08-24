package controllers;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CheckDB {
    private static  String[] list = {"admins", "assistance", "config", "users", "hollydays", "leaves", "bitacora"};
    
    
    public static ResultSet getTablesList() {
        Connection connection = env.ConnectionDB.getConnection();

        try {
            String sql = ("SHOW TABLES");
            PreparedStatement st = connection.prepareStatement(sql);
            return st.executeQuery();

        } catch (HeadlessException | SQLException e) {
            return null;
        }
    }
    ////////////////////
    
    public static String checkIstablesExists(){
        ResultSet rs = getTablesList();
        ArrayList<String> Resultlist = new ArrayList();
       
     
        try {
            while(rs.next()){
              Resultlist.add(rs.getString(1));
            }             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al verificar las tablas" + ex.getMessage());
        }
        
        for (String list1 : list) {
            if (!Resultlist.contains(list1)) {
                return list1;
            }
        }
        return "OK";
    }
    
    ///////////////////////////
    
   
    public static void executeSQLQuery(String sql) {
        Connection connection = env.ConnectionDB.getConnection();

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }
 //////////////////////////////
    public static void createTable(String tableName){
       
        if(tableName.equals("admins")){
            executeSQLQuery("CREATE TABLE `admins` ( `id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(255) NOT NULL , `user` VARCHAR(255) NOT NULL , `password` VARCHAR(255) NOT NULL , `ci` INT NOT NULL , `email` VARCHAR(255) NOT NULL , `phone` VARCHAR(255) NOT NULL , `address` VARCHAR(255) NOT NULL , `createAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updateAt` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`id`)) ENGINE = InnoDB");
            return;
        }
        if(tableName.equals("assistance")){
            executeSQLQuery("CREATE TABLE `assistance` ( `id` INT NOT NULL AUTO_INCREMENT , `userID` INT NOT NULL , `createdAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedAT` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`id`)) ENGINE = InnoDB;");
            return;
        }
        if(tableName.equals("config")){
            executeSQLQuery("CREATE TABLE `config` ( `ID` INT NOT NULL AUTO_INCREMENT , `data` VARCHAR(255) NOT NULL , `value` VARCHAR(1000) NOT NULL , `createdAT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedAt` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`ID`)) ENGINE = InnoDB");
            return;
        }
        if(tableName.equals("users")){
            executeSQLQuery("CREATE TABLE `users` ( `id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(255) NOT NULL , `lastName` VARCHAR(255) NOT NULL , `ci` VARCHAR(255) NOT NULL , `password` VARCHAR(255) NOT NULL , `charge` VARCHAR(255) NOT NULL , `email` VARCHAR(255) NOT NULL , `phone` VARCHAR(255) NOT NULL , `address` VARCHAR(255) NOT NULL , `createdAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedAT` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`id`)) ENGINE = InnoDB");
            return;
        }
        
        if(tableName.equals("hollydays")){
            executeSQLQuery("CREATE TABLE `hollydays` ( `id` INT NOT NULL AUTO_INCREMENT , `init` VARCHAR(30) NOT NULL , `end` VARCHAR(30) NOT NULL , `description` VARCHAR(255) NOT NULL , `createdAT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedAT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`id`)) ENGINE = InnoDB;");
            return;
        }
        
        if(tableName.equals("leaves")){
            executeSQLQuery("CREATE TABLE `leaves` ( `id` INT NOT NULL AUTO_INCREMENT , `userID` INT NOT NULL , `init` VARCHAR(30) NOT NULL , `end` VARCHAR(30) NOT NULL , `type` VARCHAR(255) NOT NULL , `description` VARCHAR(255) NOT NULL , `createdAT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , `updatedAT` TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP , PRIMARY KEY (`id`)) ENGINE = InnoDB");
            return;
        }
        
          if(tableName.equals("bitacora")){
            executeSQLQuery("CREATE TABLE `bitacora` (`id` INT NOT NULL AUTO_INCREMENT, `userID` INT NOT NULL, admin` TINYINT NULL DEFAULT 0, `action` VARCHAR(255) NOT NULL, `createdAt` TIMESTAMP(6) NOT NULL, PRIMARY KEY (`id`)) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_spanish_ci"); 
        }


    }
    
    /////////
    
    public static boolean checkConfigTableContent(){

        Connection connection = env.ConnectionDB.getConnection();

        try {
            int rows = 0;
            String sql = ("SELECT * FROM `config`");
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.last()) {
                rows = rs.getRow();
                rs.beforeFirst();
            }
            if(rows < 8){
                return false;
                
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return true;
    }
    
    public static void fillConfigTable(){

        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'logopath', 'C:\\Users\\Hogar\\Documents\\NetBeansProjects\\AssistControl\\src\\images\\logo.png', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'ownerName', 'Escuela Abelardo Méndez', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'ownerAddress', 'Urbanización Dr. José Francisco Torrealba', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'directorName', 'Pedro', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'directorLastName', 'Infante', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'directorCi', '17583656', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'workLetterText', '    Quien suscribe<EMISOR>, titular de la cédula de identidad <CEDULAEMISOR>, <CARGOEMISOR> de <NOMBREINSTITUCION>, que funciona en <DIRECCIONEMISOR>, hace constar por medio de la presente que el ciudadano(a) <NOMBRERECEPTOR>, titular de la cédula de identidad <CEDULARECEPTOR>, se desempeña como <CARGORECEPTOR> en la<NOMBREINSTITUCION>, y en la actualidad cuenta con <TIEMPOSERVICIO> de servicio.', CURRENT_TIMESTAMP)");
        executeSQLQuery("INSERT INTO `config` (`ID`, `data`, `value`, `createdAT`) VALUES (NULL, 'workLetterText2', '   Constancia que se expide de parte interesada a los <DIASEMISION> días del mes de <MESEMISION> del año <ANOEMISION>', CURRENT_TIMESTAMP)");
                
    }
    
        public static boolean checkAdminTableContent(){

        Connection connection = env.ConnectionDB.getConnection();

        try {
            int rows = 0;
            String sql = ("SELECT * FROM `admins`");
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
               return true;
            } 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
}


