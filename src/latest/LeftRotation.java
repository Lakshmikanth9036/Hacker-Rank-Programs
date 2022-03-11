package latest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		for(int i = 0 ; i < d ; i++){
			int cur = arr.get(0);
			for(int j=arr.size()-1; j>=0; j--){
				int next = arr.get(j);
				arr.set(j, cur);
				cur = next;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int d = 2;
		rotateLeft(d, list).forEach(System.out::print);
		in.close();
	}
}
