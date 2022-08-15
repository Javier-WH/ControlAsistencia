package main;


import Actors.Day;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pannels.EmisorPannel;
import pannels.HollydayCalendar;
import pannels.InsertAdmins;
import pannels.InsertTeachers;
import pannels.InstitutionDataForm;
import pannels.LeavesPannel;
import pannels.ShowAdmins;
import pannels.ShowAssitance;
import pannels.ShowTeachers;
import pannels.WorkLetterEditPannel;


public class ConfigFrame extends javax.swing.JFrame {
    private LoginFrame loginframe = new LoginFrame();
    private final JLabel lblMainLogo = loginframe.getLogoLabel();
    private final int logoWidth;
    private final int logoHeight;
    

    
    public ConfigFrame(JFrame frame) {
        initComponents();
        setLocationRelativeTo(frame);
        logoWidth = lblLogo.getWidth();
        logoHeight = lblLogo.getHeight();
        lblLogo.setIcon(env.Enviroment.getLogoIcon(logoWidth, logoHeight));
        lblImage.setIcon(env.Enviroment.getBackground2Icon(lblImage.getWidth(), lblImage.getHeight()));
        btnStartApp.requestFocus();
        
       
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblClose1 = new javax.swing.JLabel();
        panelGeneral = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnCambiarLogo = new javax.swing.JButton();
        btnEditCartaTrabajo = new javax.swing.JButton();
        btnLogoRestore = new javax.swing.JButton();
        btnInsertAdmins = new javax.swing.JButton();
        btnInsertTeacher = new javax.swing.JButton();
        btbInstitucionData = new javax.swing.JButton();
        btbCalendar = new javax.swing.JButton();
        btbLeaves = new javax.swing.JButton();
        panelReportes = new javax.swing.JPanel();
        printConstancia = new javax.swing.JButton();
        btnCambiarLogo4 = new javax.swing.JButton();
        btnCambiarLogo5 = new javax.swing.JButton();
        btnShowAdmins = new javax.swing.JButton();
        btnStartApp = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        lblClose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 0), 2, true));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClose1.setForeground(new java.awt.Color(255, 255, 255));
        lblClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose1.setText("X");
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
        });
        mainPanel.add(lblClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 29, 26));

        panelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "General", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 102, 0))); // NOI18N

        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));

        btnCambiarLogo.setBackground(new java.awt.Color(51, 102, 0));
        btnCambiarLogo.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarLogo.setText("Cambiar logo");
        btnCambiarLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnCambiarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarLogoActionPerformed(evt);
            }
        });

        btnEditCartaTrabajo.setBackground(new java.awt.Color(51, 102, 0));
        btnEditCartaTrabajo.setForeground(new java.awt.Color(255, 255, 255));
        btnEditCartaTrabajo.setText("Editar carta de trabajo");
        btnEditCartaTrabajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnEditCartaTrabajo.setMaximumSize(new java.awt.Dimension(74, 18));
        btnEditCartaTrabajo.setMinimumSize(new java.awt.Dimension(74, 18));
        btnEditCartaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCartaTrabajoActionPerformed(evt);
            }
        });

        btnLogoRestore.setBackground(new java.awt.Color(51, 102, 0));
        btnLogoRestore.setForeground(new java.awt.Color(255, 255, 255));
        btnLogoRestore.setText("Restaurar");
        btnLogoRestore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnLogoRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoRestoreActionPerformed(evt);
            }
        });

        btnInsertAdmins.setBackground(new java.awt.Color(51, 102, 0));
        btnInsertAdmins.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertAdmins.setText("Inscribir Administradores");
        btnInsertAdmins.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnInsertAdmins.setMaximumSize(new java.awt.Dimension(74, 18));
        btnInsertAdmins.setMinimumSize(new java.awt.Dimension(74, 18));
        btnInsertAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAdminsActionPerformed(evt);
            }
        });

        btnInsertTeacher.setBackground(new java.awt.Color(51, 102, 0));
        btnInsertTeacher.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertTeacher.setText("Inscribir Docentes");
        btnInsertTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnInsertTeacher.setPreferredSize(new java.awt.Dimension(74, 18));
        btnInsertTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertTeacherActionPerformed(evt);
            }
        });

        btbInstitucionData.setBackground(new java.awt.Color(51, 102, 0));
        btbInstitucionData.setForeground(new java.awt.Color(255, 255, 255));
        btbInstitucionData.setText("Datos de la institución");
        btbInstitucionData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btbInstitucionData.setPreferredSize(new java.awt.Dimension(74, 18));
        btbInstitucionData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbInstitucionDataActionPerformed(evt);
            }
        });

        btbCalendar.setBackground(new java.awt.Color(51, 102, 0));
        btbCalendar.setForeground(new java.awt.Color(255, 255, 255));
        btbCalendar.setText("Calendario");
        btbCalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btbCalendar.setPreferredSize(new java.awt.Dimension(74, 18));
        btbCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCalendarActionPerformed(evt);
            }
        });

        btbLeaves.setBackground(new java.awt.Color(51, 102, 0));
        btbLeaves.setForeground(new java.awt.Color(255, 255, 255));
        btbLeaves.setText("Permisos");
        btbLeaves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btbLeaves.setPreferredSize(new java.awt.Dimension(74, 18));
        btbLeaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbLeavesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCambiarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditCartaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsertAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInsertTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogoRestore, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btbLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btbCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btbInstitucionData, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addComponent(btnCambiarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditCartaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogoRestore)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btbInstitucionData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btbCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btbLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        mainPanel.add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 369, 290));

        panelReportes.setBackground(new java.awt.Color(255, 255, 255));
        panelReportes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 102, 0))); // NOI18N

        printConstancia.setBackground(new java.awt.Color(51, 102, 0));
        printConstancia.setForeground(new java.awt.Color(255, 255, 255));
        printConstancia.setText("Imprimir carta de trabajo");
        printConstancia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        printConstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printConstanciaActionPerformed(evt);
            }
        });

        btnCambiarLogo4.setBackground(new java.awt.Color(51, 102, 0));
        btnCambiarLogo4.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarLogo4.setText("Mostrar docentes ");
        btnCambiarLogo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnCambiarLogo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarLogo4ActionPerformed(evt);
            }
        });

        btnCambiarLogo5.setBackground(new java.awt.Color(51, 102, 0));
        btnCambiarLogo5.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarLogo5.setText("Asistencias");
        btnCambiarLogo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnCambiarLogo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarLogo5ActionPerformed(evt);
            }
        });

        btnShowAdmins.setBackground(new java.awt.Color(51, 102, 0));
        btnShowAdmins.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAdmins.setText("Mostrar administradores");
        btnShowAdmins.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        btnShowAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAdminsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCambiarLogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printConstancia, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printConstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarLogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mainPanel.add(panelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 369, -1));

        btnStartApp.setBackground(new java.awt.Color(0, 102, 0));
        btnStartApp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnStartApp.setForeground(new java.awt.Color(255, 255, 255));
        btnStartApp.setText("Iniciar control de asistencia");
        btnStartApp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnStartApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartAppActionPerformed(evt);
            }
        });
        mainPanel.add(btnStartApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 202, 38));

        btnAtras.setBackground(new java.awt.Color(204, 0, 51));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atras");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        mainPanel.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 140, 38));

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Miriam Libre", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Configuración  ");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 40));
        mainPanel.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 400, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        env.Enviroment.exitApp(getContentPane());
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        env.Enviroment.exitApp(getContentPane());
    }//GEN-LAST:event_lblClose1MouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        
        loginframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCambiarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarLogoActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        try {
            File file = chooser.getSelectedFile();
            String filePath = file.getAbsolutePath();
            env.Enviroment.setLogoPath(filePath);
            updateAlllogos();
            controllers.LogoController.saveLogoAddress(filePath);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnCambiarLogoActionPerformed

    private void btnLogoRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoRestoreActionPerformed
        // TODO add your handling code here:
        env.Enviroment.setLogoPath();
        updateAlllogos();
        controllers.LogoController.saveLogoAddress(env.Enviroment.getLogoPath());
    }//GEN-LAST:event_btnLogoRestoreActionPerformed

    private void btnInsertTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertTeacherActionPerformed
        InsertTeachers insertTeachers = new InsertTeachers();
        insertTeachers.setLocationRelativeTo(this);
        insertTeachers.setVisible(true);
       
    }//GEN-LAST:event_btnInsertTeacherActionPerformed

    private void btnInsertAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAdminsActionPerformed
        InsertAdmins insertadmins = new InsertAdmins();
        insertadmins.setLocationRelativeTo(this);
        insertadmins.setVisible(true);
        
    }//GEN-LAST:event_btnInsertAdminsActionPerformed

    private void btnShowAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAdminsActionPerformed
        // TODO add your handling code here:
        ShowAdmins sa = new ShowAdmins();
        sa.setLocationRelativeTo(this);
        sa.setVisible(true);        
    }//GEN-LAST:event_btnShowAdminsActionPerformed

    private void btnCambiarLogo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarLogo4ActionPerformed
       ShowTeachers ST = new ShowTeachers();
       ST.setLocationRelativeTo(this);
       ST.setVisible(true);
    }//GEN-LAST:event_btnCambiarLogo4ActionPerformed

    private void btnStartAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartAppActionPerformed
       libraries.GetDate.compareDates();
       Day today = libraries.WorkingDays.isWorkingDay();
       if(!today.isWorkingDay()){
           JOptionPane.showMessageDialog(this, "Hoy no es un dia laboral, "+ today.getDesciption());
       } 
       
      App app = new App();
      app.setLocationRelativeTo(this);
      app.setVisible(true);
      this.dispose();
      
    }//GEN-LAST:event_btnStartAppActionPerformed

    private void printConstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printConstanciaActionPerformed

       EmisorPannel EP = new EmisorPannel();
       EP.setLocationRelativeTo(this);
       EP.setVisible(true);
  
        
    }//GEN-LAST:event_printConstanciaActionPerformed

    private void btnEditCartaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCartaTrabajoActionPerformed
      WorkLetterEditPannel WLEP = new WorkLetterEditPannel();
      WLEP.setLocationRelativeTo(this);
      WLEP.setVisible(true);
    }//GEN-LAST:event_btnEditCartaTrabajoActionPerformed

    private void btbInstitucionDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbInstitucionDataActionPerformed
        InstitutionDataForm idf = new InstitutionDataForm();
        idf.setLocationRelativeTo(this);
        idf.setVisible(true);
    }//GEN-LAST:event_btbInstitucionDataActionPerformed

    private void btnCambiarLogo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarLogo5ActionPerformed
        // TODO add your handling code here:
        ShowAssitance SA = new ShowAssitance();
        SA.setLocationRelativeTo(this);
        SA.setVisible(true);
    }//GEN-LAST:event_btnCambiarLogo5ActionPerformed

    private void btbCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCalendarActionPerformed
        // TODO add your handling code here:
        HollydayCalendar hdc = new HollydayCalendar();
        hdc.setLocationRelativeTo(this);
        hdc.setVisible(true);
    }//GEN-LAST:event_btbCalendarActionPerformed

    private void btbLeavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbLeavesActionPerformed
        LeavesPannel lp = new LeavesPannel();
        lp.setLocationRelativeTo(this);
        lp.setVisible(true);
    }//GEN-LAST:event_btbLeavesActionPerformed

    
    public void updateAlllogos(){
        lblLogo.setIcon(env.Enviroment.getLogoIcon(logoWidth, logoHeight));
        lblMainLogo.setIcon(env.Enviroment.getLogoIcon(lblMainLogo.getWidth(), lblMainLogo.getHeight()));
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCalendar;
    private javax.swing.JButton btbInstitucionData;
    private javax.swing.JButton btbLeaves;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCambiarLogo;
    private javax.swing.JButton btnCambiarLogo4;
    private javax.swing.JButton btnCambiarLogo5;
    private javax.swing.JButton btnEditCartaTrabajo;
    private javax.swing.JButton btnInsertAdmins;
    private javax.swing.JButton btnInsertTeacher;
    private javax.swing.JButton btnLogoRestore;
    private javax.swing.JButton btnShowAdmins;
    private javax.swing.JButton btnStartApp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JButton printConstancia;
    // End of variables declaration//GEN-END:variables
}
