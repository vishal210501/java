package com.basics;

import java.util.Scanner;

public class Check123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(" it is a number ");
		}
		else
		{
			System.out.println(" it is not a number");
		}
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd') {
			System.out.println("it is a character");
		}
		else
		{
			System.out.println(" it is not a charachter");
		}
		System.out.println("enter special character");
		int esc = sc.nextInt();
		if (esc == '@' || esc == '#' || esc == '&') {
			System.out.println(" it is a special character");
		}
		else
		{
			System.out.println("it is not a special character");
		}

	}

}
