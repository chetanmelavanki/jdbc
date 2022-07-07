package com.xworkz.stringapp;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start ");
		int a = sc.nextInt();

		System.out.println("End ");
		int b = sc.nextInt();

		prime(a, b);
		sc.close();

	}

	public static void prime(int start, int end) {
		while (start < end) {
			boolean flag = false;

			for (int i = 2; i <= start / 2; ++i) {
				
				if (start % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && start != 0 && start != 1)
				System.out.print(start + ",");

			++start;
		}
	}
}