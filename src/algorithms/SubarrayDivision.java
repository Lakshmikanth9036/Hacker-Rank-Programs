package algorithms;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {

	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		for(int i=0; i<=s.size()-m; i++){
			int total=0,n=i;
			while(n<i+m){
				total+=s.get(n);
				n++;
			}
			if(total==d)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(birthday(Arrays.asList(4), 4, 1));
	}
}
