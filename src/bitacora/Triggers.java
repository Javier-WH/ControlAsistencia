package bitacora;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Triggers {

    public static void onAssist() {

        String triggerName = "onAssist";


        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            
        String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON assistance "
            + "FOR EACH ROW "
            + "BEGIN "
            + "DECLARE userName VARCHAR(255); "
            + "DECLARE userLastName VARCHAR(255); "
            + "DECLARE userCi VARCHAR(255); "
            + "SELECT name, lastName, ci INTO userName, userLastName, userCi "
            + "FROM users "
            + "WHERE id = NEW.userID; "
            + "INSERT INTO bitacora(userID, action, createdAt) "
            + "VALUES(NEW.userID, CONCAT('Registro de asistencia del usuario ', userName, ' ', userLastName, ' C.I.: ', userCi), CURRENT_TIMESTAMP); "
            + "END";
            
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertTeacher() {

        String triggerName = "onInsertTeacher";


        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON users "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id, CONCAT('Se ha inscrito el usuario: ', NEW.name, ' ',NEW.lastName , NEW.ci), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);

            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onDeleteTeacher() {

        String triggerName = "onDeleteTeacher";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER DELETE ON users "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(OLD.id, CONCAT('Se ha eliminado el usuario: ', OLD.name, ' ',OLD.lastName , OLD.ci), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertAdmin() {

        String triggerName = "onInsertAdmin";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON admins "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id, CONCAT('Se ha agregado el administrador: ', NEW.name, ' ', NEW.ci), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onDeleteAdmin() {

        String triggerName = "onDeleteAdmin";

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER DELETE ON admins "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(OLD.id, CONCAT('Se ha eliminado el administrador: ', OLD.name, ' ', OLD.ci), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
  
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertHollyday() {

        String triggerName = "onInsertHollyday";


        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON hollydays "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.id, CONCAT('Se gragó dia feriado ', NEW.description, ': ', ' fecha: ', NEW.init, ' hasta ', NEW.end ), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onDeleteHollyday() {

        String triggerName = "onDeleteHollyday";
  

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER DELETE ON hollydays "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(OLD.id, CONCAT('Se eliminó dia feriado ', OLD.description, ': ', ' fecha: ', OLD.init, ' hasta ', OLD.end ), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
 
            st.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void onInsertLeaves() {
        
        String triggerName = "onInsertLeaves";
      

        Connection connection = env.ConnectionDB.getConnection();

        try {
            String drop_sql = "DROP TRIGGER IF EXISTS " + triggerName;
            PreparedStatement drop_st = connection.prepareStatement(drop_sql);
            drop_st.execute();

            String sql = "CREATE TRIGGER " + triggerName + " AFTER INSERT ON leaves "
                    + "FOR EACH ROW "
                    + "BEGIN "
                    + "DECLARE userName VARCHAR(255); "
                    + "DECLARE userLastName VARCHAR(255); "
                    + "DECLARE userCi VARCHAR(255); "
                    + "SELECT name, lastName, ci INTO userName, userLastName, userCi "
                    + "FROM users "
                    + "WHERE id = NEW.userID; "
                    + "INSERT INTO bitacora(userID, action, createdAt) "
                    + "VALUES(NEW.userID, CONCAT("
                    + "'Permiso registrado al usuario: ',"
                    + " userName, ' ', "
                    + "userLastName, ', ',"
                    + "'C.I. ',"
                    + " userCi, "
                    + "', desde ', "
                    + "NEW.init, "
                    + "' hasta '"
                    + ", NEW.end"
                    + "), CURRENT_TIMESTAMP); "
                    + "END";
            PreparedStatement st = connection.prepareStatement(sql);
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
                String sql = "INSERT INTO bitacora(userID, action, admin, createdAt) VALUES(?,?, 1, CURRENT_TIMESTAMP)";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, id);
                st.setString(2, description); 
                st.execute();
            }else{
            
                String sql = "INSERT INTO bitacora(userID, action, admin, createdAt) VALUES(?,?, 1, CURRENT_TIMESTAMP)";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, "0");
                st.setString(2, description); 
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
