package com.seygen;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void methodLinkedList() {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("Prem");
		list.add("parag");
		list.add("bablu");
		list.add("vikas");
		list.add("ashish");
		list.add("megha");
		list.add("chaitanya");
		list.add("kiren");
		list.add("ramesh");
		
//		list.addFirst("kalairammohan"); // adding element at starting point
//		list.addLast("ramkrishanan"); // adding element at last point
//		int ls = list.indexOf(list);
		
//		list.push("mahi");     // adding an element at starting  point
//		list.pop();            // deleting an element at starting  point
		
//		list.removeFirst();
//		list.removeLast();
		int ls = list.size();
		System.out.println(ls);
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		
		LinkedListExample.methodLinkedList();
	}

}
