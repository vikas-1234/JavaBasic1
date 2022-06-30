package com.seygen;




 class alpha
{
	int iAmDefault;
	
	void defaultMethod() {
		System.out.println("I am Default Method");
	}
}

 
    class DefaultDemoAccessModifier {

	public static void main(String[] args) {
		
		alpha al=new alpha();
		al.iAmDefault=10;
		System.out.println("The value of private member is :"+al.iAmDefault);
		al.defaultMethod();
		

	}

}
