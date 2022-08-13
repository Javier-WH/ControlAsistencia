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
        //5026 lineas
        //env.GetLocalConfig.setStartConfig("0");
        startLoading();
        
    }
    
    
    public static void startLoading() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
              
                loading.setVisible(true);
                loading.checkList();
                //System.out.println(libraries.GetDate.isLapYear(2021));
                //System.out.println(controllers.HollydaysCalendar.isHollyDay("12-31"));
                //System.out.println(controllers.HollydaysCalendar.getHolydaysList());
                //System.out.println(libraries.GetDate.isWeekEnd());
                System.out.println(controllers.HollydaysCalendar.isHollyDay("11-11"));
                
                
            }
        });
        t1.start();

    }
    
    

  
}
