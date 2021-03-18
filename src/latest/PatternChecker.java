package latest;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pattern = in.nextLine();
		try {
			Pattern.compile(pattern);
			System.out.println("Valid");
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid");
		}
		in.close();
	}
}
