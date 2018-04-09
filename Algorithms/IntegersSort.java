package com.bridgelabz.Algorithms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class IntegersSort {

	public static void main(String[] args) {
	
		System.out.println("Enter the integer list");
		String st=Utility.inputStringLong();
		 String[] s=st.split("\\s");
		
		int[] integer=Utility.stringTOInt(s);
		 Utility.bSortInt(integer);
		 System.out.println(Arrays.toString(integer));
		 
		
			}

}
