package algorithms;

public class DrawingBook {

	public static int pageCount(int n, int p) {
	    int left =n/2;
	    int right = n%2 ==0 ? n/2 : (n/2)+1;
	    int count = 0;
	    if(p<=left){
	    	if(p==1)
	    		return 0;
	    	for(int i=2; i<=left; i+=2){
	    		count++;
	    		if(i==p|| i+1==p)
	    			return count;
	    	}
	    } else{
	    	if((n%2==0 && p==n) || (n%2!=0 && (p==n || p==n-1)))
	    		return count;
	    	int l = n%2 == 0 ? n-1 : n-2;
	    	for(int i=l; i>=right; i-=2){
	    		count++;
	    		if(i==p|| i-1==p)
	    			return count;
	    	}
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		System.out.println(pageCount(6, 4));
	}
}
