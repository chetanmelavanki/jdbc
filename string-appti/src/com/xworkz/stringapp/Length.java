package com.xworkz.stringapp;

public class Length {
	public static void main(String[] args) {
		
		Length length=new Length();
		System.out.println(Length.getLength("India is my country India India"));
	
		}
		public static int getLength(String str) {
			
		int i=0;
		for(char ch : str.toCharArray() ) {
				i++;
		}
			return i;
	}
		
}
	
		
