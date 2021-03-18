package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> candles = new ArrayList<Integer>();
		
		for(int i=0 ; i<n; i++){
			Integer value = in.nextInt();
			candles.add(value);
		}
		int maxValue = candles.get(0);
		int count = 1;
		
		for(int i = 1; i<candles.size(); i++){
			if(maxValue < candles.get(i)){
				maxValue = candles.get(i);
				count = 1;
				continue;
			}
			if(maxValue == candles.get(i)){
				count++;
			}
		}
		System.out.println(count);
		
//		Integer max = Collections.max(candles);
//		Integer maxCount  = candles.stream().reduce(0, (count, val) -> val == max ? count + 1 : count);
		
//		System.out.println(maxCount);
		in.close();
	}
}
