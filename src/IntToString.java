import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=in.nextInt();
	    String s=String.valueOf(n);
	    if (n == Integer.parseInt(s)) {
	     System.out.println("Good job");
	    } else {
	     System.out.println("Wrong answer.");
	    }
	}

}
