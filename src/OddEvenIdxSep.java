import java.util.Scanner;

public class OddEvenIdxSep {
	public static void main( String args[] ) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			String s=in.next();
			String ev="";
			String od="";
			for(int j=0;j<s.length();j++){
				if(j%2==0)
					ev=ev+s.charAt(j);
				else
					od=od+s.charAt(j);
			}
			System.out.println(ev+" "+od);
		}
	}
}
