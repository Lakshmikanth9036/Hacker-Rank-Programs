import java.util.Scanner;

public class StrLenComCap {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter the value of A");
	        String A=sc.next();
	        System.out.println("Enter the value of B");
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int ablen=A.length()+B.length();
	        System.out.println("Length of A and B is: "+ablen);
	        if(A.compareTo(B)<=0)
	                System.out.println("NO");
	            else
	                System.out.println("Yes");
	        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
	}
}
