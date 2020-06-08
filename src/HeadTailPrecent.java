import java.util.Random;
import java.util.Scanner;

public class HeadTailPrecent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		Random rand = new Random();
		int head=0,tail=0;
		if(n>0){
			for(int i=0; i<n; i++){
				double val=Math.random();
				if(val<0.5)
					head++;
				else
					tail++;
			}
			
			System.out.println("Percent of head's got in "+n+" flips of coin is: "+head);
			System.out.println("Percent of tail's got in "+n+" flips of coin is: "+tail);
		}
		else
			System.out.println("Plz enter a even value of n");
		in.close();
	}
}
