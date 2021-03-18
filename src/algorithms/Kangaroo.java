package algorithms;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		int n=0;
		while (n < 10000) {
		    if (x1 + n * v1 == x2 + n * v2) {
		      return "YES";
		    }
		    n++;
		  }
		  return "NO";
	}

	public static void main(String[] args) {
		System.out.println(kangaroo(45, 7, 56, 2));
	}
}
