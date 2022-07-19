package com.java;

public class stringreverse {
public static void main(String[] args) {
	String s="sathish";
	String n="";
	for(int i=s.length()-1;i>=0;i--) {
		char c = s.charAt(i);
		n=n+c;
	}
		System.out.println(n);
	}
	
}

