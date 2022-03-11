package algorithms;

import java.util.Arrays;
import java.util.List;

public class BillDivision {

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int total = 0;
		for(int i=0;i<bill.size(); i++){
			if(i==k)
				continue;
			total+=bill.get(i);
		}
		int c = b-(total/2);
		if(c>0)
			System.out.println(c);
		else
			System.out.println("Bon Appetit");
	}
	public static void main(String[] args) {
		bonAppetit(Arrays.asList(3,10,2,9), 1, 12);
	}
	
}
