package com.labsession;
import java.util.Scanner;
public class Key_Digit_Number {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println(" enter a number");
		int num = sc.nextInt();
		System.out.println(" enter keydigit");
		int keydigit=sc.nextInt();
		int count = 0;
		while (num > 0) {
			int digit = num%10;
			if(digit == keydigit) {
				count++;
			}
		
		num=num/10;
		}
		System.out.println(count);
	}

}
