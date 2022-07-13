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
        startLoading();
    }

    public static void startLoading() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                loading.setVisible(true);
                loading.checkList();
            }
        });
        t1.start();

    }
    
    

  
}
