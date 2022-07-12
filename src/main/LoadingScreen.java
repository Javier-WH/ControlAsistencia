
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pannels.DataBaseConfData;





public class LoadingScreen extends javax.swing.JFrame {

   
    public LoadingScreen() {
        initComponents();
        lblVersion.setText(env.Enviroment.getVersion());
        setLocationRelativeTo(null);
        lblImage.setIcon(env.Enviroment.getSplashScreenIcon(lblImage.getWidth(), lblImage.getHeight()));
        lblTitle.setIcon(env.Enviroment.getTitleIcon(lblTitle.getWidth(), lblTitle.getHeight()));
        progessBar.setValue(0);
    }

    public void checkList() {
        connectToDB();
    }
///////////connect DB
    private void connectToDB() {
        int DBcount = 0;
        boolean isDBconnected = false;
        while (DBcount < 2) {
            if (checkConnectionDB()) {
                DBcount = 6;
                isDBconnected = true;
            } else {
                DBcount++;
                try {
                    Thread.sleep(2000); // se espera 2 segundos para intentar de nuevo la conección
                } catch (InterruptedException ex) {
                    Logger.getLogger(LoadingScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (!isDBconnected) {
            DataBaseConfData dbcd = new DataBaseConfData();
            dbcd.setVisible(true);

        }
    }

    private void addProgress(int newProgress){
        int currentProgress = progessBar.getValue();
        progessBar.setValue(currentProgress + newProgress);
    }
    private void setMessage(String message){  
        lblMessage.setText(message);
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Error desconocido " + ex.getMessage());
        }
      
    }

    private boolean checkConnectionDB() {
        setMessage("Conectandose con la Base de datos...");

        boolean isOK = env.ConnectionDB.connectionDB();
        
        if (!isOK) {
            setMessage("Error al conectarse con la base de datos...");
            return false;
       
        } else {
            addProgress(20);
            setMessage("Conección con la base de datos exitosa");
            return true;
        }
        
    }

/////////////////
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progessBar = new javax.swing.JProgressBar();
        lblMessage = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargando");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progessBar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        progessBar.setForeground(new java.awt.Color(51, 102, 0));
        progessBar.setValue(50);
        progessBar.setStringPainted(true);
        jPanel1.add(progessBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 178, 448, 34));

        lblMessage.setText("Cargando bloques de concreto....");
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 218, -1, -1));
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 20, 230, 82));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 600, 137));

        lblVersion.setText("version");
        jPanel1.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel3.setText("Desarrollado por los estudiantes del UPTLL \"Juana Ramírez\" en el 2022");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JProgressBar progessBar;
    // End of variables declaration//GEN-END:variables
}
