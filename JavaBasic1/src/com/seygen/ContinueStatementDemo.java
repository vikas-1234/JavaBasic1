package com.seygen;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		int iterator=0;
		
		while (iterator<=10) {
			
			iterator++;
			
			if (iterator%2==1) 
				continue;
				
			System.out.println("iterator------"+iterator);
				
			
			
		}
		
		System.out.println("Loop Complete");
		

	}

}
