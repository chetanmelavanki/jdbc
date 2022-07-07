package com.xworkz.stringapp;

public class SwappingApp {
	public static void main(String[] args) {
		int arr[]= {12,76,85,90,67,69,34,56,2,0,1};
		for(int index=0;index<arr.length-1;index++) {
			for(int num=index+1;num<arr.length;num++){
				if(arr[index]>arr[num]) {
					int temp=arr[index];
					arr[index]=arr[num];
					arr[num]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
