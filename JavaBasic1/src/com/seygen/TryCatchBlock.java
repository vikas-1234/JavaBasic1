package com.seygen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	
	public static void findFile() throws FileNotFoundException {
		
		File file=new File("name.txt");
		FileInputStream fis=new FileInputStream(file);
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		
	TryCatchBlock.findFile();
//		try {
//			// this will generate error bcs 5 is not divisible by zero
//			int nominator = 5;
//			int denominator =0;
//			int div = nominator/denominator;
////			int divideByZero=5/0;
//			System.out.println("Rest of the code in the try block="+div);
//
//		} catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception:"+e.getMessage());
//		}
//		finally {
//			System.out.println("This is finnaly block");
//		}
		
		
		
		
		
		
		
	}

}
