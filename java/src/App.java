import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static List<LocalDate> dateList = new ArrayList<LocalDate>();

    public static void main(String[] args) {
        final LocalDate start= new LocalDate(2021,02,01);
        final LocalDate end = new LocalDate(2021,02,28);
        LocalDate weekday= start;
        if(start.getDayOfWeek() == DateTimeConstants.SATURDAY || start.getDayOfWeek() == DateTimeConstants.SUNDAY){
            weekday = weekday.plusWeeks(1).withDayOfWeek(DateTimeConstants.MONDAY);
        }
        while (weekday.isBefore(end)){
            System.out.println(weekday);
            dateList.add(weekday);
            if (weekday.getDayOfWeek() == DateTimeConstants.FRIDAY){
                weekday=weekday.plusDays(3);
            }else{
                weekday= weekday.plusDays(1);
            }
        }
        System.out.println(dateList.size());
    }
}
