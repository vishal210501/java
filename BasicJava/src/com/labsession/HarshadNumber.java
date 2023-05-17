package com.labsession;
import java.util.Scanner;
public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int temp=num;
		
		while( num>0)
		{
			 int digit= num%10;
			 sum=sum+digit;
			 num=num/10;
			 
		}
		
		if(temp%sum==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not a harshad number");
		}
		
		
	}

}
