package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {

	static boolean isCharAlphaNumaric(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.trim();
		List<String> tokens = new ArrayList<String>();
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != 0 && isCharAlphaNumaric(s.charAt(i)) && !isCharAlphaNumaric(s.charAt(i - 1))) {
				start = i;
			}
			if (i != 0 && !isCharAlphaNumaric(s.charAt(i)) && isCharAlphaNumaric(s.charAt(i - 1))
					|| i == s.length() - 1) {
				end = i;
				String temp;
				if (i == s.length() - 1 && isCharAlphaNumaric(s.charAt(i))) {
					temp = s.substring(start, end + 1);
				} else {
					if (i == s.length() - 1 && !isCharAlphaNumaric(s.charAt(start))) {
						continue;
					}
					temp = s.substring(start, end);

				}
				tokens.add(temp);
			}
		}
		System.out.println(tokens.size());
		tokens.forEach(System.out::println);
		in.close();
	}

}
