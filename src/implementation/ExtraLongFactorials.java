package implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void extraLongFactorials(int n) {
		BigInteger b1=new BigInteger("1");
		for(int i=n; i>0; i--){
			BigInteger b2=new BigInteger(Integer.toString(i));
			b1 = b1.multiply(b2);
		}
		System.out.println(b1);
	}

	
	public static void main(String[] args) {
		extraLongFactorials(25);
	}

}
