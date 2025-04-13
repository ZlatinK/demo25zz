package Exercises;
import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplayTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The current Date and Time is : " + date);
        System.out.printf("\nCurrent Date time : %tc%n\n", System.currentTimeMillis());

        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("Europe/Sofia")));

        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
    }
}
