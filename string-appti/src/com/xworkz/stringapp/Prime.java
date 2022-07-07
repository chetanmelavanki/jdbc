package com.xworkz.stringapp;

import java.util.Scanner;

public class Prime {
	static int num,count=0;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		num=scanner.nextInt();
		prime(num);
		scanner.close();
		
	}
	public static void prime(int n) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(num+" it is prime number");
		}
		else {
			System.out.println(num+" it is not prime number");
		}
	}

}
