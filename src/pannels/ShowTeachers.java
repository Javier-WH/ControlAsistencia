package pannels;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowTeachers extends javax.swing.JFrame {

    public ShowTeachers() {
        initComponents();
        fillTable();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         this.setSize((int)(screenSize.width * 0.8), 550);
         
          this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }
    
    private void fillTable(){
     DefaultTableModel model = (DefaultTableModel)tblTeachers.getModel();
        model.setRowCount(0);
        ResultSet rs = controllers.GetTeachersController.getTeachers();
        try {
            while (rs.next()) { 
                model.addRow(new Object[]{rs.getString("ci"), rs.getString("lastName")+" "+rs.getString("name"), rs.getString("phone"), rs.getString("email"), rs.getString("address")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getContentPane(), "Ha ocurrido un error al intentar llenar la tabla");
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeachers = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Docentes del sistema");

        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setText("Atras");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Apellidos y Nombres", "Telefono", "Correco Electronico", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTeachersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTeachers);

        btnEliminar.setText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String opt = JOptionPane.showInputDialog(null, "Introduce la cedula del docente a eliminar");
        
        if(opt != null && libraries.RegEx.isMatch("^[0-9]*$", opt)){
           ResultSet rs = controllers.AutenticationController.getUserData(opt);
           
            try {
                if(rs.next()){
                 
                int proced = JOptionPane.showOptionDialog(this, "¿Desea eliminar al docente "+rs.getString("name")+ " "+ rs.getString("lastName") + "?", "¡¡¡¡Advertencia!!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Eliminar", "NO eliminar"}, "default");
                    
                    if(proced == JOptionPane.YES_OPTION){
                        String id = rs.getString("id");
                        boolean deleteUser = controllers.RemoveUserController.deleteUserByID(id);
                        if(deleteUser){
                            fillTable();
                        }else{
                            JOptionPane.showMessageDialog(this, "No se ha podido eliminar al docente");
                        }
                    } 
                } 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
  
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblTeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTeachersMouseClicked
        // TODO add your handling code here:
        libraries.ShowUserInfo.showUserInfo(tblTeachers, this);
    }//GEN-LAST:event_tblTeachersMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTeachers;
    // End of variables declaration//GEN-END:variables
}
