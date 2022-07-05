package libraries;

import java.util.Calendar;

public class GetDate {

    private static Calendar cal = Calendar.getInstance();

    public static String getDayOfMonth() {
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        return String.valueOf(dayOfMonth);
    }

    public static String getMonthName() {
        int m = cal.get(Calendar.MONTH);
        String month = null;

        switch (m) {
            case 0:
                month = "Enero";
                break;
            case 1:
                month = "Febrero";
                break;
            case 2:
                month = "Marzo";
                break;
            case 3:
                month = "Abril";
                break;
            case 4:
                month = "Mayo";
                break;
            case 5:
                month = "Junio";
                break;
            case 6:
                month = "Julio";
                break;
            case 7:
                month = "Agosto";
                break;
            case 8:
                month = "Septiembre";
                break;
            case 9:
                month = "Octubre";
                break;
            case 10:
                month = "Noviembre";
                break;
            case 11:
                month = "Diciembre";
                break;

            default:
                month = "indeterminado";
        }
        
        return month;
    }
    
     public static String getCurrentYear() {
        int year = cal.get(Calendar.YEAR);
        return String.valueOf(year);
    }

}
