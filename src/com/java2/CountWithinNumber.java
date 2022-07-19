package com.java2;

public class CountWithinNumber {
public static void main(String[] args) {
	int rem=0;
	int rev=0;
	int num=456;
	while(num>0) {
		rem=num%10;
		rev=rev+rem;
		num=num/10;
	}
	System.out.println(rev);
}
}
