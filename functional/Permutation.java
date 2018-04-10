package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;

public class Permutation {


	  public static void main(String[] args)
	    {
	        String str = "234";
	        int n = str.length();
	        Utility.permute(str, 0, n-1);
	    }


}
