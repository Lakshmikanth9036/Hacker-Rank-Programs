package strings;

public class VowelSubstring {

	public static String findSubstring(String s, int k) {
	    // Write your code here
		int vcount=0;
		String res="Not found!";
		for(int i=0; i<=s.length()-k; i++){
			int count=0;
			for(int j=i; j<k+i; j++){
				String vowel="aeiou";
				if(vowel.contains(s.charAt(j)+""))
					count++;
			}
			if(vcount<count){
				vcount=count;
				res = s.substring(i,k+i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String s = "qwdfdr";
		
		System.out.println(findSubstring(s, 2));
	}
}
