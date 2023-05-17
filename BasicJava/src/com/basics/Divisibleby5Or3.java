package com.basics;
import java.util.Scanner;
public class Divisibleby5Or3 {
	
	public static void main (String[]args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if (num%5==0  &&   num%3==0)
	{
		System.out.println("divisible");
		
		}
	else
	{ 
		System.out.println("not divisible");
		
	}
	}

}
