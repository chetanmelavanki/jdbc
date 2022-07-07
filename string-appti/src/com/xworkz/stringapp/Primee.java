package com.xworkz.stringapp;

import java.util.Scanner;

public class Primee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		prime(num);
		scanner.close();
	}

	public static boolean prime(int num) {
		int i = 2, count = 0;
		while (i < num) {
			if (num % i == 0) {
				count++;
				break;
			}
			i++;
		}

		if (count == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		return false;
	}
}
