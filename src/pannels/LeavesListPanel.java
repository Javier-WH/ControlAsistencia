package pannels;

import Actors.Users;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class LeavesListPanel extends javax.swing.JFrame {

    public LeavesListPanel() {
        initComponents();

        txtYear.setText(libraries.GetDate.getCurrentYear());
        cmbMonth.setSelectedIndex(Integer.parseInt(libraries.GetDate.getCurrentMonth()) -1);
        
        fillDaysOfMoth();
        
        cmbDay.setSelectedIndex(Integer.parseInt(libraries.GetDate.getDayOfMonth()) -1);
       
        filltable();
        
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         this.setSize((int)(screenSize.width * 0.8), 550);
        
    }
    
    public void filltable() {

        String ci = txtCi.getText();
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        String type = txtTipe.getText();
        int selectedMonth = cmbMonth.getSelectedIndex() + 1;
        int selectedDay = cmbDay.getSelectedIndex() + 1;

       
        DefaultTableModel model = (DefaultTableModel) tblLeaves.getModel();
        model.setRowCount(0);

        ResultSet rsLeaves = controllers.LeavesController.getLeavesList();

        try {
            while (rsLeaves.next()) {
                String rsCi = rsLeaves.getString("ci");
                String rsName = rsLeaves.getString("name");
                String rsLastName = rsLeaves.getString("lastName");
                String rsType = rsLeaves.getString("type");

                String[] rsInit = rsLeaves.getString("init").split("-");
                String[] rsEnd = rsLeaves.getString("end").split("-");

                int rsMonth1 = Integer.parseInt(rsInit[0]);
                int rsDay1 = Integer.parseInt(rsInit[1]);
                int rsMonth2 = Integer.parseInt(rsEnd[0]);
                int rsDay2 = Integer.parseInt(rsEnd[1]);

                if (rsCi.contains(ci)
                        && rsName.toLowerCase().contains(name.toLowerCase())
                        && rsLastName.toLowerCase().contains(lastName.toLowerCase())
                        && rsType.toLowerCase().contains(type.toLowerCase())) {
                    
                    if(controllers.LeavesController.isOnLeave(selectedMonth, selectedDay, rsMonth1, rsMonth2, rsDay1, rsDay2)){
                        
                        String date = rsLeaves.getString("init").equals(rsLeaves.getString("end")) ? rsLeaves.getString("init") : rsLeaves.getString("init") + " hasta " + rsLeaves.getString("end");
                        model.addRow(new Object[]{rsLeaves.getString("ci"), rsLeaves.getString("name"), rsLeaves.getString("lastName"), rsLeaves.getString("type"), date});
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

   

    private void fillDaysOfMoth() {

        //fecha 1
        DefaultComboBoxModel DCBM = (DefaultComboBoxModel) cmbDay.getModel();
        DCBM.removeAllElements();

        int days = libraries.CreateDaysOfMonth.crateDaysMonth(txtYear.getText(), String.valueOf(cmbMonth.getSelectedIndex() + 1));

        for (int i = 1; i <= days; i++) {
            DCBM.addElement(i);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeaves = new javax.swing.JTable();
        txtCi = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtTipe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JToggleButton();
        cmbMonth = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblLeaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Permiso", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLeaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLeavesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLeaves);
        if (tblLeaves.getColumnModel().getColumnCount() > 0) {
            tblLeaves.getColumnModel().getColumn(0).setResizable(false);
            tblLeaves.getColumnModel().getColumn(1).setResizable(false);
            tblLeaves.getColumnModel().getColumn(2).setResizable(false);
            tblLeaves.getColumnModel().getColumn(3).setResizable(false);
            tblLeaves.getColumnModel().getColumn(4).setResizable(false);
        }

        txtCi.setToolTipText("");
        txtCi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCiFocusLost(evt);
            }
        });
        txtCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiActionPerformed(evt);
            }
        });
        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiKeyReleased(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });

        txtTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipeActionPerformed(evt);
            }
        });
        txtTipe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipeKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtros de búsqueda");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de permisos");

        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Frebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonthItemStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes");

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDayItemStateChanged(evt);
            }
        });
        cmbDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDayActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dia");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cédula");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombres");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo");

        txtYear.setText("2022");
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYearKeyReleased(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Año");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAccept)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCiActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTipeActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyReleased
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_txtCiKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtTipeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipeKeyReleased
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_txtTipeKeyReleased

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void cmbDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDayActionPerformed

    private void txtCiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCiFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCiFocusGained

    private void txtCiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCiFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCiFocusLost

    private void cmbMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonthItemStateChanged
        // TODO add your handling code here:
        fillDaysOfMoth();
    }//GEN-LAST:event_cmbMonthItemStateChanged

    private void txtYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyReleased
        // TODO add your handling code here:
        fillDaysOfMoth();
    }//GEN-LAST:event_txtYearKeyReleased

    private void cmbDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDayItemStateChanged
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_cmbDayItemStateChanged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void tblLeavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLeavesMouseClicked
        libraries.ShowUserInfo.showUserInfo(tblLeaves, this); 
    }//GEN-LAST:event_tblLeavesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAccept;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLeaves;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTipe;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
