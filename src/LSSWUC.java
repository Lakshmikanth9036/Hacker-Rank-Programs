import java.util.Arrays;
import java.util.Scanner;

public class LSSWUC {
	
	static String ss(String s){
		String ss = "";
		for(int i=0; i<s.length(); i++){
			String ch = ""+s.charAt(i);
			if(!ss.contains(ch))
				ss = ss+ch;
			else
				break;
		}
		return ss;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.next();
		String ss = s;
		String rs = "";
		int k = 1;
		
		for(int i=0 ; i<s.length(); i++, k++){
			String s1 = ss(ss);
			if(s1.length()>rs.length())
				rs = s1;
			if(i<s.length()-1)
				ss = s.substring(k);
			/*System.out.println(rs+" "+k+" "+ss);*/
		}
		
		char[] largestSubString = rs.toCharArray();
		System.out.println("The longest substring: "+Arrays.toString(largestSubString));
		System.out.println("The longest substring length: "+largestSubString.length);
		
	}
}
