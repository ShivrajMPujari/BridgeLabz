package com.bridgelabz.algorithms;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class RangePrime {

	public static void main(String[] args) {

		System.out.println("Enter the value for intial range ");
		int a = Utility.inputInt();

		System.out.println("Enter the value for final range ");
		int b = Utility.inputInt();

		Utility.makeRange(a, b);
/*	//	ArrayList al=Utility.adder();
		System.out.println(al.size());
		Utility.checkAnagram(al);*/

	}

}
