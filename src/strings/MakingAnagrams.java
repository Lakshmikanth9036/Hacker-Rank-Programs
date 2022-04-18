package strings;

public class MakingAnagrams {

	public static int[] frequency(String s){
		int[] count = new int[26];
		for(int i = 0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				count[ch-65]++;
			else if(ch >= 'a' && ch <= 'z')
				count[ch-97]++;
		}
		return count;
	}
	
	public static int makeAnagram(String s1, String s2){
		int[] c1 = frequency(s1);
		int[] c2 = frequency(s2);
		
		int count = 0;
		
		for (int i = 0; i < 26; i++) {
			int d = c1[i] - c2[i];
			if(d<0)
				d = d*-1;
			count = count+d;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(makeAnagram("abc", "cde"));
	}
}
