import java.util.Scanner;

public class CheckPalin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = in.next();
		int srr[]=new int[26];
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='A' && c<='Z'){
				srr[c-65]++;
			}
			else if(c>='a' && c<='z'){
				srr[c-97]++;
			}
		}
		int oc=0;
		String s1="",s2="",os="";
		for(int i=0;i<srr.length;i++){
			if(srr[i]%2==0)
			{
				int n=srr[i];
				while(n>0)
				{
					s1=s1+(char)(i+65);
					s2=(char)(i+65)+s2;
					n=n-2;
				}
			}
			else
			{
				oc++;
				if(oc>1)
				{
					System.out.println("it is not a possible to make a palindrome");
					return;
				}
				int n=srr[i];
				while(n>0)
				{
					os=os+(char)(i+65);
					n--;
				}	
			}
		}
		System.out.println("Paindrome of the given string is "+s1+os+s2);
		in.close();
	}

}
