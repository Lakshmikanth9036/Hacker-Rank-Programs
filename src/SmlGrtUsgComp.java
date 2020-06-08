import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SmlGrtUsgComp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k = in.nextInt();
		int len=s.length();
		String[] str=new String[len-(k-1)];
		for (int i = 0; i <=s.length()-k; i++)
		{
			str[i]=s.substring(i, i+k);
		}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for(int i=0;i<=str.length-1;i++)
			System.out.println(str[i]);
	}
}

