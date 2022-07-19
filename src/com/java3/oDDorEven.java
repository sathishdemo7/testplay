package com.java3;

public class oDDorEven {
public static void main(String[] args) {
	int sum=0;
	for(int a=0;a<10;a++) {
		if(a%2==0) {
		System.out.println(a+" even");
		sum++;
		}
	}
	System.out.println(sum);
}
}
