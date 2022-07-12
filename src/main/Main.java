package main;

public class Main { 
    private static LoadingScreen loading = new LoadingScreen();
    public static void main(String args[]) {
        /*
        if (env.ConnectionDB.connectionDB()) {
            //new LoadingScreen().setVisible(true);
            LoginFrame LF = new LoginFrame();
            LF.setVisible(true);
        } else {
            env.ConnectionDB.getError();
            System.exit(0);
        }
        */
       
       
        loading.setVisible(true);
        loading.checkList();
        
    }

    public static LoadingScreen getLoading() {
        return loading;
    }
    
    

  
}
