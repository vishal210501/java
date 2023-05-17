package com.labsession;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		
		int num= 89734;
		int cnt=0;
		 while(num>0)
		 {
			 int digit=num%10;
			 cnt=0;
			 for (int i=2; i<digit; i++)
			 {
				 if(digit%i==0)
					 cnt ++;
					
				
			 	}
			 num=num/10;
			 if ( cnt==0)
				 System.out.println( digit+" is prime number. ");
			
			 
			 
		 }
		
		
		
		
	}

}
