package com.seygen;

public class NestedIfDemo {

	public static void main(String[] args) {
		int age=18;
		int weight=60;
		if (age>=18) {
			System.out.println("You are eligible to vote");
			if (weight>=60) {
				System.out.println("You are eligible to vote and donate your blood!!!");
				
			}
			else {
				System.out.println("You are not eligible to vote and donate your blood!!!");
			}

			
		}
		else {
			System.out.println("You are eligible for both to vote and donate your blood also!!!");
		}

	}

}
