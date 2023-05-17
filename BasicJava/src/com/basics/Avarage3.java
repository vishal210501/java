package com.basics;

import java.util.Scanner;

public class Avarage3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first number");
		float num1 = sc.nextFloat();
		System.out.println(" enter second number");
		float num2 = sc.nextFloat();
		System.out.println("enter third number");
		float num3 = sc.nextFloat();
		System.out.println("enter fourth number");
		float num4 = sc.nextFloat();

		float Avarage = 0;

		Avarage = (num1 + num2 + num3 + num4) / 4;

		System.out.println(Avarage);

	}

}
