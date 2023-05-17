package com.basics;

import java.util.Scanner;

public class nested_If3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id number ");
		int id = sc.nextInt();
		System.out.println("enter the password");
		int password = sc.nextInt();

		if (id == 12345678) {
			System.out.println(" it is correct id number  ");

			if (password == 7788990) {
				System.out.println(" right password");
			} else {
				System.out.println(" incorrect id number");
			}
		} else {
			System.out.println(" canot log in");
		}
	}

}
