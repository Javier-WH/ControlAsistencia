package pannels;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MonitorPanel extends javax.swing.JFrame {

    DefaultTableModel tableModel;

    public MonitorPanel() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tableModel = (DefaultTableModel) tabla.getModel();
        tableModel.setNumRows(0);
        enableFilter(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btngUserType = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCi = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbUser = new javax.swing.JRadioButton();
        rdbAdmin = new javax.swing.JRadioButton();
        txtName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmbYear1 = new javax.swing.JComboBox<>();
        cmbMonth1 = new javax.swing.JComboBox<>();
        cmbMonth2 = new javax.swing.JComboBox<>();
        cmbYear2 = new javax.swing.JComboBox<>();
        lblTo = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        chkFilter = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        btnAcept = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        btngUserType.add(rdbUser);
        btngUserType.add(rdbAdmin);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWeights = new double[] {1.0};
        jPanel2.setLayout(jPanel2Layout);

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Monitor");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(title, gridBagConstraints);

        txtCi.setMinimumSize(new java.awt.Dimension(150, 100));
        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiKeyReleased(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Cédula");

        rdbUser.setSelected(true);
        rdbUser.setText("Usuario");
        rdbUser.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbUserStateChanged(evt);
            }
        });
        rdbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbUserActionPerformed(evt);
            }
        });

        rdbAdmin.setText("Administrador");
        rdbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbAdmin)
                    .addComponent(rdbUser))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbAdmin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        cmbYear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " " }));
        cmbYear1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbYear1ItemStateChanged(evt);
            }
        });

        cmbMonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonth1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonth1ItemStateChanged(evt);
            }
        });

        cmbMonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonth2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonth2ItemStateChanged(evt);
            }
        });

        cmbYear2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", " " }));
        cmbYear2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbYear2ItemStateChanged(evt);
            }
        });

        lblTo.setText("Hasta");

        lblFrom.setText("Desde");

        chkFilter.setText("Filtrar");
        chkFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFilter)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmbYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTo)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblFrom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(cmbYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(chkFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFrom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))))
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        btnAcept.setText("Aceptar");
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });
        jPanel6.add(btnAcept);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel7.setLayout(new java.awt.CardLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Acción", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel7.add(jScrollPane1, "card2");

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAceptActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdbUserStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbUserStateChanged

    }//GEN-LAST:event_rdbUserStateChanged

    private void txtCiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search();
        }
    }//GEN-LAST:event_txtCiKeyReleased

    private void chkFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFilterActionPerformed
        enableFilter(chkFilter.isSelected());
        search();
    }//GEN-LAST:event_chkFilterActionPerformed

    private void rdbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbUserActionPerformed
        search();
    }//GEN-LAST:event_rdbUserActionPerformed

    private void rdbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAdminActionPerformed
        search();
    }//GEN-LAST:event_rdbAdminActionPerformed

    private void cmbYear1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbYear1ItemStateChanged
        cmbSearch();
    }//GEN-LAST:event_cmbYear1ItemStateChanged

    private void cmbMonth1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonth1ItemStateChanged
        cmbSearch();
    }//GEN-LAST:event_cmbMonth1ItemStateChanged

    private void cmbYear2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbYear2ItemStateChanged
        cmbSearch();
    }//GEN-LAST:event_cmbYear2ItemStateChanged

    private void cmbMonth2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonth2ItemStateChanged
        cmbSearch();
    }//GEN-LAST:event_cmbMonth2ItemStateChanged

    private void cmbSearch() {
        int year1Index = cmbYear1.getSelectedIndex();
        int month1Index = cmbMonth1.getSelectedIndex();
        int year2Index = cmbYear2.getSelectedIndex();
        int month2Index = cmbMonth2.getSelectedIndex();

        if (year1Index > -1
                && month1Index > -1
                && year2Index > -1
                && month2Index > -1) {
            search();
        }

    }

    private void search() {
        String ci = txtCi.getText();
        String id = null;
        ResultSet register = null;
        String admin = null;
        String name = null;

        try {
            if (rdbUser.isSelected()) {
                register = controllers.GetTeachersController.getTeachers(ci);
                admin = "0";
            } else {
                register = controllers.GetAdminsListController.getAdmin(ci);
                admin = "1";
            }

            if (register.next()) {
                id = register.getString("id");
                if (rdbUser.isSelected()) {
                    name = register.getString("name") + " " + register.getString("lastName");
                } else {
                    name = register.getString("name");
                }
                txtName.setText(name);
            } else {
                if (rdbUser.isSelected()) {
                    txtName.setText("No se ha encontrado al usuario");
                }else{
                    txtName.setText("No se ha encontrado al administrador");
                }
                tableModel.setNumRows(0);
            }

            if (id != null) {
                ResultSet data = controllers.BitacoraController.getBitacora(id, admin);
                tableModel.setNumRows(0);
                boolean hasData = false;

                while (data.next()) {
                    String action = data.getString("action");
                    String date = data.getString("createdAt");

                    if (!chkFilter.isSelected()) {
                        tableModel.addRow(new Object[]{action, date});
                        hasData = true;
                    } else {

                        if (isCorrectDates()) {
                            String startDate = String.format("%04d-%02d-01 00:00:00",
                                    Integer.parseInt(cmbYear1.getSelectedItem().toString()),
                                    cmbMonth1.getSelectedIndex() + 1);
                            String endDate = String.format("%04d-%02d-01 00:00:00",
                                    Integer.parseInt(cmbYear2.getSelectedItem().toString()),
                                    cmbMonth2.getSelectedIndex() + 1);

                            if (isDateBetween(date, startDate, endDate)) {
                                tableModel.addRow(new Object[]{action, date});
                                hasData = true;
                            }
                        }
                    }
                }

                if (!hasData) {
                    if (isCorrectDates()) {
                        tableModel.addRow(new Object[]{"No se encontraron registros", ""});
                    } else {
                        tableModel.addRow(new Object[]{"Las fechas indicadas son incorrectas", ""});
                    }
                }

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isCorrectDates() {
        int year1 = cmbYear1.getSelectedIndex();
        int month1 = cmbMonth1.getSelectedIndex();
        int year2 = cmbYear2.getSelectedIndex();
        int month2 = cmbMonth2.getSelectedIndex();

        if (year2 < year1) {
            return false;
        }

        return !(year2 == year1 && month2 <= month1);

    }

    private boolean isDateBetween(String dateToCheck, String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate date = LocalDate.parse(dateToCheck, formatter);
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);

        return date.isAfter(start) && date.isBefore(end);
    }

    private void enableFilter(boolean enabled) {
        lblFrom.setEnabled(enabled);
        lblTo.setEnabled(enabled);
        cmbYear1.setEnabled(enabled);
        cmbMonth1.setEnabled(enabled);
        cmbYear2.setEnabled(enabled);
        cmbMonth2.setEnabled(enabled);

        int value = enabled ? 0 : -1;
        cmbYear1.setSelectedIndex(value);
        cmbMonth1.setSelectedIndex(value);
        cmbYear2.setSelectedIndex(value);
        cmbMonth2.setSelectedIndex(enabled ? 1 : -1);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcept;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup btngUserType;
    private javax.swing.JCheckBox chkFilter;
    private javax.swing.JComboBox<String> cmbMonth1;
    private javax.swing.JComboBox<String> cmbMonth2;
    private javax.swing.JComboBox<String> cmbYear1;
    private javax.swing.JComboBox<String> cmbYear2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTo;
    private javax.swing.JRadioButton rdbAdmin;
    private javax.swing.JRadioButton rdbUser;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCi;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables
}
