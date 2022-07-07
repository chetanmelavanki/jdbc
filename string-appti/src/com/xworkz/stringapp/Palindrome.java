package com.xworkz.stringapp;

import java.util.Scanner;

//Enter Number/String is palindrome or not

public class Palindrome {
	public static void main(String[] args) {
		String original,reverse="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number or string");
		original=scanner.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("palindrome");
		}else {
			System.out.println("It is not Palindrom");
		}
	}
}
