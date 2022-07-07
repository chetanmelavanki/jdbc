package com.xworkz.stringapp;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		n=s.nextInt();
		
		prt(n);
		
	}
	public static int prt(int num) {
		
		
		for (int i = 1; i <=num; i++) {
			System.out.println("i love u maa");
		}
		return num;
	}

}
