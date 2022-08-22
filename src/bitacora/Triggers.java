package bitacora;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Triggers {
    
    public static void onAssist(){
    
        String triggerName = "onAssist";
        String description = "Registro de asistencia";
        
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String drop_sql = "DROP TRIGGER IF EXISTS "+triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();
            
            String sql = "CREATE TRIGGER "+triggerName+" AFTER INSERT ON assistance "+
                    "FOR EACH ROW "+
                        "BEGIN "+
                            "INSERT INTO bitacora(userID, action, createdAt) " +
                            "VALUES(NEW.userID, ?, CURRENT_TIMESTAMP); "+
                        "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();
         
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
     public static void onInsertTeacher(){
    
        String triggerName = "onInsertTeacher";
        String description = "Inscripcion de usuario";
        
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String drop_sql = "DROP TRIGGER IF EXISTS "+triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();
            
            String sql = "CREATE TRIGGER "+triggerName+" AFTER INSERT ON users "+
                    "FOR EACH ROW "+
                        "BEGIN "+
                            "INSERT INTO bitacora(userID, action, createdAt) " +
                            "VALUES(NEW.id, ?, CURRENT_TIMESTAMP); "+
                        "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();
         
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
      public static void onDeleteTeacher(){
    
        String triggerName = "onDeleteTeacher";
        String description = "Eliminación de usuario";
        
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String drop_sql = "DROP TRIGGER IF EXISTS "+triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();
            
            String sql = "CREATE TRIGGER "+triggerName+" AFTER DELETE ON users "+
                    "FOR EACH ROW "+
                        "BEGIN "+
                            "INSERT INTO bitacora(userID, action, createdAt) " +
                            "VALUES(OLD.id, ?, CURRENT_TIMESTAMP); "+
                        "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();
         
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
          
     public static void onInsertAdmin(){
    
        String triggerName = "onInsertAdmin";
        String description = "Inscripcion de Administrador";
        
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String drop_sql = "DROP TRIGGER IF EXISTS "+triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();
            
            String sql = "CREATE TRIGGER "+triggerName+" AFTER INSERT ON admins "+
                    "FOR EACH ROW "+
                        "BEGIN "+
                            "INSERT INTO bitacora(userID, action, createdAt) " +
                            "VALUES(NEW.id, ?, CURRENT_TIMESTAMP); "+
                        "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();
         
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
      
      
      public static void onDeleteAdmin(){
    
        String triggerName = "onDeleteAdmin";
        String description = "Eliminación de Administrador";
        
        Connection connection = env.ConnectionDB.getConnection();
        
        try {
            String drop_sql = "DROP TRIGGER IF EXISTS "+triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();
            
            String sql = "CREATE TRIGGER "+triggerName+" AFTER DELETE ON admins "+
                    "FOR EACH ROW "+
                        "BEGIN "+
                            "INSERT INTO bitacora(userID, action, createdAt) " +
                            "VALUES(OLD.id, ?, CURRENT_TIMESTAMP); "+
                        "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();
         
        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void startTriggers(){
        onAssist();
        onInsertTeacher();
        onDeleteTeacher();
        onInsertAdmin();
        onDeleteAdmin();
    }
    
}
