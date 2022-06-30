package com.seygen;


class PublicClass{
	
	public int iAmPublic;
	
	public void publicMethod() {
		System.out.println("I am Public Method and I could be accessed within a class as well as outside the class");
		
	}
}
public class PublicClassAccessModifier {

	public static void main(String[] args) {
		
		PublicClass pc=new PublicClass();
		
		pc.iAmPublic=40;
		
		System.out.println("The values of public member is:"+ pc.iAmPublic);
		
		pc.publicMethod();

	}

}
