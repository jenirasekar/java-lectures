package abstract_class;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        System.out.println("Current time is " + new Date());
        System.out.println("Year " + calendar.get(Calendar.YEAR));
        System.out.println("Month " + calendar.get(Calendar.MONTH));
        System.out.println("Day " + calendar.get(Calendar.DATE));
        System.out.println("Hour " + calendar.get(Calendar.HOUR));
        System.out.println("Minute " + calendar.get(Calendar.MINUTE));
        System.out.println("Second " + calendar.get(Calendar.SECOND));
    }
}
