package com.basics;

import java.util.Scanner;

public class Nested_If2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		System.out.println("enter the weight");
		int weight = sc.nextInt();

		if (age >= 18) {
			System.out.println("eligible to donate blood");
			if (weight >= 50) {
				System.out.println("sufficient to donate blood");
			} else {
				System.out.println("not eligible to donate blood ");
			}

		} else {
			System.out.println(" not sufficient to donate blood");
		}
	}
}
