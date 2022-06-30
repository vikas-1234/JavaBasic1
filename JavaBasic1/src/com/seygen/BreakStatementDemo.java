package com.seygen;

public class BreakStatementDemo {

	public static void main(String[] args) {
		int iterator=0;
		
	
		while (iterator<10) {
			System.out.println("iterator--------"+iterator);
			iterator++;
			if (iterator==5) {
				break;
				
			}
			
		}
		
		System.out.println("Complete the loop!!!");
	}

}
