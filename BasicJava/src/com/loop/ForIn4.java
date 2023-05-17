package com.loop;

public class ForIn4 {
	
	public static void main(String [] args) {
		
		int i= 0;
		int num= 0;
		String primenumbers = " ";
		
		
		for ( i=1; i<=100; i++) {
				int counter=0;
				for (num=1; num>=1; num--) {
					if ( i%num==0) {
						counter= counter+1;
						
					}
				}
				if (counter ==2)
				{
					primenumbers= primenumbers+i+" ";
				}
		}
		System.out.println(" primenumbers from 1 to 100 are :");
		
		System.out.println( primenumbers);
		
		
			

				
			
		
	}

}
