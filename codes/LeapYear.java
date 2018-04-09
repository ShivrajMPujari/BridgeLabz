package com.bridgelabz.codes;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		String year=null;
		
		System.out.println("enter the any year");
		year=Utility.inputString();
		Utility.leapYear(year);
		
	}
}
