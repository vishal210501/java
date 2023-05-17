package com.basics;

import java.util.Scanner;

public class Percentage2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		float num1 = sc.nextFloat();

		System.out.println(" enter second number");
		float num2 = sc.nextFloat();

		System.out.println("enter third number");
		float num3 = sc.nextFloat();

		System.out.println("total marks");
		float totalMarks = sc.nextFloat();

		float obtainMarks = 0;
		obtainMarks = num1 + num2 + num3;

		float percentage = 0;
		percentage = (obtainMarks * 100) / totalMarks;

		System.out.println(percentage);

	}
}
