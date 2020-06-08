import java.util.Scanner;

public class FirstUniqueRepeated {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = in.nextLine();
		String uc = "";
		String rc = "";
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(s.indexOf(ch) == s.lastIndexOf(ch))
				uc = uc+ch;
			else
				rc = rc+ch;
		}
		
		System.out.println("First occuracnce of the unique charater is :"+uc.charAt(0));
		System.out.println("First occuracnce of the repeated charater is :"+rc.charAt(0));
	}

}
