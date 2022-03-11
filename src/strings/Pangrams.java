package strings;

public class Pangrams {

	public static String pangrams(String s) {
		int[] freq = new int[26];
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				freq[s.charAt(i)-'A']++;
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
				freq[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++){
			if(freq[i]==0)
				return "not pangram";
		}
		return "pangram";
	}

	public static void main(String[] args) {
		System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
	}
}
