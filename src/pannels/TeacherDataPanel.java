package pannels;

import Actors.Users;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TeacherDataPanel extends javax.swing.JFrame {

    Users user;
    String id;

    public TeacherDataPanel(String id, Users user) {

        this.id = id;
        this.user = user;
        initComponents();
        fillUserData();

        lblName.setDisabledTextColor(Color.BLACK);
        lblLastName.setDisabledTextColor(Color.BLACK);
        lblCi.setDisabledTextColor(Color.BLACK);
        lblPhone.setDisabledTextColor(Color.BLACK);
        lblAddresss.setDisabledTextColor(Color.BLACK);
        lblPasword.setDisabledTextColor(Color.BLACK);
        lblEmail.setDisabledTextColor(Color.BLACK);
        

        boolean status = controllers.LeavesController.checkLeave(user.getCI());

        if (status) {
            lblStatus.setText("Esta persona está de permiso el dia de hoy");
            lblStatus.setForeground(Color.YELLOW);
        } else {
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
        lblCharge.setSelectedItem(user.getCharge());
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
        txtCharge = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblCloseWindow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLeaves = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        lblLastName = new javax.swing.JTextField();
        lblName = new javax.swing.JTextField();
        lblCi = new javax.swing.JTextField();
        lblPhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JTextField();
        lblAddresss = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblPasword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        lblCharge = new javax.swing.JComboBox<>();
        chkEdit = new javax.swing.JCheckBox();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Perez Lopez");

        jLabel6.setText("Apellidos");

        txtCharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Director", "Sub-director", "Administrativo", "Obrero", "Administrativo", "Asesor Pedagogico", "Cultura", "Colaborador", " " }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCloseWindow.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseWindow.setText("X");
        lblCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseWindowMouseClicked(evt);
            }
        });
        jPanel1.add(lblCloseWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 10, 17, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 69, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 136, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cédula:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 198, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cargo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 198, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Teléfono:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 265, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 265, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Dirección:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 327, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Permisos:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 448, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Datos del Usuario");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 32, 594, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 477, 554, 105));

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Esta persona NO tiene permiso el dia de hoy");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 445, -1, -1));

        lblLastName.setEnabled(false);
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 164, 303, -1));

        lblName.setEnabled(false);
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 101, 303, -1));

        lblCi.setEnabled(false);
        jPanel1.add(lblCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 220, 237, -1));

        lblPhone.setEnabled(false);
        jPanel1.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 287, 237, -1));

        lblEmail.setEnabled(false);
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 287, 236, -1));

        lblAddresss.setEnabled(false);
        jPanel1.add(lblAddresss, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 355, 491, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Contraseña");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 395, -1, -1));

        lblPasword.setEnabled(false);
        jPanel1.add(lblPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 417, 274, -1));

        btnUpdate.setText("Actualizar");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 122, 109, 60));

        lblCharge.setEditable(true);
        lblCharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Director", "Sub-director", "Administrativo", "Obrero", "Administrativo", "Asesor Pedagogico", "Cultura", "Colaborador", " " }));
        lblCharge.setEnabled(false);
        jPanel1.add(lblCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 210, -1));

        chkEdit.setBackground(new java.awt.Color(51, 102, 0));
        chkEdit.setForeground(new java.awt.Color(255, 255, 255));
        chkEdit.setText("Editar");
        chkEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEditActionPerformed(evt);
            }
        });
        jPanel1.add(chkEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseWindowMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCloseWindowMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        Users user = new Users();
        user.setName(lblName.getText());
        user.setLastName(lblLastName.getText());
        user.setCI(lblCi.getText());
        user.setCharge(String.valueOf(lblCharge.getSelectedItem()));
        user.setPhoneNumber(lblPhone.getText());
        user.setEmail(lblEmail.getText());
        user.setAddress(lblAddresss.getText());
        user.setPassword(lblPasword.getText());

        boolean isUdated = controllers.GetTeachersController.updateTeachers(user);

        if (isUdated) {
            JOptionPane.showMessageDialog(this, "Los datos del profesor han sido actualizados");
            chkEdit.setSelected(false);
            boolean enabled = false;
            lblName.setEnabled(enabled);
            lblLastName.setEnabled(enabled);
            lblCi.setEnabled(enabled);
            lblCharge.setEnabled(enabled);
            lblPhone.setEnabled(enabled);
            lblEmail.setEnabled(enabled);
            lblAddresss.setEnabled(enabled);
            lblPasword.setEnabled(enabled);
            btnUpdate.setEnabled(enabled);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void chkEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEditActionPerformed
        // TODO add your handling code here:
        boolean enabled = true;

        if (!chkEdit.isSelected()) {
            enabled = false;
        }

        lblName.setEnabled(enabled);
        lblLastName.setEnabled(enabled);
        lblCi.setEnabled(enabled);
        lblCharge.setEnabled(enabled);
        lblPhone.setEnabled(enabled);
        lblEmail.setEnabled(enabled);
        lblAddresss.setEnabled(enabled);
        lblPasword.setEnabled(enabled);
        btnUpdate.setEnabled(enabled);
    }//GEN-LAST:event_chkEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblAddresss;
    private javax.swing.JComboBox<String> lblCharge;
    private javax.swing.JTextField lblCi;
    private javax.swing.JLabel lblCloseWindow;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextField lblLastName;
    private javax.swing.JTextField lblName;
    private javax.swing.JPasswordField lblPasword;
    private javax.swing.JTextField lblPhone;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblLeaves;
    private javax.swing.JComboBox<String> txtCharge;
    // End of variables declaration//GEN-END:variables
}
