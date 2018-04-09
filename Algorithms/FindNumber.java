package com.bridgelabz.Algorithms;

import com.bridgelabz.utility.Utility;

public class FindNumber {

	public static void main(String[] args) {

		System.out.println("choose a number range..a and b");
		System.out.println("enter the value for a..");
		int a = Utility.inputInt();
		System.out.println("enter the value for b..");
		int b = Utility.inputInt();

		int arr[] = Utility.createArray(a, b);

		Utility.binarySearchUser(arr, 0, arr.length);

	}

}
