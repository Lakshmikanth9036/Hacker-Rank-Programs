package algorithms;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistance {

	static int minimumDistances(int[] a) {
		int dist = Integer.MAX_VALUE;
		List<Integer> visited = new ArrayList<>();
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] == a[j] && !visited.contains(a[i])){
					visited.add(a[i]);
					dist = Integer.min(dist,Math.abs(i-j));
				}
			}
		}
		
		return dist != 2147483647 ? dist : -1;
    }
	
	public static void main(String[] args) {
		System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
		System.out.println(Integer.MAX_VALUE);
	}
}

