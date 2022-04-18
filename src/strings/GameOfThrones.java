package strings;

public class GameOfThrones {

	public static String gameOfThrones(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count[ch - 97]++;
		}
		int odd=0;
		for(int i=0; i<26; i++){
			if(count[i]%2 !=0)
				odd++;
			if(odd>1)
				return "NO";
		}
		return "YES";
	}

}
