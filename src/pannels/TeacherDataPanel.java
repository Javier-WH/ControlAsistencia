package pannels;

import Actors.Users;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class TeacherDataPanel extends javax.swing.JFrame {

    Users user;
    String id;

    public TeacherDataPanel(String id, Users user) {

        this.id = id;
        this.user = user;
        initComponents();
        fillUserData();
        
        boolean status = controllers.LeavesController.checkLeave(user.getCI());
        
        if(status){
            lblStatus.setText("Esta persona está de permiso el dia de hoy");
            lblStatus.setForeground(Color.YELLOW);
        }else{
             lblStatus.setText("Esta persona NO tiene permiso el dia de hoy");
            lblStatus.setForeground(Color.WHITE);
        }
        
        
    }

    public void fillUserData() {
        DefaultTableModel model = (DefaultTableModel) tblLeaves.getModel();
        model.setRowCount(0);

        lblName.setText(user.getName());
        lblLastName.setText(user.getLastName());
        lblCi.setText(user.getCI());
        lblCharge.setText(user.getCharge());
        lblEmail.setText(user.getEmail());
        lblPhone.setText(user.getPhoneNumber());
        lblAddresss.setText(user.getAddress());

        ResultSet rs = controllers.LeavesController.getLeaves(id);

        try {

            while (rs.next()) {
                String date = rs.getString("init").equals(rs.getString("end")) ? rs.getString("init") : rs.getString("init") + " hasta " + rs.getString("end");
                model.addRow(new Object[]{rs.getString("type"), rs.getString("description"), date});
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCloseWindow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCharge = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblAddresss = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLeaves = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Perez Lopez");

        jLabel6.setText("Apellidos");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        lblCloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCloseWindow.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseWindow.setText("X");
        lblCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseWindowMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Fulanito Menganito");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Perez Lopez");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");

        lblCi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCi.setForeground(new java.awt.Color(255, 255, 255));
        lblCi.setText("5555555555");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cédula:");

        lblCharge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCharge.setForeground(new java.awt.Color(255, 255, 255));
        lblCharge.setText("Docente");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cargo:");

        lblPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("555555555");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Teléfono:");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("correo@falso.com");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email:");

        lblAddresss.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddresss.setForeground(new java.awt.Color(255, 255, 255));
        lblAddresss.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddresss.setText("Calle vuelvan caras las cosas");
        lblAddresss.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Dirección:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Permisos:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Datos del Usuario");

        tblLeaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Descrición", "fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLeaves);

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Esta persona NO tiene permiso el dia de hoy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(216, 216, 216)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCi, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(lblCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblStatus))
                                        .addComponent(lblAddresss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblCloseWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLastName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCi)
                    .addComponent(lblCharge))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddresss, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseWindowMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCloseWindowMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddresss;
    private javax.swing.JLabel lblCharge;
    private javax.swing.JLabel lblCi;
    private javax.swing.JLabel lblCloseWindow;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblLeaves;
    // End of variables declaration//GEN-END:variables
}
