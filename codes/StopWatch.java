package com.bridgelabz.codes;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		double start=0;
		double end=0;
		
		 start = Utility.time();
		System.out.println(start);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end = Utility.time();
		System.out.println(end);
		double time=Utility.stopWatch(start, end);
		
		

	}

}
