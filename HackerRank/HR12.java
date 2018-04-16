import java.util.*;
import java.text.SimpleDateFormat;

public class HR12 {
    public static String getDay(String day1, String month1, String year1) {
		try{
            int year = Integer.parseInt(year1);  
            int month = Integer.parseInt(month1); 
            int day = Integer.parseInt(day1); 
            // First convert to Date. This is one of the many ways.
            String dateString = String.format("%d-%d-%d", year, month, day);
            Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);

            // Then get the day of week from the Date based on specific locale.
            String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
            return dayOfWeek.toUpperCase();
            // System.out.println(dayOfWeek.toUpperCase()); // Friday
		}catch(Exception e){return "";}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}