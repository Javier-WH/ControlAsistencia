package libraries;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

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

    public static String getCurrentMonth() {
        int month = cal.get(Calendar.MONTH);
        return String.valueOf(month + 1);
    }

    public static String getCurrentDay() {
        int year = cal.get(Calendar.DAY_OF_WEEK);
        return String.valueOf(year);
    }

    public static boolean isWeekEnd() {
        String currentDay = getCurrentDay();

        if (currentDay.equals("1") || currentDay.equals("7")) {
            return true;
        }
        return false;
    }
    ////////////////

    ///////////////////
 

    public static void compareDates() {
        Date currentDate = new Date();
        String savedDate = env.GetLocalConfig.getSavedDate();

        try {

            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date parsed = format.parse(savedDate);
            java.sql.Timestamp sql = new java.sql.Timestamp(parsed.getTime());

            if (currentDate.before(sql)) {
                JOptionPane.showMessageDialog(null, "La hora o la fecha de su sistema operativo no concuerda con la ultima hora y fecha registrada, corriga la hora de su sistema operativo y abra de nuevo este programa para continuar", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                saveCurrentDate();
            }
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void saveCurrentDate() {

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String dd = String.valueOf(dateFormat.format(date));
        //System.out.println("date to save: "+dd);
        env.GetLocalConfig.setCurrentDate(dd);
    }

    public static boolean isLapYear(double year) {

        if ((year / 4) == (int) (year / 4)) {
            if ((year / 100) == (int) (year / 100)) {
                if ((year / 400) == (int) (year / 400)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    //30 dias abril, julio, sepiempre y noviembre
    //31 todos los demas, excepcion de febrero que son 28 dias.
}
