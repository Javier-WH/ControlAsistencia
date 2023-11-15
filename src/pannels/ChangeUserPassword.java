package pannels;

import Actors.Users;
import javax.swing.JOptionPane;




public class ChangeUserPassword extends javax.swing.JFrame {
    private Users user;
    
    public ChangeUserPassword(Users user) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.user = user;
        lblName.setText(user.getName() + " " + user.getLastName());
        lblCi.setText("CI: " + user.getCI());
       
   
     
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        centalPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtPass2 = new javax.swing.JPasswordField();
        chkPass2 = new javax.swing.JCheckBox();
        chkPass1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCi = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        centalPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 6, 0, 0);
        centalPanel.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        centalPanel.add(txtPass1, gridBagConstraints);

        jLabel3.setText("Repite la contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 6, 0, 0);
        centalPanel.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        centalPanel.add(txtPass2, gridBagConstraints);

        chkPass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/closedEye.png"))); // NOI18N
        chkPass2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/openEye.png"))); // NOI18N
        chkPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPass2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 48, 20);
        centalPanel.add(chkPass2, gridBagConstraints);

        chkPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/closedEye.png"))); // NOI18N
        chkPass1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/openEye.png"))); // NOI18N
        chkPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPass1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 4, 0, 20);
        centalPanel.add(chkPass1, gridBagConstraints);

        getContentPane().add(centalPanel, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cambio de contraseña");

        lblCi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCi.setText("CI: 154474889");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Antonio Augusto Magallanes del Campo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCi))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton1.setText("Aceptar");
        jButton1.setMaximumSize(new java.awt.Dimension(76, 22));
        jButton1.setMinimumSize(new java.awt.Dimension(76, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        char[] password1Chars = txtPass1.getPassword();
        String password1 = new String(password1Chars);
        char[] password2Chars = txtPass2.getPassword();
        String password2 = new String(password2Chars);

        boolean isValidPassword = utils.verifyPasswordFormat.isValidFormat(password1);
        
        if(password1.isEmpty() || password2.isEmpty()){
            JOptionPane.showMessageDialog(this, "No ha suministrado ninguna contraseña");
        }else if(!isValidPassword){
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos un caracter especial, al menos una mayuscula, al menos una mayuscula, al menos 8 caracteres de largo y no puede tener espacios");
        }else if( !password1.equals(password2) ){
            JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales");
        }else{
            user.setPassword(password1);
            boolean updated = controllers.GetTeachersController.updateTeachersPassword(user);
            
            if(updated){
                JOptionPane.showMessageDialog(this, "Contraseña actualizada");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo actualizar la contraseña");
            }
                
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPass1ActionPerformed
        txtPass1.setEchoChar(chkPass1.isSelected() ? '\0' : '•');
    }//GEN-LAST:event_chkPass1ActionPerformed

    private void chkPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPass2ActionPerformed
        txtPass2.setEchoChar(chkPass2.isSelected() ? '\0' : '•');
    }//GEN-LAST:event_chkPass2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centalPanel;
    private javax.swing.JCheckBox chkPass1;
    private javax.swing.JCheckBox chkPass2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCi;
    private javax.swing.JLabel lblName;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    // End of variables declaration//GEN-END:variables
}
