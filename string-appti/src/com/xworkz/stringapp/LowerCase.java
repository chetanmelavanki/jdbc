package com.xworkz.stringapp;

public class LowerCase {
	public static void main(String[] args) {
		String a="HELLO Google";
		char ch[]=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
		if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char) (ch[i]+32);
		
			}
			System.out.print(ch[i]);
		}
		
	}
		

}
