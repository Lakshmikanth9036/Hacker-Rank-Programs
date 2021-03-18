package latest;

import java.util.Scanner;

public class IP {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String ip = in.next();
		String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
		String pattern = num + "." +  num + "." +  num + "." + num;
		boolean isIP = ip.matches(pattern);
		if(isIP){
			System.out.println("Valid IP address.");
		} else{
			System.out.println("Invalid IP address.");
		}
		in.close();
	}
}
