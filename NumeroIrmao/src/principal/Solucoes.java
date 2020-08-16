package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solucoes {
	
	
	public Solucoes() {
		
	}
	
	public int solution(int n) {
		char[] family = String.valueOf(n).toCharArray();
		List<Integer> integer = new ArrayList<Integer>();
		for(int i = 0 ; i < family.length ; ++i ) {
			integer.add(Character.getNumericValue(family[i]));
		}
		List<Integer> listOfNumbers = integer; 
	    Collections.sort(listOfNumbers, new MyComparator());
	    String outPut = "";
	    for(Integer i : listOfNumbers){
	     outPut += i;
	    }
	    if(Integer.parseInt(outPut)  < 100000000) {
	    	 return Integer.parseInt(outPut);
	    }else {
	    	return -1;
	    }
	   
	}

}

class MyComparator implements Comparator<Integer>{
	  @Override
	  public int compare(Integer i, Integer j) {
	    String str1 = i.toString() + j.toString();
	    String str2 = j.toString() + i.toString();
	    return str2.compareTo(str1);
	  }
	}
