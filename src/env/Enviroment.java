package env;

import Actors.Users;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Enviroment {

    ////////// database connection enviroment viables
    private static String databaseName = "assistcontrol";
    private static String databaseAddress = "jdbc:mysql://localhost:3306/";
    private static String dbUser = "root";
    private static String dbPassword = "";
    private static String logoIconPath = System.getProperty("user.dir") + "\\src\\images\\logo.png";
    private static String BackgroundPath = System.getProperty("user.dir") + "\\src\\images\\plazaBolivar1.jpg";
    private static String Background2Path = System.getProperty("user.dir") + "\\src\\images\\iglesia1.jpg";
    private static String Background3Path = System.getProperty("user.dir") + "\\src\\images\\plazaBolivar2.jpg";
    private static String titlePath = System.getProperty("user.dir") + "\\src\\images\\title.png";
    private static String logoCartaTrabajoPath = System.getProperty("user.dir") + "\\src\\images\\logoCartaTrabajo.png";
   

    public static String getDirectorName() {
        return controllers.InstitutionDataController.getDirectorName();
    }

    public static void setDirectorName(String directorName) {
        controllers.InstitutionDataController.setDirectorName(directorName);
    }

    public static String getDirectorLastName() {
        return controllers.InstitutionDataController.getDirectorLastName();
    }

    public static void setDirectorLastName(String directorLastName) {
        controllers.InstitutionDataController.setDirectorLastName(directorLastName);
    }

    public static String getDirectorCi() {
        return controllers.InstitutionDataController.getDirectorCi();
    }

    public static void setDirectorCi(String directorCi) {
        controllers.InstitutionDataController.setDirectorCi(directorCi);
    }

    public static String getDbUser() {
        return dbUser;
    }

    public static String getTextConstanciaTrabajo() {
        return controllers.InstitutionDataController.getWorkLetterText();
    }

    public static void setTextConstanciaTrabajo(String text) {
        controllers.InstitutionDataController.setWorkLetterText(text);
    }
      public static String getTextConstanciaTrabajo2() {
        return controllers.InstitutionDataController.getWorkLetter2Text();
    }

    public static void setTextConstanciaTrabajo2(String text) {
        controllers.InstitutionDataController.setWorkLetter2Text(text);
    }

    public static String getOwnerAddress() {
        return controllers.InstitutionDataController.getOwnerAddress();
    }

    public static void setOwnerAddress(String ownerAddress) {
        controllers.InstitutionDataController.setOwnerAddress(ownerAddress);
    }

    public static String getOwnerName() {
        return controllers.InstitutionDataController.getOwnerName();
    }

    public static void setOwnerName(String ownerName) {
        controllers.InstitutionDataController.setOwnerName(ownerName);
    }

    public static String getDbPassword() {
        return dbPassword;
    }

    public static void setDbUser(String user) {
        dbUser = user;
    }

    public static void setDbPassword(String password) {
        dbPassword = password;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String name) {
        databaseName = name;
    }

    public static String getDatabaseAddress() {
        return databaseAddress;
    }

    public static void setDatabaseAddress(String address) {
        databaseAddress = address;
    }

    public static String getContectionString() {

        String dbName = getDatabaseName();

        return getDatabaseAddress() + dbName + "?useSSL=false";
    }

    //////////////////////////////////////// 
    public static void exitApp(Container pannel) {
        int opt = JOptionPane.showOptionDialog(pannel, "¿Desea salir de el sistema?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Salir", "Cacelar"}, 1);
        if (opt == 0) {
            System.exit(0);
        }
    }

    /////////////////////////logo
    public static String getLogoPath() {
        return logoIconPath;
    }

    public static void setLogoPath() {
        logoIconPath = System.getProperty("user.dir") + "\\src\\images\\logo.png";
    }

    public static void setLogoPath(String Path) {
        logoIconPath = Path;
    }

    public static ImageIcon getLogoIcon(int width, int height) {
        return new ImageIcon(new ImageIcon(getLogoPath()).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }

    ////////////////////////////////////////////////background image
    public static String getBackgroundPath() {
        return BackgroundPath;
    }

    public static void setBackgroundPath(String Path) {
        BackgroundPath = Path;
    }

    public static ImageIcon getBackgroundIcon(int width, int height) {
        return new ImageIcon(new ImageIcon(getBackgroundPath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    public static String getBackground2Path() {
        return Background2Path;
    }

    public static void setBackground2Path(String Path) {
        Background2Path = Path;
    }

    public static ImageIcon getBackground2Icon(int width, int height) {
        return new ImageIcon(new ImageIcon(getBackground2Path()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    public static String getBackground3Path() {
        return Background3Path;
    }

    public static void setBackground3Path(String Path) {
        Background3Path = Path;
    }

    public static ImageIcon getBackground3Icon(int width, int height) {
        return new ImageIcon(new ImageIcon(getBackground3Path()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    /////////////////////////
    public static String getTitlePath() {
        return titlePath;
    }

    public static ImageIcon getTitleIcon(int width, int height) {
        return new ImageIcon(new ImageIcon(getTitlePath()).getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    ////////////////////////////////
    public static String getLogoCartaTrabajoPath() {
        return logoCartaTrabajoPath;
    }

    public static ImageIcon getLogoCartaTrabajo(int width, int height) {
        return new ImageIcon(new ImageIcon(getLogoCartaTrabajoPath()).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }

    ///////////////////////////////constancia de trabajo
  

    //<EMISOR><CEDULAEMISOR><CARGOEMISOR><DIRECCIONEMISOR><NOMBRERECEPTOR><CEDULARECEPTOR><CARGORECEPTOR><NOMBREINSTITUCION><TIEMPOSERVICIO><DIASEMISION><MESEMISION><ANOEMISION>
    public static String setConstanciaText(Users user, Users admin) {

        String emisorName = admin.getName() + " " + admin.getLastName();
        String emisorCi = admin.getCI();
        String emisorCharge = admin.getCharge();

        String userName = user.getName() + " " + user.getLastName();
        String userCi = user.getCI();
        String userCharge = user.getCharge();
        String userServiceTime = user.getServiceTime();

        String emptyText = getTextConstanciaTrabajo();
        
        String text = emptyText.replaceAll("<EMISOR>", emisorName);
        text = text.replaceAll("<CEDULAEMISOR>", emisorCi);
        text = text.replaceAll("<CARGOEMISOR>", emisorCharge);
        text = text.replaceAll("<DIRECCIONEMISOR>", getOwnerAddress());
        text = text.replaceAll("<NOMBRERECEPTOR>", userName);
        text = text.replaceAll("<CEDULARECEPTOR>", userCi);
        text = text.replaceAll("<CARGORECEPTOR>", userCharge);
        text = text.replaceAll("<NOMBREINSTITUCION>", getOwnerName());
        text = text.replaceAll("<TIEMPOSERVICIO>", userServiceTime);
        text = text.replaceAll("<DIASEMISION>", libraries.GetDate.getDayOfMonth());
        text = text.replaceAll("<MESEMISION>", libraries.GetDate.getMonthName());
        text = text.replaceAll("<ANOEMISION>", libraries.GetDate.getCurrentYear());
  

        return text;
    }
    
        public static String setConstanciaText2() {


        String text = getTextConstanciaTrabajo2();
       
        text = text.replaceAll("<DIASEMISION>", libraries.GetDate.getDayOfMonth());
        text = text.replaceAll("<MESEMISION>", libraries.GetDate.getMonthName());
        text = text.replaceAll("<ANOEMISION>", libraries.GetDate.getCurrentYear());
  

        return text;
    }

}////////////////////////////

