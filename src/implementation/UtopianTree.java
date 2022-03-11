package implementation;

public class UtopianTree {
	
	public static int utopianTree(int n) {
		int utopianNum=1;
		if(n==0)
			return utopianNum;
		for(int i=1; i<=n; i++){
			if(i%2 != 0)
				utopianNum = utopianNum*2;
			else
				utopianNum++;
		}
		return utopianNum;
	}

	public static void main(String[] args) {
		System.out.println(utopianTree(5));
	}

}
