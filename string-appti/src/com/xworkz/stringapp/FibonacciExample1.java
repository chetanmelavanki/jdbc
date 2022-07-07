package com.xworkz.stringapp;

import java.util.Scanner;

public class FibonacciExample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();

		int firstTerm = 0, secondTerm = 1;

		for (int i = 1; i < n; i++) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
