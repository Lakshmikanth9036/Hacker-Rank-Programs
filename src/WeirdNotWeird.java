import java.util.Scanner;

public class WeirdNotWeird {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%2==1 || n>=6 && n<=20)
			System.out.println("Weird");
		else 
			System.out.println("Not Weird");
	}

}
