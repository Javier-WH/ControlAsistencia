package main;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {


    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
        controllers.LogoController.updateLogoAddress();
        lblLogo.setIcon(env.Enviroment.getLogoIcon(lblLogo.getWidth(), lblLogo.getHeight())); 
        lblBackGround.setIcon(env.Enviroment.getBackgroundIcon(lblBackGround.getWidth(), lblBackGround.getHeight()));
        lblTitle.setIcon(env.Enviroment.getTitleIcon(lblTitle.getWidth(), lblTitle.getHeight()));

        inputContainer.setOpaque(true);
        inputContainer.setBackground(new Color(2, 77, 16, 200));
    }
    
    
   public JLabel getLogoLabel(){
       return lblLogo;
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputContainer = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblAdmin1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assist Control");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputContainer.setBackground(new java.awt.Color(51, 51, 255));
        inputContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdmin.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Administrador");
        inputContainer.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 181, 30));

        txtUser.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        inputContainer.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 181, 32));

        lblAdmin1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblAdmin1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin1.setText("Contraseña");
        inputContainer.add(lblAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 181, 30));
        inputContainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 181, 32));

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 102, 51));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        inputContainer.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 181, 30));

        jPanel1.add(inputContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 200));

        lblTitle.setFont(new java.awt.Font("Miriam Libre", 0, 24)); // NOI18N
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 250, 90));

        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 29, 26));
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 106));
        jPanel1.add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

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
            
        String user = txtUser.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        String messaje = controllers.AutenticationController.autenticateAdmin(user, password);
        if(!messaje.equals("ACCESS-GRANTED")){
            JOptionPane.showMessageDialog(getContentPane(), messaje);
        }else{
            ConfigFrame configuration = new ConfigFrame(this);
            configuration.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
              if(env.ConnectionDB.connectionDB()){
                  LoginFrame LF = new LoginFrame();
                
                LF.setVisible(true);
              }else{
                  env.ConnectionDB.getError();
                  System.exit(0);
              }
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel inputContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdmin1;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
