import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmlGrtUsgCol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k = in.nextInt();
		List<String> al= new ArrayList<String>();
		for (int i = 0; i <=s.length()-k; i++)
		{
			al.add(s.substring(i, i+k));
		}
		Collections.sort(al);
		System.out.println(al.get(0));
		System.out.println(al.get(al.size()-1));
	}

}
