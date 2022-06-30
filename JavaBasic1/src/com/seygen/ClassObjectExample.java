package com.seygen;

public class ClassObjectExample {
	
	
//	fields or data member else instance variable
	String websiteName;
	int webpageAge;
	
	
	
	// creating the constructor 
	public ClassObjectExample(String websiteName, int webpageAge) {
		super();
		this.websiteName = websiteName;
		this.webpageAge = webpageAge;
	}




	public static void main(String[] args) {
		
		ClassObjectExample coe=new ClassObjectExample("Google",20);
		ClassObjectExample coe1=new ClassObjectExample("Microsoft",18);
		
		
		//Accessing object data through reference
	    System.out.println("Website Name:" + coe.websiteName);
	    System.out.println( "age:" + coe.webpageAge);
	    System.out.println("Website Name:" + coe1.websiteName);
	    System.out.println("age:" + coe1.webpageAge);
	}

}
