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
		PrintArray.toPrint(this.inputArray);
	}

	//method : use generic
	public static <T> void toPrint(T[] inputArray) {
		//for each loop 
		for(T element : inputArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	public void maxInt() {
		T max = inputArray[0];
		for(T element : inputArray) {
			if (((Integer) element).compareTo((Integer) max) > 0) {
				max = element;
			}
		}
		System.out.println("Max Integer is :"+ max);
	}
	
	public static void main(String[] args) {
		System.out.println("generic demo ");
		//Array initialization
		Integer [] intArray = {2,3,5,};
		Double [] doubleArray = {2.1, 3.1, 5.1, 7.1};
		Character [] charArray = {'A','E','I','O','U'};
		//Print Array
		//PrintArray.toPrint(intArray);
		//PrintArray.toPrint(doubleArray);
		//PrintArray.toPrint(charArray);
		
		new PrintArray<Integer>(intArray).toPrint();
		new PrintArray<Integer>(intArray).maxInt();
		new PrintArray<Double>(doubleArray).toPrint();
		new PrintArray<Character>(charArray).toPrint();
	}
}

