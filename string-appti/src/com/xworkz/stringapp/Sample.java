package com.xworkz.stringapp;

public class Sample {
//	public static void main(String[] args) {
//		int a[] = { 20, 35, 67, 146, 8, 31, 126, 98, 16 };
//		
//		int temp;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//				
//			}
//
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println("2nd smallest number:"+a.length);
//		System.out.println("2nd largets number:"+a.length+1);
//	}
	public static void main(String[] args) {
		int n=371;
		int total=0;
		int res=0,rem=0 ,temp=0;
		
		temp=n;
		
		while(n>0) {
			n=n/10;
			total++;

			System.out.println(n);
		}
		System.out.println(total);
		n=temp;
		while(n>0) {
			n=n%10;
			System.out.println(n);
			res=(int) (res+Math.pow(rem, total));
			n=n/10;
		}
		if(res==temp) {
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not  aarmstrong number");
		}
	}
	
//	3^3+7^3+1^3
//	=27+343+1
//	=371
}