package algorithms;

public class FormingAMagicSquare {

	static int formingMagicSquare(int[][] s) {
		int[][][] possiblePermutations = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, // 1

				{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } }, // 2

				{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } }, // 3

				{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } }, // 4

				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, // 5

				{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } }, // 6

				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } }, // 7

				{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },// 8
		};
		
		int minCost = Integer.MAX_VALUE;
		for(int pp=0; pp<8; pp++){
			int pCost = 0;
			for(int i=0; i<s.length; i++){
				for(int j=0; j<s[i].length; j++)
					pCost += Math.abs(s[i][j] - possiblePermutations[pp][i][j]);
			}
			minCost = Math.min(minCost, pCost);
		}
		return minCost;
	}

	public static void main(String[] args) {
		int[][] value = {{4,8,2},{4,5,7},{6,1,6}};
		System.out.println(formingMagicSquare(value));
	}
}
