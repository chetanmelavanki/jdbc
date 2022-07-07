package com.xworkz.stringapp;

import java.util.Scanner;

public class LengthScanner {
	static String name;
	static int i=0;
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a sentence");
		name=scanner.nextLine();
		getLength(name);
		scanner.close()	;
	}
	
	public static void getLength(String str) {
		
		for (char ch : str.toCharArray()) {
			if(str==" " && str==" ") {
				
			}
		}
		System.out.println(i);
		
		
	}

}
