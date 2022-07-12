package env;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;
import libraries.Encript;

public class GetLocalConfig {
    //default info
    
    private static String databasePathAddress = "jdbc:mysql://localhost:3306/";
    private static String databaseName = "assistcontrol";
    private static String dbUser = "root";
    private static String dbPassword = "";
    
    private static String key = "ESCUELA ABELARDO MENDEZ";
    
    //
    private static String DBApath = System.getProperty("user.dir") + "\\src\\configFiles\\DBA.ascon";
    private static String DBNpath = System.getProperty("user.dir") + "\\src\\configFiles\\DBN.ascon";
    private static String DBUpath = System.getProperty("user.dir") + "\\src\\configFiles\\DBU.ascon";
    private static String DBPpath = System.getProperty("user.dir") + "\\src\\configFiles\\DBP.ascon";
    
    
    
        
    
    public static String getDbAConfig() {
        File doc = new File(DBApath);

        try {
            Scanner obj = new Scanner(doc);
            while (obj.hasNextLine()) {
                return Encript.desencriptar(obj.nextLine(), key);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error importante, no se encuentran los archivos de configuración");
        }
        return null;
    }
    
    
    public static void setDBAConfig(String text){
        
         try
        {
            String filePath = DBApath;
            FileWriter fw = new FileWriter(filePath);    
            String lineToAppend = Encript.encriptar(text, key);    
            fw.write(lineToAppend);
            fw.close();
        }
        catch(IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)
        {
            System.out.println(e);
        }
    
    }

    
    public static void resetDBAConfig(){
        setDBAConfig(databasePathAddress);
    }
    
   
    
    public static boolean DBAFileExist(){
        
         File file = new File(DBApath);
         return file.exists();
        
    }
    
    
    ///////////////////////////////
    
    
     public static String getDbNConfig() {
        File doc = new File(DBNpath);

        try {
            Scanner obj = new Scanner(doc);
            while (obj.hasNextLine()) {
                return Encript.desencriptar(obj.nextLine(), key);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error importante, no se encuentran los archivos de configuración");
        }
        return null;
    }
    

    
    public static void setDBNConfig(String text){
        
         try
        {
            String filePath = DBNpath;
            FileWriter fw = new FileWriter(filePath);    
            String lineToAppend = Encript.encriptar(text, key);    
            fw.write(lineToAppend);
            fw.close();
        }
        catch(IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)
        {
            System.out.println(e);
        }
    
    }
 
    
    public static void resetDBNConfig(){
        setDBNConfig(databaseName);
    }
    

    
    public static boolean DBNFileExist(){
        
         File file = new File(DBNpath);
         return file.exists();
        
    }
    
    ///////////////////////////////
    
    
     public static String getDbUConfig() {
        File doc = new File(DBUpath);

        try {
            Scanner obj = new Scanner(doc);
            while (obj.hasNextLine()) {
                return Encript.desencriptar(obj.nextLine(), key);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error importante, no se encuentran los archivos de configuración");
        }
        return null;
    }
    

    
    public static void setDBUConfig(String text){
        
         try
        {
            String filePath = DBUpath;
            FileWriter fw = new FileWriter(filePath);    
            String lineToAppend = Encript.encriptar(text, key);    
            fw.write(lineToAppend);
            fw.close();
        }
        catch(IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)
        {
            System.out.println(e);
        }
    
    }
    
    
    public static void resetDBUConfig(){
        setDBUConfig(dbUser);
    }
    
   
    
    public static boolean DBUFileExist(){
        
         File file = new File(DBUpath);
         return file.exists();
        
    }
    
    
    ///////////////////////////////
    
    
    
     public static String getDbPConfig() {
        File doc = new File(DBPpath);

        try {
            Scanner obj = new Scanner(doc);
            while (obj.hasNextLine()) {
                return Encript.desencriptar(obj.nextLine(), key);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error importante, no se encuentran los archivos de configuración");
        }
        return null;
    }
    
    ////////
    
    public static void setDBPConfig(String text){
        
         try
        {
            String filePath = DBPpath;
            FileWriter fw = new FileWriter(filePath);    
            String lineToAppend = Encript.encriptar(text, key);    
            fw.write(lineToAppend);
            fw.close();
        }
        catch(IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e)
        {
            System.out.println(e);
        }
    
    }
    //////////////////
    
    public static void resetDBPConfig(){
        setDBPConfig(dbPassword);
    }
    
    ////////////////////
    
    public static boolean DBPFileExist(){
        
         File file = new File(DBPpath);
         return file.exists();
        
    }
    
    
    ///////////////////////////////
    
    
    
    
    
    

}
