	package com.xworkz.stringapp;

public class Indiapattern {
		public static void main(String[] args) {
			
			String name="INDIA";
			char a[] = name.toCharArray();
			int end = 5;
		
			for (int i =0; i < end; i++) {
				for (int j = end-1; j>=i; j--) {
					System.out.print(" ");	
				}	
				for (int k =0; k <=i; k++) {
						System.out.print(a[k]);
						System.out.print(" ");
				}
				System.out.println("");
			}
		}
	}


