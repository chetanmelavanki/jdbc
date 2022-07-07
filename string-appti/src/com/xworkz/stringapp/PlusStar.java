package com.xworkz.stringapp;

import java.util.Scanner;

class PlusStar {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int row=1;row<=num;row++){
			for(int col=1;col<=num;col++){
					if(row==num/2+1){
						System.out.print(" *");
					}
					else if(col==num/2+1){
						System.out.print(" *");
					}
					else{
						System.out.print("  ");
					}	
			}
		System.out.println();	
		}

	}
}
