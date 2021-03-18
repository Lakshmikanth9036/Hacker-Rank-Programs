package algorithms;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		int length = time.length();
		String militaryHrs;
		String amOrPm = time.substring(length - 2, length);
		String hrs = time.substring(0, 2);
		int hour = Integer.parseInt(hrs);
		if(amOrPm.equals("PM")){
			if(hour < 12){
				hour = hour + 12;
				militaryHrs = hour+time.substring(2,length-2);
			}else{
				militaryHrs = time.substring(0,length-2);
			}
		}else{
			if(hour == 12){
				militaryHrs = "00"+time.substring(2,length-2);
			}else{
				militaryHrs = time.substring(0,length-2);
			}
		}
		System.out.println(militaryHrs);
		in.close();

	}
}
