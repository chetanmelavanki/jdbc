package com.xworkz.stringapp;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		{
			int row,col;
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the number of rows:");
			int rows=scan.nextInt();
		
			for(row=1; row<=rows; row++){
			    for(col=rows; col>row; col--){
			       System.out.print(" ");
			    }
			    System.out.print("*");  
			    
			    for(col=1; col<(row-1)*2; col++){
			       System.out.print(" ");
			    }
			    
			    if(row==1){
			      System.out.print("\n");
			    }
			    
			    else{
			      System.out.print("*\n");
			    }
			}
			   
			for(row=rows-1; row>=1; row--){
			    for(col=rows; col>row; col--){
			       System.out.print(" ");
			    }
			    
			    System.out.print("*");
			    for(col=1; col<(row-1)*2; col++){
			       System.out.print(" ");
			    }
			    
			    if(row==1){
			      System.out.print("\n");
			    }
			    else{
			      System.out.print("*\n");
			    }
			    }
			    }
	}
	

}
