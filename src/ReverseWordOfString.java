import java.util.Scanner;

public class ReverseWordOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine();
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++){
			String s1=str[i];
			String reverse="";
			for(int j=s1.length()-1;j>=0;j--){
				reverse=s1.charAt(j)+"";
				System.out.print(reverse);
			}
			System.out.print(" ");
		}
 	}

}
