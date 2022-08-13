package libraries;

import Actors.Day;


public class WorkingDays {
   
    public static Day isWorkingDay(){
        Day day = new Day();
        String currentDay = libraries.GetDate.getCurrentDay();
        String currentMonth = libraries.GetDate.getCurrentMonth();
        boolean isWeekend = GetDate.isWeekEnd();
        String isHolyDay = controllers.HollydaysCalendar.isHollyDay(currentMonth+"-"+currentDay);
 
        day.setDesciption("Dia se semana laboral");
 
        if(isWeekend){
            day.setWorkingDay(false);
            day.setDesciption("Es fin de semana");
        }
        if(!isHolyDay.equals("false")){
            day.setWorkingDay(false);
            day.setDesciption(isHolyDay);
        }
        return day;
    }
}
