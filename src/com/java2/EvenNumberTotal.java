package com.java2;

public class EvenNumberTotal {
public static void main(String []args) {
	int sum=0;
	int count=0;
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			count++;
			
			sum=sum+i;
		}
	}
	System.out.println(count);
	System.out.println(sum);
}
}
