import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 	System.out.println("Enter the String");
	        String S = in.next();
	        System.out.println("Enter the start index and end index");
	        int start = in.nextInt();
	        int end = in.nextInt();
	        System.out.print("SubString of the given String is: ");
	        System.out.print(S.substring(start, end));
	}

}
