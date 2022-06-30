package com.seygen;

public class ArrayProgram {

	public static void array() {
		int age[]= {12,4,6,10,13};
//		System.out.println("Accessimg first elemnt of an array:"+age[0]);
//		System.out.println("Accessimg second elemnt of an array:"+age[1]);
//		System.out.println("Accessimg third elemnt of an array:"+age[2]);
//		System.out.println("Accessimg fourth elemnt of an array:"+age[3]);
//		System.out.println("Accessimg fifth elemnt of an array:"+age[4]);
		
		// Accessing an array element using for loop
		for (int i = 0; i < age.length; i++) {
			int j = age[i];
			System.out.println(i);
			
		}
		
		// Accessing an array element using for each loop
				for (int j : age) {
					System.out.println(j);
					
				}
					
					
				}
		
	
	
	public static void main(String[] args) {
		
		ArrayProgram.array();
	}
}
