package strings;

import java.util.regex.Pattern;

public class StrongPassword {

	public static int minimumNumber(int n, String password) {
	    // Return the minimum number of characters to make the password strong
		int count =0;
	
		if(!Pattern.matches(".*[a-z].*", password))
			count++;
		if(!Pattern.matches(".*[A-Z].*", password))
			count++;
		if(!Pattern.matches(".*[0-9].*", password))
			count++;
		if(!Pattern.matches(".*[!@#$%^&*()+-].*", password))
			count++;
		if(n<6){
			int c = n+count;
			if(c<6){
				c= 6-c;
				count +=c; 
			}
		}
			
		return count;
	 }
	
	public static void main(String[] args) {
		System.out.println(minimumNumber(7, "AUzs-nV"));
		System.out.println(Pattern.matches(".*[!@#$%^&*()+-].*", "AUzs-nV"));
		
	}
}
