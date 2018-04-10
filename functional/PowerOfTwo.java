package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		
		int power=0;
		System.out.println("enter the power of 2 for the table");
		power=Utility.inputInt();
		Utility.createTable(power);
		

	}
}
