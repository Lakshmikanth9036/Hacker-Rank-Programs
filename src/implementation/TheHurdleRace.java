package implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

	public static int hurdleRace(int k, List<Integer> height) {
	    // Write your code here
		int max = Collections.max(height);
		if(max>k)
			return max-k;
		return 0;
	}
	
	public static void main(String[] args) {
		int portion = hurdleRace(4, Arrays.asList(1,6,3,5,2));
		System.out.println(portion);
	}

}
