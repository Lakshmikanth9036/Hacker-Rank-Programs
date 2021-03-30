package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		int start = 0;
		int i = 0;
		int max = 0;
		while (i < a.size()) {
			if (Math.abs(a.get(start) - a.get(i)) > 1) {
				start = i;
			}
			max = Math.max(max, i - start + 1);
			i++;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(pickingNumbers(Arrays.asList(1, 1, 1, 1, 5, 1)));
	}
}

// int maxCount = Integer.MIN_VALUE;
// for (int i = 0; i < a.size(); i++) {
// List<Integer> nums = new ArrayList<>();
// nums.add(a.get(i));
// for (int k = 0; k < a.size(); k++) {
// int count = 0;
// for (int j = 0; j < nums.size(); j++) {
// if (k != i && Math.abs(nums.get(j) - a.get(k)) <= 1) {
// count++;
// }
// }
// if (count == nums.size())
// nums.add(a.get(k));
// }
// maxCount = Integer.max(maxCount, nums.size());
// }
// return maxCount;