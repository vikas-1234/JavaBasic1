package com.seygen;

import java.util.Vector;

public class VectorExample {

	public static void vectorMethod() {
		
		Vector<String> vec=new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elements");
		
		
		vec.addElement("Cow");
		vec.addElement("Parrot");
		
		System.out.println("Elements of a vector :"+ vec);
		
		// checking size and capacity
		
		System.out.println("The Size of an Vector:"+vec.size());
		
		
		System.out.println("The Capacity of a Vector:"+vec.capacity());
		
		
		if (vec.contains("Tiger")) {
			System.out.println("Tiger isn present at  index:"+vec.indexOf("Tiger"));
			
		}
		
		else {
			System.out.println("Tiger is not present in the list ");
		}
		
		System.out.println("First Element of Vector is:"+vec.firstElement());
		
		System.out.println("Last Exlemnt of Vector is:"+vec.lastElement());
	}
	
	public static void main(String[] args) {
		VectorExample.vectorMethod();

	}

}
