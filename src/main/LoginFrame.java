package main;


import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pannels.RestorePasswordPannel;


public class LoginFrame extends javax.swing.JFrame {


    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
        controllers.LogoController.updateLogoAddress();//actualiza el logo usando la direccion en la base de datos
        
        
     
    
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight())); 
        lblBackGround.setIcon(env.Enviroment.getBackgroundIcon(lblBackGround.getWidth(), lblBackGround.getHeight()));
        lblTitle.setIcon(env.Enviroment.getTitleIcon(lblTitle.getWidth(), lblTitle.getHeight()));
        txtTitle.setText(env.Enviroment.getOwnerName());
        txtTitle.setOpaque(false);
        txtTitle.setBackground(new Color(0,0,0,0));
        txtTitle.setWrapStyleWord(true);
        
        ScrollTitle.getViewport().setOpaque(false);
        ScrollTitle.setOpaque(false);
                
       
        inputContainer.setBackground(new Color(2, 77, 16));
        chkPass.setBackground(new Color(2, 77, 16));
        lblVersion.setText(env.Enviroment.getVersion());
        
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }
    
    
   public JLabel getLogoLabel(){
       return lblLogo;
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputContainer = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        lblAdmin1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblAdmin2 = new javax.swing.JLabel();
        ScrollTitle = new javax.swing.JScrollPane();
        txtTitle = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        chkPass = new javax.swing.JCheckBox();
        lblClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assist Control");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputContainer.setBackground(new java.awt.Color(51, 51, 255));
        inputContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        inputContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        inputContainer.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 140, 180, 32));

        lblAdmin1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblAdmin1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1.setText("Contraseña");
        inputContainer.add(lblAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 181, 30));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        inputContainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 181, 32));

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 102, 51));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        inputContainer.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 181, 30));
        inputContainer.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 80));

        lblAdmin2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblAdmin2.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin2.setText("Administrador");
        inputContainer.add(lblAdmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 181, 30));

        ScrollTitle.setBackground(new java.awt.Color(242, 252, 249));
        ScrollTitle.setBorder(null);

        txtTitle.setEditable(false);
        txtTitle.setColumns(20);
        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setLineWrap(true);
        txtTitle.setRows(1);
        txtTitle.setBorder(null);
        ScrollTitle.setViewportView(txtTitle);

        inputContainer.add(ScrollTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, 80));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recuperar contraseña");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        inputContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        chkPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/closedEyeWhite.png"))); // NOI18N
        chkPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/openEyeWhite.png"))); // NOI18N
        chkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPassActionPerformed(evt);
            }
        });
        inputContainer.add(chkPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jPanel1.add(inputContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 310, 330));

        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClose.setForeground(new java.awt.Color(153, 153, 153));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 29, 26));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        lblTitle.setFont(new java.awt.Font("Miriam Libre", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 630, -1));
        jPanel1.add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 410));

        lblVersion.setForeground(new java.awt.Color(102, 51, 0));
        lblVersion.setText("Version 0.1");
        jPanel1.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        env.Enviroment.exitApp(getContentPane());
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        login();
    
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void login(){
    
        String user = txtUser.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        String messaje = controllers.AutenticationController.autenticateAdmin(user, password);
        if(!messaje.equals("ACCESS-GRANTED")){
            bitacora.Triggers.insertLog("Inicio de sección denegado al usuario: " + user , user);
            JOptionPane.showMessageDialog(getContentPane(), messaje);
        }else{
            bitacora.Triggers.insertLog(user+ " Inició correctamente seccion como administrador", user);
            ConfigFrame configuration = new ConfigFrame(this);
            configuration.setVisible(true);
            this.dispose();
        }
    
    
    
    }
    
    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        RestorePasswordPannel RPP = new RestorePasswordPannel();
        RPP.setLocationRelativeTo(this);
        RPP.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void chkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPassActionPerformed
        txtPassword.setEchoChar(chkPass.isSelected() ? '\0' : '•');
    }//GEN-LAST:event_chkPassActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              login();
          }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
           if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              login();
          }
    }//GEN-LAST:event_txtUserKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTitle;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox chkPass;
    private javax.swing.JPanel inputContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdmin1;
    private javax.swing.JLabel lblAdmin2;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextArea txtTitle;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
