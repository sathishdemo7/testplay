package JavaSamples;

import java.util.Arrays;

public class AnaGram {
public static void main(String[] args) {
	String s1= "abcd";
	String s2= "bdac";
	if(s1.length()==s2.length()) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	String v1 = String.valueOf(c1);
	String v2 = String.valueOf(c2);
	if(v1.equals(v2)) {
		System.out.println("anagram");
	}
}
}
}
