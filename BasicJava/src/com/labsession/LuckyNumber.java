package com.labsession;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the car number");
		int num = sc.nextInt();
		
		int carnumber = num;
		int sum = 0;
		int count = 0;

		while (num > 0) {
			count++;
			 int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
			
		}
		System.out.println(count);

		if ((sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0 )&& count==4) 
		{

			System.out.println(" it is a lucky number");
		} 
		else
		{
			System.out.println(" it is not a lucky number");
		}

	}
}
