package implementation;

public class SaveThePrisoner {

	 public static int saveThePrisoner(int n, int m, int s) {
		 if(n>m){
			 if(s+m-1 > n)
				 return s+m-1-n;
			 return s+m-1;
		 }
		 int i = m%n;
		 if(s+i-1==0)
			 return n;
		 if(s+i-1 > n)
			 return s+i-1-n;
		 return i+s-1;
	 }
	
	public static void main(String[] args) {
		System.out.println(saveThePrisoner(654809340,204894365,472730208));
	}

}
