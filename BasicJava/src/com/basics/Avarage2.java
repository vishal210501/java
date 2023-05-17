package com.basics;
import java.util.Scanner;
public class Avarage2 {
	
	public static void main( String [] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter first number");
	float num1= sc.nextFloat();
	
	System.out.println(" enter second number");
	float num2= sc.nextFloat();
	float avarage= 0;
	
	avarage= num1+num2/2;
	
	System.out.println(avarage);
	
	
		
		
	
	}

}
