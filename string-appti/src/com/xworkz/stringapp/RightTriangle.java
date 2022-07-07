package com.xworkz.stringapp;

public class RightTriangle {
	public static void main(String[] args) {
		int num = 5;

		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if(col==1) {
					System.out.print(" *");
				}
				else if(row==3) {
					System.out.print(" *");
				}
				else if(col==num) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
