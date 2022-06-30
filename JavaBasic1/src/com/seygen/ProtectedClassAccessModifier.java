package com.seygen;

class Beta{
	protected int iAmProtected;
	
	protected void protectedMethod() {
		System.out.println("I am protected method inside the class");
	}
}
 class ProtectedClassAccessModifier {

	public static void main(String[] args) {
		Beta al=new Beta();
		
		al.iAmProtected=20;
		
		System.out.println("The value of protected member is:"+al.iAmProtected);
		al.protectedMethod();

	}

}
