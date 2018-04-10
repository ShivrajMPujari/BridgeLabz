package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		String year=null;
		
		System.out.println("enter the any year");
		year=Utility.inputString();
		Utility.CheckleapYear(year);
		
	}
}
