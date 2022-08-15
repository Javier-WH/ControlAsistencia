package main;

import Actors.Day;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import pannels.ConfirmClose;


public class App extends javax.swing.JFrame {
    private boolean startClock = true; 
    
    public App() {
        initComponents();
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight()));
        lblImagen.setIcon(env.Enviroment.getBackground3Icon(lblImagen.getWidth(), lblImagen.getHeight()));
        txtCI.requestFocus();
        lbltitle.setIcon(env.Enviroment.getTitleIcon(lbltitle.getWidth(), lbltitle.getHeight()));
        startClock();
        
        Day today = libraries.WorkingDays.isWorkingDay();
        
        if(!today.isWorkingDay()){
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            txtCI.setVisible(false);
            txtPassword.setVisible(false);
            btnAccept.setVisible(false);
            lblMessage.setText("Hoy no es un dia laboral");
            lblMessage1.setText(today.getDesciption());
        } else{
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            txtCI.setVisible(true);
            txtPassword.setVisible(true);
            btnAccept.setVisible(true);
            lblMessage.setText("");
            lblMessage1.setText("");
        }
       
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }
    public void startClock() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (startClock) {
                        setClockTime(); 
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException ex) {
                   JOptionPane.showMessageDialog(null, ex.getMessage());
                }
   
            }
        });
       
            t1.start();
    }

    public void stopClock(){
    
        startClock = false;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        lblMessage1 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblClock = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 90, 110));
        jPanel2.add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 80));

        inputPanel.setBackground(new java.awt.Color(51, 102, 0));
        inputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMessage1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMessage1.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtCI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCI.setForeground(new java.awt.Color(51, 102, 0));
        txtCI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        txtCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 102, 0));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula");

        btnAccept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(51, 102, 0));
        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel2.add(inputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 340, 350));

        btnStop.setBackground(new java.awt.Color(204, 0, 0));
        btnStop.setForeground(new java.awt.Color(255, 255, 255));
        btnStop.setText("X");
        btnStop.setBorder(null);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        jPanel2.add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 20, 20));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));

        lblClock.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 255, 255));
        lblClock.setText("00:00:00AM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 270, 410, 70));
        jPanel2.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        exitApp(); 
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        
        libraries.GetDate.compareDates();
        Day today = libraries.WorkingDays.isWorkingDay();
        
        if(!today.isWorkingDay()){
           JOptionPane.showMessageDialog(this, "Hoy no es un dia laboral, "+ today.getDesciption());
        }else{
            String ci = txtCI.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String response = controllers.AutenticationController.autenticateUser(ci, password);

            try {
                Integer.parseInt(response);
                if (!controllers.AssistenceController.alreadyAsistence(response)) {
                    boolean res = controllers.AssistenceController.insertAssistance(response);
                    if (res) {
                      clean();
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo registrar la asistencia");
                    }
                }else{
                   JOptionPane.showMessageDialog(this, "La asistencia ya ha sido registrada el dia de hoy");
                   clean();
                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, response);
            }
        }  
    }//GEN-LAST:event_btnAcceptActionPerformed
    
    public void setClockTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalDateTime now = LocalDateTime.now();
        lblClock.setText(dtf.format(now));
    }
    
    
    public void clean() {
        txtCI.setText("");
        txtPassword.setText("");
    }

    private void exitApp(){
        try {
           ConfirmClose CC = new ConfirmClose(this);
           CC.setLocationRelativeTo(this);
           CC.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
   
        exitApp();
        //////////////////////////
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      stopClock();

    }//GEN-LAST:event_formWindowClosed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnStop;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtCI;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
