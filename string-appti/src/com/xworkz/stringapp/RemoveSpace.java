package com.xworkz.stringapp;

public class RemoveSpace {
	public static void main(String[] args) {
		String name="java pgm";
		String ch[]=name.split(" ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
