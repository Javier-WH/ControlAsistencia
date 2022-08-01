package libraries;



public class CreateDaysOfMonth {
    
    public static int crateDaysMonth(String year, String month){
        
        boolean isLapYear = GetDate.isLapYear(Double.parseDouble(year));
        int numberOfDays = 31;
        
        
        if(month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11")){
            numberOfDays = 30;
        }
        if(month.equals("2")){
            if(isLapYear){
                numberOfDays = 29;
            }else{
                numberOfDays = 28;
            }
        }
        
        return numberOfDays;
        
    }
    
}
