package com.java2;

public class PalindromeNumber {
public static void main(String[] args) {
	int num=12345;
	int rem=0;
	int rev=0;
	int n=num;
	while(num>0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	System.out.println(rev);
	if(n==num) {
		System.out.println("palindome");
	}else {
		System.out.println("non palindrome");
	}
}
}
