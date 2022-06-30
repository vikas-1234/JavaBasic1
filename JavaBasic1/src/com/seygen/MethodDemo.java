package com.seygen;

public class MethodDemo {

	public static double getCube(double num) {
		double result = num*num*num;
		return result;
	}
	public static void main(String[] args) {
		double number=7.5, cube=0;
		
		MethodDemo mDemo=new MethodDemo();
		
		cube=mDemo.getCube(number);
		System.out.println("The cube of "+  number+ " is: "+cube);
		
	}

}
