package com.xworkz.ticket;

class Main {
	public static void main(String[] args) {

		int a = 40;
		int b = 10;
		System.out.println("before swap" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("before swap" + a + " " + b);

	}
}