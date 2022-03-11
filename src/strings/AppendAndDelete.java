package strings;

public class AppendAndDelete {
	
	public static int differenceCount(String s, String t){
		int count = 0;
		int i=0;
		int n = s.length();
		if(t.length()<s.length()){
			n=t.length();
			count = s.length()-t.length();
		} if(s.length()<t.length()){
			n=s.length();
			count = t.length()-s.length();
		}
		while(i<n){
			if(s.charAt(i)!=t.charAt(i))
				break;
			i++;
		}
		count = count+(n-i);
		return count;
	}
	
	public static String appendAndDelete(String s, String t, int k) {
	    // Write your code here
		int diffCount = differenceCount(s, t);
		int reqAppend = t.length()-(s.length()-diffCount);
		int moves = k-diffCount;
		int temp;
		if(t.length()>s.length()){
			if(moves>s.length())
				temp=moves%s.length();
			else
				temp=s.length()%moves;
			int reqLen = (t.length()+(moves-temp))-(diffCount+temp);
			if(reqLen == s.length())
				return "Yes";
			else
				return "No";
		}
			
		if(reqAppend<=moves)
			return "Yes";
		return "No";
	}
	public static void main(String[] args) {
		System.out.println(appendAndDelete("zzzzz", "zzzzzzz", 4));
	}
}
