package com.xworkz.stringapp.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		Student std1 = new Student(1, "Sam", 453);
		Student std2 = new Student(2, "Tom", 768);
		Student std3 = new Student(3, "Roy", 543);
		Student std4 = new Student(4, "Tedd", 876);
		
		List<Student> students = new ArrayList<Student>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		
		Iterator itr = students.iterator();
		while (itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.getName());
		}
	}
}
