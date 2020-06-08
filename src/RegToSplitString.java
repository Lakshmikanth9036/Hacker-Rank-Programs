import java.util.Arrays;
import java.util.Scanner;

public class RegToSplitString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
        int k=in.nextInt();
		String[] str=s.split("(?<=\\G.{"+k+"})");
		/*(?<=) - Positive lookbehind expression
		\G - Boundary match
		. - anything
		{2} - 2 characters long*/
		System.out.println(Arrays.toString(str));
	}

}
