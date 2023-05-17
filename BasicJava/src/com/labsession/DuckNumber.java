package com.labsession;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number");
		int num = sc.nextInt();
		int num1 = num;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;

		}
	}

}
