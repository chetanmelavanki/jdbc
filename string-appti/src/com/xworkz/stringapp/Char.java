package com.xworkz.stringapp;

import java.util.Scanner;

public class Char {
	public static void main(String[] args) {
		
		charpy("INDIA");
		
	}
	static String  charpy(String name) {
		
		char ch[]=name.toCharArray();
		int end =5;
		String revName="";
		
		for (int i =0; i < end; i++) {
			for (int j = end-1; j>=i; j--) {
				System.out.print(" ");	
			}	
			for (int k =0; k <=i; k++) {
				System.out.print(ch[k]);
				System.out.print(" ");
			
			}
			System.out.println("");
		}
		return revName;
	}
}
