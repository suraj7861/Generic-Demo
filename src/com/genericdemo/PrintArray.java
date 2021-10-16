package com.genericdemo;

public class PrintArray {

	private static void toPrint(Integer[] inputArray) {
		//for each loop 
		for(int element : inputArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	private static void toPrint(Double[] inputArray) {
		//for each loop
		for(double element : inputArray) {
			System.out.printf("%s ",element);
		}	
		System.out.println();
	}
	
	private static void toPrint(Character[] inputArray) {
		//for each loop
		for(char element : inputArray) {
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
