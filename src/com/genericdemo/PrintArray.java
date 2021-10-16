package com.genericdemo;

import com.genericdemo.PrintArray;

public class PrintArray<T> {
	
	private T[] inputArray;
	//constructor with fields
	public PrintArray(T[] inputArray) {
		super();
		this.inputArray = inputArray;
	}
	
	public void toPrint(){
		System.out.println(this.inputArray);
	}

	//method : use generic
	public static <E> void toPrint(E[] inputArray) {
		//for each loop 
		for(E element : inputArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("generic demo ");
		//Array initialization
		Integer [] intArray = {2,3,5,7,11};
		Double [] doubleArray = {2.1, 3.1, 5.1, 7.1};
		Character [] charArray = {'A','E','I','O','U'};
		//Print Array
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
	}
}

