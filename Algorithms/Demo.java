package com.bridgelabz.Algorithms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public  class Demo {

	public static void main(String[] args) {
		
		System.out.println("enter the strings ");
		String st=Utility.inputStringLong();
		System.out.println(st);
		String st1[]=st.split("\\s");
	    
		Demo.iSortString(st1);
		//System.out.println(Arrays.toString(st1));
		
		
		
	}
	
	
	
	public static void toIntArray(String[] a){
		
		
		
		
		
		
	}
	
	public static void iSortString(String st[]) {

		int n = st.length;
		
		for (int i = 1; i < n; ++i) {
			String key = st[i];
			int j = i - 1;

			while (j >= 0 && st[j].compareTo(key) > 0) {
				st[j + 1] = st[j];
				j = j - 1;
			}
			st[j + 1] = key;
		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}

	}
	
}
