package com.seygen;

public class ArrayProgram1 {

	
	public static  void calculateSum() {
		
		int numbers[]= {12,11,10,9,8,7,6,5,4,3,2,1};
		int sum=0;
		Double average = null;
		
		// access all elements using for each loop
		   // add each element in sum
		for (int number : numbers) {
			sum+=number;
		}
		
		int arrayLength = numbers.length;
		
		// calculate the average
		   // convert the average from int to double
		
		average=((double)sum /(double)arrayLength);
		System.out.println("sum:" + sum);
		System.out.println("average:"+average);
		
		
	}
	
	public static void main(String[] args) {
		ArrayProgram1.calculateSum();
	}
}
