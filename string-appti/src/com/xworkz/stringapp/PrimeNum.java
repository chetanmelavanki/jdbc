package com.xworkz.stringapp;

public class PrimeNum {
	public static void main(String[] args) {
		int num=5;
		boolean prime=false;
		for(int i=2;i<=num/2;i++) {
			if(num % i==0) {
				prime=true;
			}
		}
		if(!prime) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}
}
