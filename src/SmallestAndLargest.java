import java.util.Scanner;

public class SmallestAndLargest {
		    public static String getSmallestAndLargest(String s, int k) {
		        String smallest = "";
		        String largest = "";
		        String temp;
		        int len=s.length();
				String[] str=new String[len-(k-1)];
				for (int i = 0; i <=s.length()-k; i++)
				{
					str[i]=s.substring(i, i+k);
				}
				for(int i=0;i<str.length;i++){
					for(int j=i+1;j<str.length;j++){
						if(str[i].compareTo(str[j])<0){
							temp=str[i];
							str[i]=str[j];
							str[j]=temp;
						}
					}
				}
				smallest=str[str.length-1];
				largest=str[0];
		        return "Smallest of the substring is: "+smallest + "\nLargest of the substring is: " + largest;
		    }


		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the string");
		        String s = scan.next();
		        System.out.println("Enter the substring length");
		        int k = scan.nextInt();
		        scan.close();
		        System.out.println(getSmallestAndLargest(s, k));
	}

}
