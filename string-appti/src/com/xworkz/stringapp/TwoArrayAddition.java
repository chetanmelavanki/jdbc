package com.xworkz.stringapp;

import java.util.Arrays;

public class TwoArrayAddition {
	public static void main(String[] args) {
		double[] dInputArray1 = new double[] { 1.9, 2.9, 3.0, 4, 5, 6, 7, 8, 9 };

		double[] dInputArray2 = new double[] { 10.0, 11.2, 12.9, 13.4, 14, 15, 16, 17, 18 };

		int[] iSumArray = new int[dInputArray1.length];

		for (int i = 0; i < dInputArray1.length; i++) {

			iSumArray[i] = (int) (dInputArray1[i] + dInputArray2[i]);

		}
		System.out.println("iSumArray[] " + Arrays.toString(iSumArray));
	}
}
