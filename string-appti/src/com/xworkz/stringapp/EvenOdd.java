package com.xworkz.stringapp;

import java.util.Scanner;

public class EvenOdd {
	static int n;
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		even(n);
		s.close();
	}
	public static int even(int num) {
		
		if(n%2==0) {
			System.out.println(num+" is even number");
		}
		else {
			System.out.println(num+" n is odd number");
		}
		return num;
	}
	
}
