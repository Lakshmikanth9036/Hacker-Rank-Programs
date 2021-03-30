package algorithms;

public class HalloweenSale {

	static int howManyGames(int p, int d, int m, int s) {
		int count = 0;
		if(p>s)
			return count;
		while (s >= m) {
			if (s >= p)
				count++;
			s -= p;
			p = (p - d) >= m ? p -= d :m;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(howManyGames(16 ,2 ,1 ,9981));
	}
}
