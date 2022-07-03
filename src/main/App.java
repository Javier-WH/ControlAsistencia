package main;

import javax.swing.JOptionPane;
import pannels.ConfirmClose;


public class App extends javax.swing.JFrame {

    
    public App() {
        initComponents();
        
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight()));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCI = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtCI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Cedula");

        btnAccept.setBackground(new java.awt.Color(51, 153, 0));
        btnAccept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnStop.setBackground(new java.awt.Color(204, 0, 0));
        btnStop.setForeground(new java.awt.Color(255, 255, 255));
        btnStop.setText("X");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCI)
                    .addComponent(txtPassword)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnStop)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        ConfirmClose CC = new ConfirmClose(this);
        CC.setLocationRelativeTo(this);
        CC.setVisible(true);
        
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        String ci = txtCI.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        String response = controllers.AutenticationController.autenticateUser(ci, password);
        
        try {
           Integer.parseInt(response);
           boolean res = controllers.AssistenceController.insertAssistance(response);
           if(res){
              txtCI.setText("");
              txtPassword.setText("");
           }else{
               JOptionPane.showMessageDialog(this, "No se pudo registrar la asistencia");
           }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, response);
        }
        
        
    }//GEN-LAST:event_btnAcceptActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtCI;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
