package pannels;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ShowAssitance extends javax.swing.JFrame {

    private DefaultTableModel model = null;
    private String date = null;

    public ShowAssitance() {
        initComponents();
        ButtonGroup Asistencia = new ButtonGroup();
        Asistencia.add(btnPresente);
        Asistencia.add(btnInasistente);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((int) (screenSize.width * 0.9), 600);

        fillInputsCurrentDate();
        fillDaysOfMoth();
        cmbDay.setSelectedIndex(Integer.parseInt(libraries.GetDate.getDayOfMonth()) - 1);
        fillTable();

        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));

    }

    private void fillInputsCurrentDate() {
        txtYear.setText(libraries.GetDate.getCurrentYear());
        cmbMonth.setSelectedItem(libraries.GetDate.getMonthName());
        cmbDay.setSelectedIndex(Integer.parseInt(libraries.GetDate.getDayOfMonth()) - 1);

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

    private void changeRowColor(ArrayList<Integer> leaves) {
        tblAssistance.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

                if (leaves.contains(row)) {
                    setBackground(new Color(255, 239, 0));
                    // setForeground(Color.WHITE);
                } else {
                    setBackground(tblAssistance.getBackground());
                    setForeground(tblAssistance.getForeground());
                }
                return this;
            }
        });
    }

    private void fillTable() {

        ArrayList<Integer> leaves = new ArrayList();

        date = txtYear.getText() + "-" + (cmbMonth.getSelectedIndex() + 1) + "-" + cmbDay.getSelectedItem();
        model = (DefaultTableModel) tblAssistance.getModel();
        model.setRowCount(0);

        ResultSet rsPresent = controllers.AssistenceController.getAssistanceListByDate(date);
        ResultSet rsTeacherList = controllers.GetTeachersController.getTeachers();

        if (rsPresent != null) {
            try {
                if (btnPresente.isSelected()) {
                    while (rsPresent.next()) {
                        model.addRow(new Object[]{rsPresent.getString("ci"), rsPresent.getString("name"), rsPresent.getString("lastName"), rsPresent.getString("charge")});
                    }
                } else {
                    //se hizó así, porque fue la uníca solución que funcionó para resolver el bug que duplicaba los resultados.
                    ArrayList<String> presentsList = new ArrayList();

                    while (rsPresent.next()) {
                        presentsList.add(rsPresent.getString("id"));
                    }

                    while (rsTeacherList.next()) {
                        String teacherID = rsTeacherList.getString("id");
                        if (!presentsList.contains(teacherID)) {
                            model.addRow(new Object[]{rsTeacherList.getString("ci"), rsTeacherList.getString("name"), rsTeacherList.getString("lastName"), rsTeacherList.getString("charge")});

                            ResultSet leave = controllers.LeavesController.getLeaves(teacherID);

                            try {
                                if (leave.next()) {
                                    String init = leave.getString("init");
                                    String end = leave.getString("end");
                                    String[] date1 = init.split("-");
                                    String[] date2 = end.split("-");

                                    int month1 = Integer.parseInt(date1[0]);
                                    int day1 = Integer.parseInt(date1[1]);

                                    int month2 = Integer.parseInt(date2[0]);
                                    int day2 = Integer.parseInt(date2[1]);

                                    int selectedMonth = cmbMonth.getSelectedIndex() + 1;
                                    int selectedDay = cmbDay.getSelectedIndex() + 1;

                                    if (controllers.LeavesController.isOnLeave(selectedMonth, selectedDay, month1, month2, day1, day2)) {
                                        leaves.add(model.getRowCount() - 1);
                                    }
                                }

                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                }
                changeRowColor(leaves);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(getContentPane(), "Ha ocurrido un error al intentar llenar la tabla");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAssistance = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnPresente = new javax.swing.JRadioButton();
        btnInasistente = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbDay = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 600));

        mainPanel.setBackground(new java.awt.Color(51, 102, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setMaximumSize(new java.awt.Dimension(32767, 600));

        tblAssistance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C.I.", "Nombre", "Apellido", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAssistance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAssistanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAssistance);

        jLabel1.setBackground(new java.awt.Color(204, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Asitencia");

        txtYear.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYearKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("dia");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("mes");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("año");

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        btnPresente.setBackground(new java.awt.Color(51, 102, 0));
        btnPresente.setForeground(new java.awt.Color(255, 255, 255));
        btnPresente.setSelected(true);
        btnPresente.setText("Presentes");
        btnPresente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnPresenteStateChanged(evt);
            }
        });

        btnInasistente.setBackground(new java.awt.Color(51, 102, 0));
        btnInasistente.setForeground(new java.awt.Color(255, 255, 255));
        btnInasistente.setText("Inasistentes");
        btnInasistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInasistenteActionPerformed(evt);
            }
        });

        jButton1.setText("Hoy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Frebro", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmbMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMonthItemStateChanged(evt);
            }
        });

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDayItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(30, 30, 30)
                                .addComponent(btnPresente)
                                .addGap(18, 18, 18)
                                .addComponent(btnInasistente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPresente)
                    .addComponent(btnInasistente)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(44, 44, 44))
        );

        jScrollPane2.setViewportView(mainPanel);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PrintAsistences PA = new PrintAsistences(getTableModel(), btnPresente.isSelected(), getThisDate());
        // PA.setLocationRelativeTo(this);
        //PA.setVisible(true);

        try {

            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setPrintable(PA);

            if (pj.printDialog()) {
                pj.print();
            }

        } catch (HeadlessException | PrinterException e) {

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fillInputsCurrentDate();
        fillTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPresenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnPresenteStateChanged
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_btnPresenteStateChanged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMonthItemStateChanged
        // TODO add your handling code here:
        int selectedIndex = cmbDay.getSelectedIndex();
        fillDaysOfMoth();
        try {
            cmbDay.setSelectedIndex(selectedIndex);
        } catch (Exception e) {
            cmbDay.setSelectedIndex(0);
        }
        refreshAssitence();
    }//GEN-LAST:event_cmbMonthItemStateChanged

    private void cmbDayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDayItemStateChanged
        // TODO add your handling code here:
        refreshAssitence();
    }//GEN-LAST:event_cmbDayItemStateChanged

    private void txtYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyReleased
        // TODO add your handling code here:
        if (txtYear.getText().equals("") || txtYear.getText().equals("0")) {
            txtYear.setText("1");
        }

        int selectedIndex = cmbDay.getSelectedIndex();
        fillDaysOfMoth();
        try {
            cmbDay.setSelectedIndex(selectedIndex);
        } catch (Exception e) {
            cmbDay.setSelectedIndex(0);
        }
        refreshAssitence();
    }//GEN-LAST:event_txtYearKeyReleased

    private void btnInasistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInasistenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInasistenteActionPerformed

    private void tblAssistanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAssistanceMouseClicked
        libraries.ShowUserInfo.showUserInfo(tblAssistance, this);

    }//GEN-LAST:event_tblAssistanceMouseClicked

    public void refreshAssitence() {
        if (!txtYear.getText().isEmpty()) {
            fillTable();
        } else {
            fillInputsCurrentDate();
        }

    }

    public DefaultTableModel getTableModel() {
        return model;
    }

    public String getThisDate() {
        return date;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnInasistente;
    private javax.swing.JRadioButton btnPresente;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblAssistance;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
