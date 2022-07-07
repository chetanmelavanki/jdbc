package com.xworkz.stringapp;

import java.util.Arrays;
public class ArrSort{
	public static void main(String[] args){
		int a[]= {2,1,4,3,5,6,9,7,12,10};
//		a[0]=1;
//		a[1]=2;
//		a[2]=4;
//		a[3]=5;
//		a[4]=3;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		
	
}
}