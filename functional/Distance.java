package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
		
		String x1=args[0];
		String y1=args[1];
	//	System.out.println(x1);
		System.out.println("the point to calculate distance from origin is");
		Utility.euclideanDistanceCalculation(x1, y1);
	}

}
