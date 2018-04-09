package com.bridgelabz.Algorithms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public  class Demo {

	public static void main(String[] args) {
	
		
		
		System.out.println("enter the your year");
		double y=Utility.inputDouble();
		System.out.println("enter the your month");
		double m=Utility.inputDouble();
		System.out.println("enter the your date");
		double d=Utility.inputDouble();
		
		double y0=0;
		double x=0;
		int d0=0;
		double m0=0;
		
		/*y0 = y − (14 − m) / 12;
		 * x = y0 + y0/4 − y0/100 + y0/400
			m0 = m + 12 × ((14 − m) / 12) − 2
			d0 = (d + x + 31m0 / 12) mod 7

		 * 
		 * */
		
		
		 y0=forY(y, m);
		 x=forX(y0);
		m0=forM(m);
	  d0=(int)forD(d, m0, x);
		
		System.out.println(day(d0));
		
	}
	
	public static double forY(double y,double m){
		
		
		double yo=y-(14-m)/12;
		
		return yo;
		
	}
	
	public static double forX(double y0){
		
		double xo= y0 +y0/4-y0/100 +y0/400;
		
		return xo;
		
	}
	
    public static double forM(double m){
		
		double mo= m +12 *((14 - m) / 12) - 2;
		
		return mo;
	}
    
    public static double forD(double d,double m0,double x){
		
		double d0= (d + x + 31*m0 / 12)%7;
		
		return d0;
	}
    
	public static String day(int d0){
		
		if(d0==0){
			return "SUNDAY";
		}
		if(d0==1){
			return "MONDAY";
		}
		if(d0==2){
			return "TUESDAY";
		}
		if(d0==3){
			return "WEDNESDAY";
		}
		if(d0==4){
			return "THURSDAY";
		}
		
		if(d0==5){
			return "FRIDAY";
		}
		if(d0==6){
			return "SATURDAY";
		}
		
		
		
		return null;
		
	}
	
	
}
