package com.bridgelabz.Algorithms;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class RangePrime {

	public static void main(String[] args) {

		System.out.println("enter the value for intial range ");
		int a = Utility.inputInt();

		System.out.println("enter the value for final range ");
		int b = Utility.inputInt();

		Utility.range(a, b);
		ArrayList al=Utility.adder();
		System.out.println(al.size());
		Utility.checkAnagram(al);

	}

}
