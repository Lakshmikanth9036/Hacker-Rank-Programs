import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string ");
		String a = in.nextLine();
		System.out.println("Enter the string ");
		String b = in.nextLine();
		a=a.toUpperCase();
		b=b.toUpperCase();
		if(a.length()==b.length()){
			for(int i=0;i<a.length();i++){
				for(int j=0;j<b.length();j++){
					System.out.print(i+"->");
					System.out.println(j);
					System.out.print(a+"->");
					System.out.println(b);
					if(a.charAt(i)==b.charAt(j)){
						a=a.substring(0,i)+a.substring(i+1);
						b=b.substring(0, j)+b.substring(j+1);
						j=-1;//After the successful execution of if loop j value will be decremented to -1 which will gets incremented to 0 in for loop  
						i=0;
					}
				}
			}
			if(a.equals(b))
				System.out.println("Anagrams");
			else
				System.out.println("Not Anagrams");
		}
		else
			System.out.println("Not Anagrams");	
	}
}
