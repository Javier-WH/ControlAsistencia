package pannels;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class WorkLetterEditPannel extends javax.swing.JFrame {


    public WorkLetterEditPannel() {
        initComponents();
        
        txtWorkLetter1.setText(env.Enviroment.getTextConstanciaTrabajo());
        txtWorkLetter2.setText(env.Enviroment.getTextConstanciaTrabajo2());
        
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtWorkLetter1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtWorkLetter2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnEmisorCi = new javax.swing.JButton();
        btnEmisorCharge = new javax.swing.JButton();
        btnInstitutionAddress = new javax.swing.JButton();
        btnReceptorName = new javax.swing.JButton();
        btnReceptorCi = new javax.swing.JButton();
        btnReceptorCharge = new javax.swing.JButton();
        btnServiceTime = new javax.swing.JButton();
        btnInstitutionName = new javax.swing.JButton();
        btnDays = new javax.swing.JButton();
        btnMonts = new javax.swing.JButton();
        btnYear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        mainPannel.setBackground(new java.awt.Color(51, 102, 0));
        mainPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar carta de Trabajo");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuerpo");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pie de pagina");

        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        txtWorkLetter1.setColumns(1);
        txtWorkLetter1.setLineWrap(true);
        txtWorkLetter1.setRows(5);
        jScrollPane3.setViewportView(txtWorkLetter1);

        txtWorkLetter2.setColumns(1);
        txtWorkLetter2.setLineWrap(true);
        txtWorkLetter2.setRows(5);
        jScrollPane4.setViewportView(txtWorkLetter2);

        jButton1.setText("Emisor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEmisorCi.setText("C.I. Emisor");
        btnEmisorCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmisorCiActionPerformed(evt);
            }
        });

        btnEmisorCharge.setText("Cargo Emisor");
        btnEmisorCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmisorChargeActionPerformed(evt);
            }
        });

        btnInstitutionAddress.setText("Dirección Institución");
        btnInstitutionAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitutionAddressActionPerformed(evt);
            }
        });

        btnReceptorName.setText("Receptor");
        btnReceptorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptorNameActionPerformed(evt);
            }
        });

        btnReceptorCi.setText("C.I Receptor");
        btnReceptorCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptorCiActionPerformed(evt);
            }
        });

        btnReceptorCharge.setText("Cargo Receptor");
        btnReceptorCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptorChargeActionPerformed(evt);
            }
        });

        btnServiceTime.setText("Tiempo Servico");
        btnServiceTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceTimeActionPerformed(evt);
            }
        });

        btnInstitutionName.setText("Nombre Institución");
        btnInstitutionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitutionNameActionPerformed(evt);
            }
        });

        btnDays.setText("Dias");
        btnDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaysActionPerformed(evt);
            }
        });

        btnMonts.setText("Meses");
        btnMonts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontsActionPerformed(evt);
            }
        });

        btnYear.setText("Año");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPannelLayout = new javax.swing.GroupLayout(mainPannel);
        mainPannel.setLayout(mainPannelLayout);
        mainPannelLayout.setHorizontalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPannelLayout.createSequentialGroup()
                                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReceptorName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInstitutionAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEmisorCi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInstitutionName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReceptorCi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReceptorCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(btnEmisorCharge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnServiceTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPannelLayout.createSequentialGroup()
                            .addComponent(btnDays, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMonts, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnYear, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        mainPannelLayout.setVerticalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmisorCi)
                    .addComponent(btnEmisorCharge)
                    .addComponent(jButton1))
                .addGap(8, 8, 8)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReceptorName)
                    .addComponent(btnReceptorCi)
                    .addComponent(btnReceptorCharge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInstitutionAddress)
                    .addComponent(btnInstitutionName)
                    .addComponent(btnServiceTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDays)
                    .addComponent(btnMonts)
                    .addComponent(btnYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAccept)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed

        if(txtWorkLetter1.getText().isEmpty() || txtWorkLetter2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El texto no puede estar vacío");
        }else{
            
            env.Enviroment.setTextConstanciaTrabajo(txtWorkLetter1.getText());
            env.Enviroment.setTextConstanciaTrabajo2(txtWorkLetter2.getText());
            this.dispose();
        
        }
 
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        insertTag("<EMISOR>");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEmisorChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmisorChargeActionPerformed
          insertTag("<CARGOEMISOR>");
    }//GEN-LAST:event_btnEmisorChargeActionPerformed

    private void btnReceptorChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptorChargeActionPerformed
           insertTag("<CARGORECEPTOR>");
    }//GEN-LAST:event_btnReceptorChargeActionPerformed

    private void btnEmisorCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmisorCiActionPerformed
       insertTag("<CEDULAEMISOR>");
    }//GEN-LAST:event_btnEmisorCiActionPerformed

    private void btnReceptorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptorNameActionPerformed
         insertTag("<NOMBRERECEPTOR>");
    }//GEN-LAST:event_btnReceptorNameActionPerformed

    private void btnReceptorCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptorCiActionPerformed
        insertTag("<CEDULARECEPTOR>");

    }//GEN-LAST:event_btnReceptorCiActionPerformed

    private void btnInstitutionAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitutionAddressActionPerformed
         insertTag("<DIRECCIONEMISOR>");
    }//GEN-LAST:event_btnInstitutionAddressActionPerformed

    private void btnInstitutionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitutionNameActionPerformed
        insertTag("<NOMBREINSTITUCION>");
    }//GEN-LAST:event_btnInstitutionNameActionPerformed

    private void btnServiceTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceTimeActionPerformed
          insertTag("<TIEMPOSERVICIO>");
    }//GEN-LAST:event_btnServiceTimeActionPerformed

    private void btnDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaysActionPerformed
        insertTag2("<DIASEMISION>");
    }//GEN-LAST:event_btnDaysActionPerformed

    private void btnMontsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontsActionPerformed
        insertTag2("<MESEMISION>");
    }//GEN-LAST:event_btnMontsActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
         insertTag2("<ANOEMISION>");
    }//GEN-LAST:event_btnYearActionPerformed

    public void insertTag(String tag){
         txtWorkLetter1.insert(tag, txtWorkLetter1.getCaretPosition());
    }
    
     public void insertTag2(String tag){
         txtWorkLetter2.insert(tag, txtWorkLetter2.getCaretPosition());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDays;
    private javax.swing.JButton btnEmisorCharge;
    private javax.swing.JButton btnEmisorCi;
    private javax.swing.JButton btnInstitutionAddress;
    private javax.swing.JButton btnInstitutionName;
    private javax.swing.JButton btnMonts;
    private javax.swing.JButton btnReceptorCharge;
    private javax.swing.JButton btnReceptorCi;
    private javax.swing.JButton btnReceptorName;
    private javax.swing.JButton btnServiceTime;
    private javax.swing.JButton btnYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainPannel;
    private javax.swing.JTextArea txtWorkLetter1;
    private javax.swing.JTextArea txtWorkLetter2;
    // End of variables declaration//GEN-END:variables
}
