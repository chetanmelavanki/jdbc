package com.xworkz.stringapp;

public class SplitString {
	public static void main(String[] args) {
			String name="hi jokers , good evening";
			
			String[] ch=name.split(" ");
			for(int i=ch.length-1;i>=0;i--)
			{
				System.out.println(ch[i]);
			}
			
	}


}
