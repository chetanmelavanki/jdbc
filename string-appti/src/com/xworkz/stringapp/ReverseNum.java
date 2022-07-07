package com.xworkz.stringapp;

public class ReverseNum {
	public static void main(String[] args) {
		String  num="829464";
		char ch[] = num.toCharArray();

		for (int index = ch.length - 1; index >= 0; index--) {

			System.out.print(ch[index]);

		}
	}
}
