package com.bridgelabz.codes;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=0;
		int c=0;
		double delta= 0;
		System.out.println("For given equation a*x*x + b*x + c");
		System.out.println("enter the value for a");
		 a=Utility.inputInt();
		System.out.println("enter the value for b");
		 b=Utility.inputInt();
		System.out.println("enter the value for c");
		 c=Utility.inputInt();
		
		 delta= Utility.delta(a, b, c);
		 System.out.println(delta);
		Utility.roots(delta, a, b, c);
		 
		 
	}

}
