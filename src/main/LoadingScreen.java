package main;

import Actors.Admins;
import static env.Enviroment.getLogoPath;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pannels.DataBaseConfData;

public class LoadingScreen extends javax.swing.JFrame {

    LoginFrame LG = null;

    public LoadingScreen() {
        initComponents();
        lblVersion.setText(env.Enviroment.getVersion());
        setLocationRelativeTo(null);
        lblImage.setIcon(env.Enviroment.getSplashScreenIcon(lblImage.getWidth(), lblImage.getHeight()));
        lblTitle.setIcon(env.Enviroment.getTitleIcon(lblTitle.getWidth(), lblTitle.getHeight()));
        progessBar.setValue(0);

    }

    public void checkList() {
        setMessage("Revisando los archivos de configuración...");
        env.GetLocalConfig.checkConfigurationFilesExists();
        addProgress(11);
        setMessage("Archivos de configuración correctos...");
        setMessage("Obteniendo configurción...");
        //env.GetLocalConfig.setStartConfig("0");
        String uses = env.GetLocalConfig.getStartConfig();
        // System.out.println(uses);

        setMessage("Verificando las fechas...");
        libraries.GetDate.compareDates();
          addProgress(5);
        if (connectToDB()) {
            addProgress(25);
            checkTables();
            addProgress(26);
            checkTablesContent();
            addProgress(15);
            checkAdminContent();
            addProgress(19);

            startApp();

            if (uses.equals("0")) {
                env.Enviroment.setLogoPath();
                LG.getLogoLabel().setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\images\\logo.png").getImage().getScaledInstance(LG.getLogoLabel().getWidth(), LG.getLogoLabel().getHeight(), Image.SCALE_SMOOTH)));

            }

            addUse(uses);
        }

    }

    public void addUse(String use) {
        try {
            int intUse = Integer.parseInt(use);
            int newUse = intUse + 1;
            env.GetLocalConfig.setStartConfig(String.valueOf(newUse));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

///////////connect DB
    private boolean connectToDB() {
        int DBcount = 0;
        boolean isDBconnected = false;
        while (DBcount < 5) {
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
            this.dispose();
            DataBaseConfData dbcd = new DataBaseConfData();
            dbcd.setVisible(true);
            Thread.currentThread().interrupt();

        }
        return isDBconnected;
    }
///////////////

    private void addProgress(int newProgress) {
        int currentProgress = progessBar.getValue();
        progessBar.setValue(currentProgress + newProgress);
    }

    public void setMessage(String message) {
        lblMessage.setText(message);
        try {
            Thread.sleep(200);
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

            setMessage("Conección con la base de datos exitosa");
            return true;
        }

    }

/////////////////
    /// Check tables
    public boolean checkTables() {

        setMessage("Verificando las tablas...");
        String resp = controllers.CheckDB.checkIstablesExists();
        if (resp.equals("OK")) {
            setMessage("Las tablas han sido encontradas...");
            return true;
        } else {
            setMessage("Error. La tabla " + resp + " no existe...");
            setMessage("Creando la tabla " + resp + "...");
            controllers.CheckDB.createTable(resp);
            setMessage("La tabla " + resp + " ha sido creada...");
            checkTables();
        }
        return false;
    }

    public boolean checkTablesContent() {

        setMessage("Verificando el contenido de la tabla de configuración...");
        if (!controllers.CheckDB.checkConfigTableContent()) {
            setMessage("El contenido de la tabla de configuración no es correcto...");
            controllers.CheckDB.fillConfigTable();
            setMessage("El contendio de la tabla configucaón se ha creado");
        }
        setMessage("El contenido de la tabla de configuración es correcto...");
        return true;
    }

    ///////////////////
    public boolean checkAdminContent() {
        setMessage("Verificando la existencia de Administradores...");
        if (!controllers.CheckDB.checkAdminTableContent()) {
            setMessage("Error. No se encontraron Administradores inscritos..");
            setMessage("Generando administrador por defecto...");

            Admins admin = new Admins();
            admin.setName("Default-Admin");
            admin.setAddress("No-Address");
            admin.setCI("123456");
            admin.setEmail("No-Email");
            admin.setPassword("admin");
            admin.setUser("admin");
            admin.setPhoneNumber("123456");

            if (controllers.InsertAdminController.insertAdmin(admin)) {
                setMessage("Administrador por defecto inscrito...");
                return true;
            } else {
                setMessage("ERROR");
                return false;
            }
        }
        setMessage("Administrador encontrado...");
        return true;
    }

    public void startApp() {
        setMessage("Iniciando el sistema...");
        LG = new LoginFrame();
        LG.setVisible(true);
        this.dispose();

    }

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
