package com.xworkz.stringapp;

public class FindNearestFibonacciNumber {
	 public static void main(String s[])
	    {
	        int input = 245;
	        int result = findNearestFibonacciNumber(9);
	        
	        System.out.println("\n"+"The nearest Fibonacci number for " + input + " is " + result);

	    }


	public static int findNearestFibonacciNumber(int inpu)
	{
		
		int first=0;
		int second=1;
		int third=0;
		for (int i = 0; i <inpu; i++) {
			int nextTerm = first + second;
		     third=i-1;
		     i=first+second;
		     
		     first=second;
		     second=i;
		    	  
		      }
		
		return inpu;
	
	}

}
