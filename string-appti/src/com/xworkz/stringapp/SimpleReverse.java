package com.xworkz.stringapp;

public class SimpleReverse {
	public static void main(String[] args) {
		String s = "Krutika";
		char ch[] = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
