package implementation;

public class ViralAdvertising {
	
	public static int viralAdvertising(int n) {
		int like=0, adv=5;
		for(int i=0; i<n;i++){
			int l= (int)Math.floor(adv/2);
			like= like+l;
			adv = l*3;
		}
		return like;
	 }

	public static void main(String[] args) {
		System.out.println(viralAdvertising(5));
	}

}
