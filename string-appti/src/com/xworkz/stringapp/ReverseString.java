
package com.xworkz.stringapp;

import java.util.Scanner;

public class ReverseString {
	static String word;
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a string");
		word= scanner.next();
		reverse(word);
		scanner.close();
				
	}
	static void  reverse(String name) {
		
		char ch[]=name.toCharArray();
		
		for (int index = ch.length-1; index >=0; index--) {
			
			System.out.print(ch[index]);
			
		}
	}
}
