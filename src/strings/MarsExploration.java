package strings;

public class MarsExploration {

	public static int marsExploration(String s) {
		int count=0;
		for(int i=0; i<=s.length()-3; i+=3){
			if(s.substring(i, i+3)=="SOS")
				continue;
			 if(s.charAt(i)!='S') count++;
			 if(s.charAt(i+1)!='O') count++;
			 if(s.charAt(i+2)!='S') count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(marsExploration("SOSSOT"));
	}
}
