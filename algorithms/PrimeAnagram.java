package com.bridgelabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int n=999;
		int[] out;
		out=Utility.primeNumbers(n);
		Utility.display(out);
		
		for (int i = 0; i < out.length-1; i++) {
			for (int j = i+1; j < out.length; j++) {
				Utility.checkingIntAnagaram(out[i], out[j]);
			}
			
		}
		
	}

}
