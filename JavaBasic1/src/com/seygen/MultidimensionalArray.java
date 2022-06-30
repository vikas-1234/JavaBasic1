package com.seygen;

public class MultidimensionalArray {
	
	public static void multiDiamentionalArray() {
		
		int[][] a= {{1,2,3},{4,5,6,7},{8}};
		
		// Calculate the length of each row
//		
//		System.out.println("Length of first rows:"+a[0].length);
//		System.out.println("Length of second rows:"+a[1].length);
//		System.out.println("Length of third rows:"+a[2].length);
		
		
		// accessing an element using for loop
//		for (int i = 0; i < a.length; ++i) {
//			for (int j = 0; j < a[i].length; ++j) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		// accessing an element using an for each loop
		for (int[] innerarray : a) {  // first for...each loop access the individual array
	        
			for (int data : innerarray) {  // inside the 2d array
				System.out.println(data);
				
			}
		}
		
	}

	public static void main(String[] args) {
		MultidimensionalArray.multiDiamentionalArray();
	}

}
