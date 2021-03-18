package latest;

import java.util.Scanner;

public class FindDay {

	public static String findDay(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + 31 * m / 12) % 7;
		return d == 0 ? "SUNDAY"
				: d == 1 ? "MONDAY"
						: d == 2 ? "TUESDAY"
								: d == 3 ? "WEDNESDAY" : d == 4 ? "TURESDAY" : d == 5 ? "FRIDAY" : "SATURDAY";
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int year = in.nextInt();
		int day = in.nextInt();
		System.out.println(findDay(month, day, year));
		in.close();
	}
}
