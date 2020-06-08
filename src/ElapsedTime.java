import java.util.Scanner;

public class ElapsedTime {

	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);
		long start =System.currentTimeMillis();
		long stop;
		double time;
		System.out.println("Type a string when you want to stop the watch");
		String s = in.nextLine();
		stop = System.currentTimeMillis();
		time = (stop-start)/1000.0;
		System.out.println("Time taken type a string "+s+" is "+time+"s");
		in.close();
	}
}
