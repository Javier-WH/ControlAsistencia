package pannels;

import Actors.Admins;
import Actors.Questions;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

public class InsertAdmins extends javax.swing.JFrame {

  
    public InsertAdmins() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtQuestion2 = new javax.swing.JTextField();
        txtAnswer2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtQuestion1 = new javax.swing.JTextField();
        txtAnswer1 = new javax.swing.JTextField();
        txtAnswer3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtQuestion3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAnswer4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtQuestion4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre y apellidos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 105, 334, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula de identidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 143, -1, -1));
        jPanel1.add(txtCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 163, 156, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 143, -1, -1));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 163, 156, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 194, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Repite la contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 194, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electrónico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 257, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 277, 156, -1));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 277, 156, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Télefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 257, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 335, 710, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pregunta secreta 2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 138, -1));

        btnInsert.setText("Inscribir");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 138, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 219, 156, -1));

        txtPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 219, 156, -1));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Inscripción de administrador en el sistema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 410, 40));
        jPanel1.add(txtQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 156, -1));
        jPanel1.add(txtAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 156, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Respuesta 2");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pregunta secreta 1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Respuesta 1");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));
        jPanel1.add(txtQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 156, -1));
        jPanel1.add(txtAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 156, -1));
        jPanel1.add(txtAnswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 156, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pregunta secreta 3");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));
        jPanel1.add(txtQuestion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 156, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Respuesta 3");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));
        jPanel1.add(txtAnswer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 156, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Respuesta 4");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));
        jPanel1.add(txtQuestion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 156, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pregunta secreta 4");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       
           String messaje = "Se ha inscrito correctamente al administrador";
                 
           String name = txtName.getText(),
                    CI = txtCi.getText(),
                    user = txtUser.getText(),
                    password = String.valueOf(txtPassword.getPassword()),
                    password2 = String.valueOf(txtPassword2.getPassword()),
                    email = txtEmail.getText(),
                    phoneNumber = txtPhone.getText(),
                    address = txtAddress.getText(),
                    question1 = txtQuestion1.getText(),
                    question2 = txtQuestion2.getText(),
                    question3 = txtQuestion3.getText(),
                    question4 = txtQuestion4.getText(),
                    answer1 = txtAnswer1.getText(),
                    answer2 = txtAnswer2.getText(),
                    answer3 = txtAnswer3.getText(),
                    answer4 = txtAnswer4.getText();
          
           
           if(name.isEmpty() || CI.isEmpty() || user.isEmpty() || password.isEmpty() || password2.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || address.isEmpty() || question1.isEmpty() || question2.isEmpty() || answer1.isEmpty() || answer2.isEmpty()){
               
                messaje = "Debe llenar correctamente todos los campos";
           
           }else if(!password.equals(password2)){
                messaje = "Las contraseñas no son iguales";
           }else if(!libraries.RegEx.isMatch("^[0-9]*$", CI)){
                 messaje = "Debe ingresar un numero de cedula valido";
           }else if(!libraries.RegEx.isMatch("^[0-9]*$", phoneNumber)){
               messaje = "Debe ingresar un numero telefónico valido";
           }else if(!libraries.RegEx.isMatch("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email)){
                 messaje = "Debe ingresar una direccion de correo electronico valida";
           }else if(controllers.AutenticationController.adminExist(CI)){
                messaje = "El la cedula de identidad ya está resgistrada en el sistema";
           }else{
                Admins admin = new Admins();
                admin.setName(name);
                admin.setCI(CI);
                admin.setUser(user);
                admin.setPassword(password);
                admin.setEmail(email);
                admin.setPhoneNumber(phoneNumber);
                admin.setAddress(address);
                
                Questions questionAndAnswers = new Questions();
                questionAndAnswers.setQuestion1(question1);
                questionAndAnswers.setQuestion2(question2);
                questionAndAnswers.setQuestion3(question3);
                questionAndAnswers.setQuestion4(question4);
                questionAndAnswers.setAnswer1(answer1);
                questionAndAnswers.setAnswer2(answer2);
                questionAndAnswers.setAnswer3(answer3);
                questionAndAnswers.setAnswer4(answer4);

                boolean isAdminInserted =  controllers.InsertAdminController.insertAdmin(admin);
                controllers.InsertAdminController.insertQuestions(CI, questionAndAnswers);
               
               
               if(isAdminInserted){
                   txtName.setText("");
                   txtCi.setText("");
                   txtUser.setText("");
                   txtPassword.setText("");
                   txtPassword2.setText("");
                   txtEmail.setText("");
                   txtPhone.setText("");
                   txtAddress.setText("");
                   txtQuestion1.setText("");
                   txtQuestion2.setText("");
                   txtAnswer1.setText("");
                   txtAnswer2.setText("");
               }else{
                 messaje = "Ha ocurrido un error y no se ha podido insertar el administrador en la base de datos";
               }
            
           }
           
           JOptionPane.showMessageDialog(this, messaje);
           
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword2ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JTextField txtAnswer4;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtQuestion1;
    private javax.swing.JTextField txtQuestion2;
    private javax.swing.JTextField txtQuestion3;
    private javax.swing.JTextField txtQuestion4;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
