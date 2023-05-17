package com.labsession;

import java.util.Scanner;

public class Choclateoffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" how many rupees the kid have?  ");
		int rs = sc.nextInt();

		int i,count = 0;

		
		for (i=1;  i<=rs;  i++) {

			count++;

			if (count%3==0) {

				count++;
			}
		}
		System.out.println(" the kid will get"+ count +"choclates");

	}
}
