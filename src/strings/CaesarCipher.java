package strings;

public class CaesarCipher {

	public static String caesarCipher(String s, int k) {
	    // [65-90] -------->[A-Z] [97-122] ------->[a-z]
		String cc="";
		int rem=k%26;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c>=65 && c<=90)
				cc= (c+rem >90) ? cc+(char)((c+rem-91)+65) : cc+(char)(c+rem);
			else if(c>=97 && c<=122)
				cc= (c+rem >122) ? cc+(char)((c+rem-123)+97) : cc+(char)(c+rem);
			else
				cc = cc+s.charAt(i);
		}
		return cc;
	}
	
	public static void main(String[] args) {
		System.out.println(caesarCipher("www.abc.xy", 87));
	}
}
