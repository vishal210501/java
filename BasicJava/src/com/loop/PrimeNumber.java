package com.loop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		int i = 2;
		boolean isprime = true;
		while (num > i) {
			if (num % i == 0) {
				isprime = false;
				break;
			}
			i++;
		}
		if (isprime) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}

}
