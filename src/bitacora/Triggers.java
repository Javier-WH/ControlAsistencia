package bitacora;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Triggers {

    public static void onAssist() {

        String triggerName = "onAssist";
        String description = "Registro de asistencia";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON assistance "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.userID, ?, CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertTeacher() {

        String triggerName = "onInsertTeacher";
        String description = "Inscripcion de usuario";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON users "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id, ?, CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onDeleteTeacher() {

        String triggerName = "onDeleteTeacher";
        String description = "Eliminación de usuario";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER DELETE ON users "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(OLD.id, ?, CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertAdmin() {

        String triggerName = "onInsertAdmin";
        String description = "Inscripcion de Administrador";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON admins "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id, ?, CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onDeleteAdmin() {

        String triggerName = "onDeleteAdmin";
        String description = "Eliminación de Administrador";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER DELETE ON admins "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(OLD.id, ?, CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertHollyday() {

        String triggerName = "onInsertHollyday";
        String description = "Agregado dia feriado";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON hollydays "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id, CONCAT(? , ': ', ' fecha: ', NEW.init, ' hasta ', NEW.end ), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onDeleteHollyday() {

        String triggerName = "onDeleteHollyday";
        String description = "Eliminado dia feriado";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER DELETE ON hollydays "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(OLD.id, CONCAT(? , ': ', ' fecha: ', OLD.init, ' hasta ', OLD.end ), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertLeaves() {

        String triggerName = "onInsertLeaves";
        String description = "Permiso agregado";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON leaves "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id,CONCAT(? , ' al usuario ID: ', NEW.userID, ', desde ', NEW.init, ' hasta ', NEW.end), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, description);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertLog(String description, String user){
        
    
        
        Connection connection = env.ConnectionDB.getConnection();
      
        
        ResultSet rs = controllers.AutenticationController.getAdminDataByUser(user);
           
        try {
            if(rs.next()){
                String id = rs.getString("id");
                String sql = "INSERT INTO bitacora(userID, action, createdAt) VALUES(?,?, CURRENT_TIMESTAMP)";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, id);
                st.setString(2, description); 
                st.execute();
            }else{
                String sql = "INSERT INTO bitacora(userID, action, createdAt) VALUES(0,CONCAT(?, ', Usuario: ', ?), CURRENT_TIMESTAMP)";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, description); 
                st.setString(2, user);
                st.execute();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void startTriggers() {
        onAssist();
        onInsertTeacher();
        onDeleteTeacher();
        onInsertAdmin();
        onDeleteAdmin();
        onInsertHollyday();
        onDeleteHollyday();
        onInsertLeaves();
    }

}
