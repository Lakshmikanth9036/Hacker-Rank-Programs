import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

public class FindingDay {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        int nmonth = Integer.parseInt(month);
	         int nday = Integer.parseInt(day);
	         int nyear = Integer.parseInt(year);
	        
	      Calendar calendar = Calendar.getInstance();
	  calendar.set(nyear, nmonth-1, nday);

	  System.out.println(new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());      
	    }
}
