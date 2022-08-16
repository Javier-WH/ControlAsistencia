package pannels;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class LeavesPannel extends javax.swing.JFrame {

    public LeavesPannel() {
        initComponents();

        txtYear1.setText(libraries.GetDate.getCurrentYear());
        txtYear2.setText(txtYear1.getText());

        fillDaysOfMoth();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtYear1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbMonth1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbDay1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        optionalPannel = new javax.swing.JPanel();
        txtYear2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbMonth2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbDay2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        rdbTo = new javax.swing.JRadioButton();
        btnAccept = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        mainPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Descripción");

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        jLabel2.setText("Cédula");

        jLabel3.setText("Año");

        cmbMonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Frebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonth1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonth1ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Mes");

        cmbDay1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Dia");

        jLabel9.setText("Desde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbMonth1, 0, 119, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        optionalPannel.setEnabled(false);

        txtYear2.setEnabled(false);

        jLabel6.setText("Año");

        cmbMonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Frebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonth2.setEnabled(false);
        cmbMonth2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonth2ItemStateChanged(evt);
            }
        });

        jLabel7.setText("Mes");

        cmbDay2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDay2.setEnabled(false);

        jLabel8.setText("Dia");

        rdbTo.setText("Hasta (opcional)");
        rdbTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbToItemStateChanged(evt);
            }
        });

        btnAccept.setText("Agregar Permiso");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionalPannelLayout = new javax.swing.GroupLayout(optionalPannel);
        optionalPannel.setLayout(optionalPannelLayout);
        optionalPannelLayout.setHorizontalGroup(
            optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionalPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbTo)
                .addGap(388, 388, 388))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionalPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionalPannelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbMonth2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(50, 50, 50))
            .addGroup(optionalPannelLayout.createSequentialGroup()
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        optionalPannelLayout.setVerticalGroup(
            optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionalPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnAccept)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permiso Médico", "Permiso Pre-Natal", "Permiso Post-Natal", "Permiso para Diliegencias", "Permiso de Año Sabatico", "Permiso de Comisión de Servicio", "Permiso por Duelo", " " }));

        jLabel11.setText("Tipo");

        javax.swing.GroupLayout mainPannelLayout = new javax.swing.GroupLayout(mainPannel);
        mainPannel.setLayout(mainPannelLayout);
        mainPannelLayout.setHorizontalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(optionalPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        mainPannelLayout.setVerticalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionalPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMonth1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonth1ItemStateChanged
        fillDaysOfMoth();
    }//GEN-LAST:event_cmbMonth1ItemStateChanged

    private void cmbMonth2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonth2ItemStateChanged
        // TODO add your handling code here:
        fillDaysOfMoth();
    }//GEN-LAST:event_cmbMonth2ItemStateChanged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void rdbToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbToItemStateChanged
        // TODO add your handling code here:
        if (rdbTo.isSelected()) {
            txtYear2.setEnabled(true);
            cmbDay2.setEnabled(true);
            cmbMonth2.setEnabled(true);
        } else {
            txtYear2.setEnabled(false);
            cmbDay2.setEnabled(false);
            cmbMonth2.setEnabled(false);
        }
    }//GEN-LAST:event_rdbToItemStateChanged

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        String ci = txtCI.getText();
        String type = String.valueOf(cmbType.getSelectedItem());
        String description = txtDescription.getText();
        String year1 = txtYear1.getText();
        String month1 = String.valueOf(cmbMonth1.getSelectedItem());
        String day1 = String.valueOf(cmbDay1.getSelectedItem());
        String year2 = txtYear2.getText();
        String month2 = String.valueOf(cmbMonth2.getSelectedItem());
        String day2 = String.valueOf(cmbDay2.getSelectedItem());

        String init = month1 + "-" + day1;
        String end = rdbTo.isSelected() ? month2 + "-" + day2 : init;
        String userID = "";
        String userName = "";

        if (ci.isEmpty() || description.isEmpty() || year1.isEmpty() || year2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            
            try {
                ResultSet rs = controllers.GetTeachersController.getTeachers(ci);

                if (rs.next()) {
                    userID = rs.getString("id");
                    userName = rs.getString("name") + " " + rs.getString("lastName");

                    if (controllers.LeavesController.RegisterLeave(userID, init, end, type, description)) {
                        JOptionPane.showMessageDialog(this, "Se ha registrado un permiso para el profesor " + userName);
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ocurrido un error al registrar el permiso");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "La cédula introducida no esta registrada en el sistema");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void fillDaysOfMoth() {

        //fecha 1
        DefaultComboBoxModel DCBM = (DefaultComboBoxModel) cmbDay1.getModel();
        DCBM.removeAllElements();

        int days = libraries.CreateDaysOfMonth.crateDaysMonth(txtYear1.getText(), String.valueOf(cmbMonth1.getSelectedIndex() + 1));

        for (int i = 1; i <= days; i++) {
            DCBM.addElement(i);
        }

        ///////////
        DefaultComboBoxModel DCBM2 = (DefaultComboBoxModel) cmbDay2.getModel();
        DCBM2.removeAllElements();

        int days2 = libraries.CreateDaysOfMonth.crateDaysMonth(txtYear2.getText(), String.valueOf(cmbMonth2.getSelectedIndex() + 1));

        for (int i = 1; i <= days2; i++) {
            DCBM2.addElement(i);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JComboBox<String> cmbDay1;
    private javax.swing.JComboBox<String> cmbDay2;
    private javax.swing.JComboBox<String> cmbMonth1;
    private javax.swing.JComboBox<String> cmbMonth2;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPannel;
    private javax.swing.JPanel optionalPannel;
    private javax.swing.JRadioButton rdbTo;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtYear1;
    private javax.swing.JTextField txtYear2;
    // End of variables declaration//GEN-END:variables
}
