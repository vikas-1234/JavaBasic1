package com.seygen;

public class VikasRunnable implements Runnable {
	
	
	public void run()
	{
		System.out.println("This is runnable interface");
	}

	public static void main(String[] args) {
		
		VikasRunnable vRunnable=new VikasRunnable();
		Thread t1=new Thread(vRunnable);
		t1.start();
		System.out.println("Hi Vikas");

	}

}
