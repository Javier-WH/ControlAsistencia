package pannels;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class InstitutionDataForm extends javax.swing.JFrame {


    public InstitutionDataForm() {
        initComponents();
        txtDirectorName.setText(env.Enviroment.getDirectorName());
        txtDirectorLastName.setText(env.Enviroment.getDirectorLastName());
        txtDirectorCi.setText(env.Enviroment.getDirectorCi());
        
        txtInstitutionName.setText(env.Enviroment.getOwnerName());
        txtInstiotutionAddress.setText(env.Enviroment.getOwnerAddress());
        
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icons/icon.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInstitutionName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInstiotutionAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDirectorName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDirectorLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDirectorCi = new javax.swing.JTextField();
        btnAcept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(51, 102, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la Institución");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dirección de la Institucion");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres del director");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos del director");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cédula del director");

        btnAcept.setText("Aceptar");
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDirectorCi, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDirectorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDirectorName, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtInstiotutionAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtInstitutionName, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAcept)))
                .addGap(60, 60, 60))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstitutionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstiotutionAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirectorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirectorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirectorCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAcept)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        // TODO add your handling code here:
       
        String institutionName = txtInstitutionName.getText();
        String institutionAddress = txtInstiotutionAddress.getText();
        String directorName = txtDirectorName.getText();
        String directorLastName = txtDirectorLastName.getText();
        String directorCi = txtDirectorCi.getText();
        
     
        
        if(institutionName.isEmpty() || institutionAddress.isEmpty() || directorName.isEmpty() || directorCi.isEmpty()|| directorLastName.isEmpty() ){  
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }else{
            
            env.Enviroment.setDirectorName(directorName);
            env.Enviroment.setDirectorLastName(directorLastName);
            env.Enviroment.setDirectorCi(directorCi);
            env.Enviroment.setOwnerName(institutionName);
            env.Enviroment.setOwnerAddress(institutionAddress);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_btnAceptActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtDirectorCi;
    private javax.swing.JTextField txtDirectorLastName;
    private javax.swing.JTextField txtDirectorName;
    private javax.swing.JTextField txtInstiotutionAddress;
    private javax.swing.JTextField txtInstitutionName;
    // End of variables declaration//GEN-END:variables
}
