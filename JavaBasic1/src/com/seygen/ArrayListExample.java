package com.seygen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void addElementArrayList() {
		
//		ArrayList<String> list=new ArrayList<String>(); // creating an ArrayList
//		list.add("Vikas"); //Adding object in arraylist 
//		list.add("bablu");
//		list.add("ashish");
//		list.add("megha");
//		list.add("prem");
//		list.add("parag");
//		list.add("chaitanya");
//		
//		System.out.println(list);  // printing All the element from the list
		
		
		
//		// using Iterator
//		
//		ArrayList<String> list=new ArrayList<String>(); // creating an ArrayList
//		list.add("Vikas"); //Adding object in arraylist 
//		list.add("bablu");
//		list.add("ashish");
//		list.add("megha");
//		list.add("prem");
//		list.add("parag");
//		list.add("chaitanya");
//		
//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			String string = (String) itr.next();
//			System.out.println(string); 
//		}
		
//		
//		// using For each loop
//		
//				ArrayList<String> list=new ArrayList<String>(); // creating an ArrayList
//				list.add("Vikas"); //Adding object in arraylist 
//				list.add("bablu");
//				list.add("ashish");
//				list.add("megha");
//				list.add("prem");
//				list.add("parag");
//				list.add("chaitanya");
//				
//				for (String string : list) {
//					System.out.println(string);
//				}
				
		
//		// setting and getting an element
//		
//				ArrayList<String> list=new ArrayList<String>(); // creating an ArrayList
//				list.add("Vikas"); //Adding object in arraylist 
//				list.add("bablu");
//				list.add("ashish");
//				list.add("megha");
//				list.add("prem");
//				list.add("parag");
//				list.add("chaitanya");
//				
//				// accessing an element
//				
//				System.out.println("Retruning an element:"+list.get(1));
//		 
//				list.set(1, "Rudra");
//				for (String string : list) {
//					System.out.println(string);
//				}
		
		
		
//		// setting and getting an element
//		
//		ArrayList<String> list=new ArrayList<String>(); // creating an ArrayList
//		list.add("Vikas"); //Adding object in arraylist 
//		list.add("bablu");
//		list.add("ashish");
//		list.add("megha");
//		list.add("prem");
//		list.add("parag");
//		list.add("chaitanya");
//		
//		// Sorting an element
//		
//		Collections.sort(list);
//		
//		// triversing list through the list
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		// setting and getting an element
		
				ArrayList<String> list=new ArrayList<String>(); // creating an ArrayList
				list.add("Vikas"); //Adding object in arraylist 
				list.add("bablu");
				list.add("ashish");
				list.add("megha");
				list.add("prem");
				list.add("parag");
				list.add("chaitanya");
				
				// Sorting an element
				
//				Collections.sort(list);
				
				list.remove(1);
				
				// triversing list through the list
				for (String string : list) {
					System.out.println(string);
				}
		
		
		
	}
	public static void main(String[] args) {
		
		ArrayListExample.addElementArrayList();

	}

}
