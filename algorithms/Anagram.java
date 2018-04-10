package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		
		String s1=null;
		String s2=null;
		
		System.out.println("Enter String1");
		s1=Utility.inputString();
		
		System.out.println("Enter String2");
		s2=Utility.inputString();
		
		Utility. anagramDetection(s1, s2);
		
		
		
		
		
	}

}
