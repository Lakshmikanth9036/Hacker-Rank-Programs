package strings;

public class SuperReducedString {

	public static String superReducedString(String s) {
	    // Write your code here
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)==s.charAt(i+1)){
				s=s.replace(s.charAt(i)+""+s.charAt(i+1), "");
				i=-1;
			}
		}
		return s.length()>0 ? s : "Empty String";
	}
	
	public static void main(String[] args) {
		System.out.println(superReducedString("abbaabaa"));
	}
}
