package algorithms;

public class CatsAndAMouse {

	public static String catAndMouse(int x, int y, int z) {
		int catA=Math.abs(x-z);
		int catB=Math.abs(y-z);
		if(catA<catB)
			return "Cat A";
		else if(catB<catA)
			return "Cat B";
		return "Mouse C";
    }
	public static void main(String[] args) {
		System.out.println(catAndMouse(2, 5, 4));
	}
}
