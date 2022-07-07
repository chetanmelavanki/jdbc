package com.xworkz.stringapp.inter;

import com.xworkz.stringapp.ITest1;

public class Test implements Itest,ITest1 {
	public void show() {
		System.out.println("Show");
	}

	public static void main(String args[]) {
		ITest1 i1 =new Test();
		i1.show();
	}
}
