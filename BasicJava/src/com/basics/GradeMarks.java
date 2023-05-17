package com.basics;

import java.util.Scanner;

public class GradeMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();

		System.out.println("english");
		float eng = sc.nextFloat();

		System.out.println("maths");
		float math = sc.nextFloat();

		System.out.println("hindi");
		float hin = sc.nextFloat();

		System.out.println(" total marks");
		float totalMarks = sc.nextFloat();

		float obtainMarks = 0;
		obtainMarks = eng + math + hin;

		float percentage = (obtainMarks * 100) / totalMarks;

	}

}
