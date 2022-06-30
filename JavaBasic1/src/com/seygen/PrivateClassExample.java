package com.seygen;

public class PrivateClassExample {
	
	private int iAmPrivate;
	
	private void privateMethod() {
		System.out.println("I am Private Method");
	}

	public static void main(String[] args) {
		
		PrivateClassExample pce=new PrivateClassExample();
		
		pce.iAmPrivate=10;
		System.out.println("Value of private member is:"+pce.iAmPrivate);
		pce.privateMethod();
	}

}
