package com.qait.training.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student1 {
	private int id;
	private String name;
	private double cgpa;

	/**
	 * 
	 * @param i
	 * @param n
	 * @param c
	 */
	public Student1(int i, String n, double c) {
		this.id = i;
		this.name = n;
		this.cgpa = c;
	}

	/**
	 * 
	 * @return id of type int
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return name of type String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return cgpa of type double
	 */
	public double getCgpa() {
		return cgpa;
	}

	public static void main(String a[]) {

		List<Student1> list = new ArrayList<Student1>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of students between 2-100");
		int n = scan.nextInt();
		if (n < 2 || n > 100)
			throw new IllegalArgumentException();
		System.out.println("Enter id(0-100000), name(length 5-30), cgpa(0-4.0)");
		for (int i = 0; i < n; i++) {
			int id = scan.nextInt();
			String name = scan.next();
			double cgpa = scan.nextDouble();
			if (id < 0 || id > 100000 || name.length() < 5 || name.length() > 30 || cgpa < 0.0 || cgpa > 4.0)
				throw new IllegalArgumentException();
			list.add(new Student1(id, name, cgpa));
		}
		Collections.sort(list, new StudentCompare());
		System.out.println("Sorted list entries: ");
		for (Student1 e : list) {
			System.out.println(e.getName());
		}
	}
}
