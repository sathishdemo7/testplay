package com.java;

public class armstrong {
public static void main(String[] args) {
	int num=153;
	int rev=0;
	int rem=0;
	while(num>0) {
		rem=num%10;
		rev=rev+(rem*rem*rem);
		num=num/10;
		
	}
	System.out.println(rev);
}
}
