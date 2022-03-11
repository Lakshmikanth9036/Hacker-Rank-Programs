package strings;

import java.util.Arrays;
import java.util.List;

public class Gemstones {

	public static int gemstones(List<String> arr) {
		int[] count = new int[27];
		int cnt = 0,j=0;
		
	    for(String ar : arr){
	    	for(int i=0; i<ar.length(); i++){
	    		if(count[ar.charAt(i)-97]==j)
	    			count[ar.charAt(i)-97]++;
	    	}
	    	j++;
	    }
	    
	    for(int i=0; i<=26; i++){
	    	if(count[i]==arr.size())
	    		cnt++;
	    }
	   
	    return cnt;
	   }
	
	public static void main(String[] args) {
		System.out.println(gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));
	}
}
