package com.bridgelabz.functional;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;


public class ReplaceString {

	
	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		String name= Utility.inputString();
	//	System.out.println(name);
		String inputString ="Hello <<UserName>>, How are you?";
	//	String result =Utility.replace(name,mInputString );
		String[] result=Utility.splitString(inputString, name);
		
	//	System.out.println(Arrays.toString(result));
		String outcome=Utility.convertToString(result);
		System.out.println(outcome);
		
	}
	
}
