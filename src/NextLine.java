import java.util.Scanner;

public class NextLine {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int x=scan.nextInt();
        double y=scan.nextDouble();
        scan.nextLine();//caz nextLine reads the enter button that is we use to enter the previous input
        String st=scan.nextLine();
        System.out.println(i+x);
        System.out.println(d+y);
        System.out.println(s.concat(st));
        scan.close();
    }
}