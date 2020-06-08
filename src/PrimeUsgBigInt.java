import java.math.BigInteger;
import java.util.Scanner;

public class PrimeUsgBigInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n=in.nextLine();
		BigInteger b=new BigInteger(n);
		boolean res=b.isProbablePrime(1);
		if(res==true)
			System.out.println("prime");
		else
			System.out.println("not prime");

	}

}
