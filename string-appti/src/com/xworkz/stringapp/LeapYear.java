package com.xworkz.stringapp;

import java.util.Scanner;

public class LeapYear {
	static int year;
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a year");
		year= scanner.nextInt();
		leapYear(year);
		scanner.close();
	}
	public static void leapYear(int year2) {
		if(year%4==0 && year%100!=0) {
			System.out.println(year+" it is leap year");
		}
		else if(year%400==0) {
			System.out.println(year+" it is leap year");
		}
		else {
			System.out.println(year+" it is not leap year");
		}
	}

}
