import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		s=s.toLowerCase();
		HashMap<Character , Integer> hm= new HashMap<>();

		for(int i=0;i<s.length();i++){
			if(hm.containsKey(s.charAt(i))){
				int j=hm.get(s.charAt(i));
				hm.put(s.charAt(i), j+1);
			}
			else{
				hm.put(s.charAt(i), 1);
			}
		}

		int ecount=0,ocount=0;
		Set<Map.Entry<Character , Integer>> map=hm.entrySet();
		for(Map.Entry<Character, Integer> val: map){
			if(val.getValue()%2==0)
				ecount++;
			else
				ocount++;
		}
		
		LinkedList<Character> str = new LinkedList<Character>();
		
		if(ocount==1 || (ecount>0 && ocount<1)){
			System.out.println("Possible to make a palindrome with the given string: "+s);
			for(Map.Entry<Character, Integer> val: map){
				if(val.getValue()%2==0){
					int n=val.getValue();
					while(n!=0){
						str.addFirst(val.getKey());
						str.addLast(val.getKey());
						n=n-2;
					}
				}
				else{
					int n=val.getValue();
					int len=str.size();
					int i=len/2;
					while(n!=0){
						str.add(i, val.getKey());
						n--;
					}
				}		
			}
			System.out.print("Palindrome of the given string is: ");
			Iterator<Character> itr=str.iterator();
			while(itr.hasNext()){
				System.out.print(itr.next());
			}
		}
		else{
			System.out.println("Not possible to make a palindrome of the given string: "+s);
		}
	}
}
