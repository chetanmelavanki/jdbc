package com.xworkz.stringapp;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int name = scanner.nextInt();
		int name1 = scanner.nextInt();
		int name2 = scanner.nextInt();
		GetMax(name, name1, name2);
		scanner.close();
	}

	public static void GetMax(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
