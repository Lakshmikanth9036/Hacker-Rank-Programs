package strings;

public class HackerRankInAString {

	public static String hackerrankInString(String s) {
		char[] reqSeq = {'h','a','c','k','e','r','r','a','n','k'};
		int k=0;
		for(int i=0; i<s.length(); i++){
			if(k==reqSeq.length)
				break;
			if(s.charAt(i)==reqSeq[k])
				k++;
		}
		if(k==reqSeq.length)
			return "YES";
		return "NO";
		
	}
	
	public static void main(String[] args) {
		System.out.println(hackerrankInString("hackerworld"));
	}
}
