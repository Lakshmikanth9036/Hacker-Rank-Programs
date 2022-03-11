package implementation;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor {

	public static String angryProfessor(int k, List<Integer> a) {
	    int late = 0, ontime=0;
	    for(int i=0; i<a.size(); i++){
	    	if(a.get(i)<=0){
	    		ontime++;
	    		if(ontime>=k)
	    			return "NO";
	  
	    	} else{
	    		late++;
	    		int ter = Math.abs(late+ontime-a.size()) + ontime;
	    		if(ter < k)
	    			return "YES";
	    	}	    	
	    }
	    return ontime>=k ? "NO" : "YES";

	 }
	
	public static void main(String[] args) {
		System.out.println(angryProfessor(4, Arrays.asList(-93,-86,49,-62,-90,-63,40,72,11,67)));
		System.out.println(angryProfessor(10, Arrays.asList(23,-35,-2,58,-67,-56,-42,-73,-19,37)));
		System.out.println(angryProfessor(9, Arrays.asList(13,91,56,-62,96,-5,-84,-36,-46,-13)));
		System.out.println(angryProfessor(8, Arrays.asList(45,67,64,-50,-8,78,84,-51,99,60)));
		System.out.println(angryProfessor(7, Arrays.asList(26,94,-95,34,67,-97,17,52,1,86)));
		System.out.println(angryProfessor(2, Arrays.asList(19,29,-17,-71,-75,-27,-56,-53,65,83)));
		System.out.println(angryProfessor(10, Arrays.asList(-32,-3,-70,8,-40,-96,-18,-46,-21,-79)));
		System.out.println(angryProfessor(9, Arrays.asList(-50,0,64,14,-56,-91,-65,-36,51,-28)));
		System.out.println(angryProfessor(6, Arrays.asList(-58,-29,-35,-18,43,-28,-76,43,-13,6)));
		System.out.println(angryProfessor(1, Arrays.asList(88,-17,-96,43,83,99,25,90,-39,86)));
	}

}
