package com.java2;

public class NumberOfInteger {
public static void main(String[] args) {
	int count=0;
	int rev=0;
	int rem=0;
	int num=1234567;
	while(num>0) {
		count++;
		num=num/10;
	}
	System.out.println(count);
}
}
