package pannels;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class HollydayCalendar extends javax.swing.JFrame {

    public HollydayCalendar() {
        initComponents();
        txtYear.setText(libraries.GetDate.getCurrentYear());
        txtYear2.setText(txtYear.getText());
        fillTable();
        fillDaysOfMoth();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblCalendar.getModel();
        model.setRowCount(0);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblCalendar.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        ResultSet rs = controllers.HollydaysCalendar.getHolydaysListRS();

        try {
            while (rs.next()) {
                if (rs.getString("init").equals(rs.getString("end"))) {
                    model.addRow(new Object[]{rs.getString("init"), rs.getString("description")});
                } else {
                    model.addRow(new Object[]{rs.getString("init") + " hasta " + rs.getString("end"), rs.getString("description")});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getContentPane(), ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalendar = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDay = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAddHollyDay = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtYear2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMonth2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtDay2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JCheckBox();
        btnDeleteDate = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Miriam Libre", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Configuración           ");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblCalendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mes - Dia", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCalendar);
        if (tblCalendar.getColumnModel().getColumnCount() > 0) {
            tblCalendar.getColumnModel().getColumn(0).setMinWidth(120);
            tblCalendar.getColumnModel().getColumn(0).setMaxWidth(120);
        }

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYearKeyReleased(evt);
            }
        });

        jLabel1.setText("Año");

        txtMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Frebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        txtMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtMonthItemStateChanged(evt);
            }
        });
        txtMonth.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtMonthPropertyChange(evt);
            }
        });

        jLabel2.setText("Mes");

        txtDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Dia");

        jLabel4.setText("Descripción");

        btnAddHollyDay.setText("Agregar dia feriado");
        btnAddHollyDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHollyDayActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Miriam Libre", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dias Feriados");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 420, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setText("Desde");

        jLabel8.setText("Dia");

        txtYear2.setEnabled(false);
        txtYear2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYear2KeyReleased(evt);
            }
        });

        jLabel10.setText("Año");

        txtMonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Frebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        txtMonth2.setEnabled(false);
        txtMonth2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtMonth2ItemStateChanged(evt);
            }
        });
        txtMonth2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtMonth2PropertyChange(evt);
            }
        });

        jLabel11.setText("Mes");

        txtDay2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtDay2.setEnabled(false);

        jLabel12.setText("Fecha");

        btnCheck.setText("Hasta");
        btnCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnCheckStateChanged(evt);
            }
        });

        btnDeleteDate.setText("Eliminar");
        btnDeleteDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtDescription)
                                            .addComponent(jLabel4)
                                            .addComponent(btnAddHollyDay, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtYear2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(txtDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCheck))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDeleteDate))))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnAddHollyDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteDate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMonthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMonthPropertyChange


    }//GEN-LAST:event_txtMonthPropertyChange

    private void txtMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtMonthItemStateChanged
        // TOD       
        fillDaysOfMoth();

    }//GEN-LAST:event_txtMonthItemStateChanged

    private void txtYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyReleased
        // TODO add your handling code here:
        fillDaysOfMoth();
    }//GEN-LAST:event_txtYearKeyReleased

    private void btnAddHollyDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHollyDayActionPerformed
        // TODO add your handling code here:

        if (txtDescription.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes agregar una descripción");
        } else {

            boolean isValidDate = true;

            ResultSet rs = controllers.HollydaysCalendar.getHolydaysListRS();

            String month1 = String.valueOf(txtMonth.getSelectedIndex() + 1);
            String day1 = String.valueOf(txtDay.getSelectedItem());
            String description = txtDescription.getText();

            /////////////////////////
            try {
                while (rs.next()) {
                    if (rs.getString("init").equals(month1 + "-" + day1)) {
                        isValidDate = false;
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            if (isValidDate) {
                if (btnCheck.isSelected()) {
                    String month2 = String.valueOf(txtMonth2.getSelectedIndex() + 1);
                    String day2 = String.valueOf(txtDay2.getSelectedItem());
                    
                    if(Integer.parseInt(month2) < Integer.parseInt(month1) || (Integer.parseInt(month1) == Integer.parseInt(month2) && Integer.parseInt(day2) < Integer.parseInt(day1)) ){
                        JOptionPane.showMessageDialog(this, "La fecha ingresada no es valida");
                    }else{
                        controllers.HollydaysCalendar.insertHollyDay(month1, day1, month2, day2, description);
                    }
                } else {
                    controllers.HollydaysCalendar.insertHollyDay(month1, day1, month1, day1, description);
                }
            } else {
                  JOptionPane.showMessageDialog(this, "La fehca ya está registrada");
            }
            fillTable();
        }
    }//GEN-LAST:event_btnAddHollyDayActionPerformed

    private void txtYear2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYear2KeyReleased
        // TODO add your handling code here:
        fillDaysOfMoth();
    }//GEN-LAST:event_txtYear2KeyReleased

    private void txtMonth2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtMonth2ItemStateChanged
        // TODO add your handling code here:
        fillDaysOfMoth();
    }//GEN-LAST:event_txtMonth2ItemStateChanged

    private void txtMonth2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMonth2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonth2PropertyChange

    private void btnCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnCheckStateChanged
        // TODO add your handling code here:
        if (btnCheck.isSelected()) {
            txtDay2.setEnabled(true);
            txtYear2.setEnabled(true);
            txtMonth2.setEnabled(true);
        } else {
            txtDay2.setEnabled(false);
            txtYear2.setEnabled(false);
            txtMonth2.setEnabled(false);

        }


    }//GEN-LAST:event_btnCheckStateChanged

    private void btnDeleteDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDateActionPerformed
        // TODO add your handling code here:
        String value ="";
        try {
            int row = tblCalendar.getSelectedRow();
            value = tblCalendar.getModel().getValueAt(row, 0).toString();
            controllers.HollydaysCalendar.deleteHolyDay(value);
            fillTable();
            
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_btnDeleteDateActionPerformed

    private void fillDaysOfMoth() {

        //fecha 1
        DefaultComboBoxModel DCBM = (DefaultComboBoxModel) txtDay.getModel();
        DCBM.removeAllElements();

        int days = libraries.CreateDaysOfMonth.crateDaysMonth(txtYear.getText(), String.valueOf(txtMonth.getSelectedIndex() + 1));

        for (int i = 1; i <= days; i++) {
            DCBM.addElement(i);
        }

        //fecha2
        DefaultComboBoxModel DCBM2 = (DefaultComboBoxModel) txtDay2.getModel();
        DCBM2.removeAllElements();

        int days2 = libraries.CreateDaysOfMonth.crateDaysMonth(txtYear2.getText(), String.valueOf(txtMonth2.getSelectedIndex() + 1));

        for (int i = 1; i <= days2; i++) {
            DCBM2.addElement(i);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddHollyDay;
    private javax.swing.JCheckBox btnCheck;
    private javax.swing.JButton btnDeleteDate;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblCalendar;
    private javax.swing.JComboBox<String> txtDay;
    private javax.swing.JComboBox<String> txtDay2;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JComboBox<String> txtMonth;
    private javax.swing.JComboBox<String> txtMonth2;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtYear2;
    // End of variables declaration//GEN-END:variables
}
