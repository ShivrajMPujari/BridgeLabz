package com.bridgelabz.Algorithms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class IntegersSort {

	public static void main(String[] args) {
	
		System.out.println("Enter the integer list");
		String st=Utility.inputStringLong();
		 String[] s=st.split("\\s");
		 int integer[]= new int[s.length];
		 
		 for(int i=0;i<s.length;i++){
			 
			 if(s[i].equals("")){
				 continue;
			 }
			 integer[i]=Integer.parseInt(s[i]);
			 
		 }
		 
		 System.out.println(Arrays.toString(integer));
		 Utility.bSortInt(integer);
		 System.out.println(Arrays.toString(integer));
		 
		
			}

}
