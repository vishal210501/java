package com.loop;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		
		int sum=0;
		int temp=num;
		while  (num>0)
		{
			int digit= num%10;
			sum=sum+(digit*digit*digit);
			num= num/10;
			
		}
		if ( sum==temp)
		{ 
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println(" not an armstrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
