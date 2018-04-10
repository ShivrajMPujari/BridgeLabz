package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;


public class ReplaceString {

	
	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		String name= Utility.inputString();
	//	System.out.println(name);
		String mInputString ="Hello <<UserName>>, How are you?";
		String result =Utility.replace(name,mInputString );
		System.out.println(result);
	}
	
}
