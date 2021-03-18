package algorithms;

public class AppleAndOrange {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount = 0;
		int orangeCount = 0;
		for(int i = 0; i<apples.length; i++){
			int res = a + apples[i];
			if(res >= s && res <=t)
				appleCount++;
		}
		for(int i = 0; i<oranges.length; i++){
			int res = b + oranges[i];
			if(res >= s && res <=t)
				orangeCount++;
		}

		System.out.println(appleCount);
		System.out.println(orangeCount);
    }
	public static void main(String[] args) {
		countApplesAndOranges(2, 3, 1, 5, new int[]{1,1},new int[]{2});
	}
}
