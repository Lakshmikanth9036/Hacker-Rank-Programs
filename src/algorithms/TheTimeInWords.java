package algorithms;

public class TheTimeInWords {

	static String timeInWords(int h, int m) {
		String[] hours = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve" };
		String[] minutes = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nighteen", "twenty",
				"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
				"twenty eight", "twenty nine", "half" };
		if(m == 1)
			return "one minute past "+hours[h-1]; 
		if (m == 0)
			return hours[h - 1] + " o' clock";
		if(m%15==0){
			return m == 30 ? "half past "+hours[h-1] : m == 15 ? "quarter past "+hours[h-1]: "quater to "+hours[h];
		}
		if (m > 30) 
			return minutes[60-m-1] +" minutes to "+hours[h];
		else
			return minutes[m-1]+ " minutes past "+hours[h-1];
	}

	public static void main(String[] args) {
		System.out.println(timeInWords(1, 1));
	}
}
