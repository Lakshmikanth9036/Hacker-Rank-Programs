package algorithms;

public class SherlockAndSquares {

	public static int firstRoot(int a, int b){
		 for(int i=a; i<=b; i++){
		    	double d= Math.sqrt(i);
		    	if(i%d==0){
		    		return (int)d;
		    	}
		    }
		 return 0;
	}
	
	public static int squares(int a, int b) {
		if(firstRoot(a, b)==0)
			return 0;
		int f=firstRoot(a, b)+1,count=1;
		while(f*f<=b){
			if(f*f<=b)
				count++;
			f++;
		}
		return count;
	  }
	
	public static void main(String[] args) {
		
		System.out.println(squares(3, 9));
	}
}
