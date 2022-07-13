package env;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class ConnectionDB {
    private static Connection connection = null;
    private static int ERROR_CODE = 0;

    public static void setConnection(Connection con){
        connection = con;
    }
    
   
    public static Connection getConnection(){
        return connection;
    }
    
    public static int getERROR_CODE(){
        return ERROR_CODE;
    }
    
    public static void setERROR_CODE(int error){
        ERROR_CODE = error;
    }
    
    public static boolean connectionDB(){
        String url = env.Enviroment.getContectionString();
        String user = env.Enviroment.getDbUser();
        String password = env.Enviroment.getDbPassword();
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            setConnection(conn);
            return true;
        } catch (SQLException e) {
            setERROR_CODE(e.getErrorCode());
            return false;
        }catch(Exception x){
            setERROR_CODE(-1);
        }
        return false;
    }
    
    
    public static void getError(){
        
        int errorCode = getERROR_CODE();
        String message = "";
        
        switch (errorCode) {
            case 1049:
                message = "No existe la base de datos " + env.Enviroment.getDatabaseName() + " Error -> " + errorCode;
                break;
            case 1045:
                message = "Las credenciales para conectarse a la base de datos no son validas Error -> " + errorCode;
                break;
            case 0:
                message = "No se ha podido conectar con la base de datos Error -> " + errorCode;
                break;
            default:
                message = "Ha ocurrido un error inesperado... Error -> " + errorCode;
        }
        
        
        JOptionPane.showMessageDialog(null, message);
    }
    
    
}
