package com.basics;
import java.util.Scanner;
public class GradeMark2 {
	
	public static void main ( String [] args) {
		
		Scanner sc = new Scanner ( System.in);
		System.out.println(" enter the marks");
		int mark=sc.nextInt();
		System.out.println("enter the subject");
		String sub = sc.next();
		
		if ( mark>80) {
			System.out.println("destinct");
		}
		if(mark<80 && mark>70) {
			System.out.println("first class");
			
		}
		if(mark<70) {
			if(sub==" physics") {
				
				
			}
			
		}
	}

}
