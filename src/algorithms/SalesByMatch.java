package algorithms;

import java.util.Arrays;
import java.util.List;

public class SalesByMatch {

	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
			Integer[] arr = ar.toArray(new Integer[n]);
			int count=0;
			a: for(int i=0;i<n;i++){
				for(int j=i+1; j<n;j++){
					if(arr[i]==arr[j]){
						arr[j]=arr[n-1];
						count++;
						n--;
						continue a;
					}
				}
			}
			return count;
	    }
	
	public static void main(String[] args) {
		System.out.println(sockMerchant(9,Arrays.asList(10 ,20 ,20 ,10 ,10 ,30 ,50 ,10 ,20)));
	}
}
