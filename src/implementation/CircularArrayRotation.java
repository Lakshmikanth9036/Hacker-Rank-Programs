package implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		int[] val = new int[a.size()];
		ArrayList<Integer> res = new ArrayList<>();
		int jump = k;
		if(jump>a.size())
			jump= jump%a.size();
		for (int i = 0; i < a.size(); i++) {
			int shift = i + jump;
			if (shift >= a.size())
				shift = shift - a.size();
			val[shift] = a.get(i);
		}
		for(Integer q: queries){
			res.add(val[q]);
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(circularArrayRotation(Arrays.asList(1,2,3), 4, Arrays.asList(0,1,2)));
	}

}
