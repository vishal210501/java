package com.loop;
import java.util.Scanner;
public class SpyNumber {
	public static void main( String [] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter the number");
		int num=sc.nextInt();
		 int sum=0;
		 int prod=1;
		 while(num>0)
		 {
			 int digit=num%10;
			 sum=sum+digit;
			 prod=prod*digit;
					 num=num/10;
		 }
		 if (sum==prod)
		 {
			 System.out.println("it is a spy number");
		 }
		 else
		 {
			 System.out.println("it is not a spy number");
		 }
		
		
		
	}

}
