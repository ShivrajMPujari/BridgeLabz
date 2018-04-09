package com.bridgelabz.codes;

import com.bridgelabz.utility.Utility;

public class gambler {

	public static void main(String[] args) {
		
		System.out.println("enter stakes");
		int stake=Utility.inputInt();
		System.out.println("enter goal");
		int goal=Utility.inputInt();
		System.out.println("enter numbers of times");
		int times=Utility.inputInt();
		
		Utility.gambling(stake, goal, times);
		
	}
	
}
