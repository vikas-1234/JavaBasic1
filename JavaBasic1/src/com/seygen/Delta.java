package com.seygen;

class Delta extends Beta
{    //it means class Delta inherits members of class Alpha
     public static void main(String args[])
     {
    Delta d = new Delta();
    d.iAmProtected = 40;
    System.out.println("Value of protected member is: " +d.iAmProtected);
    d.protectedtMethod();
     }

	private void protectedtMethod() {
		System.out.println("I am protected method and calling the beta method here");
		
	}
}