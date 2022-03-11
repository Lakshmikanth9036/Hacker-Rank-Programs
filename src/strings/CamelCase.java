package strings;

public class CamelCase {

	 public static int camelcase(String s) {
		 // ASCII [A-Z] -> 65-90
		 int count=1;
		 for(int i=0;i<s.length();i++){
			 if(s.charAt(i)>=65 && s.charAt(i)<=90)
				 count++;
		 }
		 return count;
	}
}
