import java.math.BigInteger;
import java.util.Scanner;

public class Add_Mul_BigInt {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		BigInteger b1=new BigInteger(s1);
		BigInteger b2=new BigInteger(s2);
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
	}

}
