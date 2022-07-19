package JavaSamples;

import java.util.Collections;
import java.util.TreeSet;

public class removEDuplciates {
public static void main(String[] args) {
	int a[]= {2,3,4,2,3,4,5};
	TreeSet<Integer> tr= new TreeSet<Integer>();
	for(int b:a) {
		tr.add(b);
		
	}
	System.out.println(tr);
	
	Integer min = Collections.min(tr);
	System.out.println(min);
	Integer max = Collections.max(tr);
	System.out.println(max);
}
}
