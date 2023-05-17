package com.basics;

public class Nested_If {
	public static void main(String[] args) {

		int age = 18;
		int weight = 45;

		if (age >= 18) {
			System.out.println("eligible to donate blood");

			if (weight >= 50) {
				System.out.println("sufficient to donate blood");
			} else {
				System.out.println(" not eligible to donate blood");
			}
		} else {
			System.out.println("not sufficent to donate blood ");
		}

	}

}
