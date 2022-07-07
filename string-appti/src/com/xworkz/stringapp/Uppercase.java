package com.xworkz.stringapp;

public class Uppercase {
	public static void main(String[] args) {
		
		Uppercase.upper("hello g0ogle");
	}
	static void upper(String name) {
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
			System.out.print(ch[i]);
		}
	}

}
