package implementation;

import java.util.Arrays;
import java.util.List;

public class DesignerPDFViewer {

	public static int designerPdfViewer(List<Integer> h, String word) {
		int max = 0;
		for(int i=0; i<word.length(); i++){
			int index = word.charAt(i) - 'a';
			if(max < h.get(index))
				max = h.get(index);
		}
		return max*word.length();

	 }
	
	public static void main(String[] args) {
		System.out.println(designerPdfViewer(Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5), "abc"));
	}
}
