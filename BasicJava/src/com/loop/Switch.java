package com.loop;
import java.util.Scanner;
public class Switch {

	public static void main ( String [] args) {
		
		Scanner sc = new Scanner ( System.in);
		System.out.println(" enter the name");
		String name = sc.next();
		
		
		System.out.println("1. choclate icecream");
		System.out.println("2. mango icecream");
		System.out.println("3. milkshake");
		System.out.println("4.butterscotch icecream");
		System.out.println(" enter your choice");
		int choice = sc. nextInt();
		
		switch (choice){
		case 1:
			System.out.println("1.choclatate icecream");
		break;
		
		case 2:
			System.out.println("2. mango icecream");
		break;
		
		case 3:
			System.out.println("3. milkshake");
		break;
		
		case 4:
			System.out.println("4.butterscotch icecream");
		break;
		default:
			System.out.println(" your choice doesnt available");
		}
		
		
	}
}
