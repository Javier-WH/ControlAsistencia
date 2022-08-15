package pannels;

import Actors.Users;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class EmisorPannel extends javax.swing.JFrame {

    private Users user = null;
     
    
    public EmisorPannel() {
        initComponents();
        lblLogo.setIcon(env.Enviroment.getBackgroundIcon(lblLogo.getWidth(), lblLogo.getHeight()));
        
        txtEmisorName.setText(env.Enviroment.getDirectorName());
        txtEmisorLastName.setText(env.Enviroment.getDirectorLastName());
        txtEmisorCi.setText(env.Enviroment.getDirectorCi());
        txtEmisorCharge.setText("Director");
              
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServiceTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCharge = new javax.swing.JComboBox<>();
        cbService = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEmisorCi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmisorName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmisorLastName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmisorCharge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Solicitante"));

        jLabel2.setText("Cédula ");

        txtCi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCiFocusLost(evt);
            }
        });
        txtCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Cargo");

        txtServiceTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceTimeActionPerformed(evt);
            }
        });
        txtServiceTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServiceTimeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtServiceTimeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServiceTimeKeyTyped(evt);
            }
        });

        jLabel6.setText("Tiempo de servicio");

        txtCharge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Director", "Sub-director", "Administrativo", "Obrero", "Administrativo", "Asesor Pedagogico", "Cultura", "Colaborador", " " }));

        cbService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "años", "meses", "dias" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtCi, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtCharge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtServiceTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtServiceTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 17, 310, 210));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Emisor"));

        jLabel7.setText("Cédula ");

        txtEmisorCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmisorCiActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        txtEmisorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmisorNameActionPerformed(evt);
            }
        });

        jLabel9.setText("Apellido");

        txtEmisorLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmisorLastNameActionPerformed(evt);
            }
        });

        jLabel10.setText("Cargo");

        txtEmisorCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmisorChargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmisorName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmisorCi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmisorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmisorCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmisorCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmisorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmisorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmisorCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 170));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 19, -1));

        btnImprimir.setBackground(new java.awt.Color(51, 102, 0));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/print2.png"))); // NOI18N
        btnImprimir.setText("      Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 310, 50));

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos de la constancia de trabajo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 659, 30));
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1, 379, 489));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtServiceTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceTimeActionPerformed

    private void txtEmisorCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmisorCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmisorCiActionPerformed

    private void txtEmisorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmisorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmisorNameActionPerformed

    private void txtEmisorLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmisorLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmisorLastNameActionPerformed

    private void txtEmisorChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmisorChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmisorChargeActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
            Users emisor = new Users();
            emisor.setCI(txtEmisorCi.getText());
            emisor.setName(txtEmisorName.getText());
            emisor.setLastName(txtEmisorLastName.getText());
            emisor.setCharge(txtEmisorCharge.getText());
  
        if(!isMissingData()){
            if(user == null){
                user = new Users();
                user.setName(txtName.getText());
                user.setLastName(txtLastName.getText());
                user.setCI(txtCi.getText());
                user.setCharge(String.valueOf(txtCharge.getSelectedItem()));
                
              }
            
             user.setServiceTime(txtServiceTime.getText() +" "+ String.valueOf(cbService.getSelectedItem()));
            
          
             
            PrintPage constancia = new PrintPage(user, emisor);
          
            try {

                PrinterJob pj = PrinterJob.getPrinterJob();
                pj.setPrintable(constancia);

                if(pj.printDialog()){
                    pj.print();
                }

            } catch (HeadlessException | PrinterException e) {

                JOptionPane.showMessageDialog(this, e);
            }
       
        }else{
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
        }
       
    }//GEN-LAST:event_btnImprimirActionPerformed

    
    
    public boolean isMissingData(){
    
        if(txtName.getText().isEmpty() ||
                txtLastName.getText().isEmpty() ||
                txtCi.getText().isEmpty() ||
                txtServiceTime.getText().isEmpty()){
        
            return true;
        }
        
        if(txtEmisorName.getText().isEmpty() ||
                txtEmisorLastName.getText().isEmpty() ||
                txtEmisorCi.getText().isEmpty() ||
                txtEmisorCharge.getText().isEmpty()){
            return true;
        }
        return false;
    }
    
    
    private void txtCiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCiFocusLost

        makeUser();
  
    }//GEN-LAST:event_txtCiFocusLost

    private void makeUser(){
       user = controllers.MakeUser.makeNewUser(txtCi.getText());
        if (user != null) {
            txtName.setText(user.getName());
            txtLastName.setText(user.getLastName());
            txtCi.setText(user.getCI());
            txtServiceTime.setText("");
            txtCharge.setSelectedItem(user.getCharge());

        } else {
            user = null;
            cleanUserData();
          }
    
    }
    
    private void txtServiceTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceTimeKeyTyped
        // TODO add your handling code here:
 
        
    }//GEN-LAST:event_txtServiceTimeKeyTyped

    private void txtServiceTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceTimeKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtServiceTimeKeyPressed

    private void txtServiceTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceTimeKeyReleased
        // TODO add your handling code here:
        
            if(txtServiceTime.getText().equals("1")){
            DefaultComboBoxModel DCBM = (DefaultComboBoxModel) cbService.getModel();
            DCBM.removeAllElements();
            DCBM.addElement("año");
            DCBM.addElement("mes");
            DCBM.addElement("dia");
        }else{
            DefaultComboBoxModel DCBM = (DefaultComboBoxModel) cbService.getModel();
            DCBM.removeAllElements();
            DCBM.addElement("años");
            DCBM.addElement("meses");
            DCBM.addElement("dias");
        
        }
    }//GEN-LAST:event_txtServiceTimeKeyReleased


    private void cleanUserData(){
        txtName.setText("");
        txtLastName.setText("");
        txtServiceTime.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cbService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JComboBox<String> txtCharge;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEmisorCharge;
    private javax.swing.JTextField txtEmisorCi;
    private javax.swing.JTextField txtEmisorLastName;
    private javax.swing.JTextField txtEmisorName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtServiceTime;
    // End of variables declaration//GEN-END:variables
}
