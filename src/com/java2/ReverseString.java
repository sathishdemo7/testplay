package com.java2;

public class ReverseString {
public static void main(String[] args) {
	String s="Sathish";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		char charAt = s.charAt(i);
		rev=rev+charAt;
		
	}
	System.out.println(rev);
}
}
