package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Make a Choice:");
		System.out.println("Choose 1: Celsius to Fahrenit\nChoose 2: Fahrenit to Calsius");
		int choice=Utility.inputInt();
		System.out.println("Enter the temperature:");
		int temperature=Utility.inputInt();
		Utility.temperatureConvert(choice,temperature);
	}

}
