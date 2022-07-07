
package com.xworkz.stringapp;

import java.util.Scanner;

public class ReturnString {
	static String a;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		a=sc.next();
		reverse(a);
		sc.close();
	}
	static String  reverse(String name) {
		
		char ch[]=name.toCharArray();
		String revName="";
		for (int index = ch.length-1; index >=0; index--) {
			revName=revName+ch[index];
			System.out.println(revName);
			
		}
		return name;
	}
}
