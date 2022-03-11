package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {
	    int[] maxMin = new int[2];
	    int min=scores.get(0);
	    int max=scores.get(0);
	    for(int i=1; i<scores.size(); i++){
	    	if(scores.get(i)<min){
	    		min=scores.get(i);
	    		maxMin[1]++;
	    	}
	    	if(scores.get(i)>max){
	    		max=scores.get(i);
	    		maxMin[0]++;
	    	}
	    }
	    List<Integer> mm = new ArrayList<>();
	    mm.add(maxMin[0]);
	    mm.add(maxMin[1]);
	    return mm;
	}
	
	public static void main(String[] args) {
		
		System.out.println(breakingRecords(Arrays.asList(10,5,20,20,4,5,2,25,1)));
	}
}
