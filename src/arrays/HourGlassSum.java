package arrays;

import java.util.Scanner;

public class HourGlassSum {

	static int hourglassSum(int[][] arr) {
		int maxVal = 0;
		for (int i = 0; i < 4; i++) {
			int val = 0;
			for (int j = 0; j < 4; j++) {
				val = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				if (i == 0 && j == 0) {
					maxVal = val;
				}
				if (maxVal < val) {
					maxVal = val;
				}
			}
		}
		return maxVal;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int maxVal = hourglassSum(arr);
		System.out.println(maxVal);
		in.close();
	}
}
