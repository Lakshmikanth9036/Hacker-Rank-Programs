package implementation;

public class BeautifulDaysAtTheMovies {

	public static int palin(int num) {
		int rev = 0;
		while (num > 0) {
			int r = num % 10;
			rev = r + rev * 10;
			num = num / 10;
		}
		return rev;
	}

	public static int beautifulDays(int i, int j, int k) {
		int interval = 0;
		for (int start = i; start <= j; start++) {
			if (Math.abs(start - palin(start)) % k == 0)
				interval++;
		}
		return interval;
	}

	public static void main(String[] args) {
		System.out.println(palin(123));
	}

}
