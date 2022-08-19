package libraries;

import Actors.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JTable;
import pannels.TeacherDataPanel;


public class ShowUserInfo {
    
    public static void showUserInfo(JTable table, JFrame frame){
        
         int row = table.getSelectedRow();
         String ci = table.getModel().getValueAt(row, 0).toString();
         
        try {
            ResultSet rs = controllers.GetTeachersController.getTeachers(ci);
           
            if(rs.next()){
               
                Users user = new Users();
                user.setName(rs.getString("name"));
                user.setLastName(rs.getString("lastName"));
                user.setCI(rs.getString("ci"));
                user.setCharge(rs.getString("charge"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setPhoneNumber(rs.getString("phone"));
                
                String id = rs.getString("id");
                
                TeacherDataPanel tdp = new TeacherDataPanel(id, user);
                tdp.setLocationRelativeTo(frame);
                tdp.setVisible(true);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
    
    
}
