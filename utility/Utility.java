package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Utility {

	// all scanner inputs
	static Scanner sc = new Scanner(System.in);

	public static int inputInt() {

		int a = sc.nextInt();

		return a;

	}

	public static String inputString() {

		String a = sc.next();

		return a;

	}
	
	public static String inputStringLong() {

		String a = sc.nextLine();

		return a;

	}

	public static double inputDouble() {

		double a = sc.nextDouble();

		return a;
	}
	
	
	public static long inpuLong() {

		long a = sc.nextLong();

		return a;
	}
	
	public static boolean inputBoolean() {

		boolean a = sc.nextBoolean();

		return a;
	}
	//-----------------------------------

	// question 1 (replace username)(functional)
	public static String replace(String name, String statement) {

		String st = null;
		st = statement.replace("<<UserName>>", name);

		return st;
	}
	

	// question 2(head and tail)(functional)
	public static void flip(int number) {

		double head = 0;
		double tails = 0;
		double total = 0;
		double headPercent = 0.0;
		double tailsPercent = 0.0;

		for (int i = 0; i < number; i++) {

			double flipper = Math.random();

			if (flipper > 0.5) {

				head++;
				total++;
			} else {

				tails++;
				total++;
			}
		}

		headPercent = (head / total) * 100;
		tailsPercent = (tails / total) * 100;
		System.out.println("Head percent is " + headPercent);
		System.out.println("Tails percent is " + tailsPercent);

	}
	
	// question 3 (leap year)(functional)

	public static void leapYear(String year) {

		int saal = 0;

		if (year.length() <= 3) {

			System.out.println("enter the digit of four years");
			return;
		}

		saal = Integer.parseInt(year);

		if (saal % 4 == 0) {

			System.out.println(saal + " is leap year");
			return;
		}

		if (saal % 400 == 0) {

			System.out.println(saal + " is leap year");
			return;
		}

		System.out.println(saal + " is not leap year");

	}
	
	// question 4--- 2 raise to power table (functional)
	
	public static void table(int pow){
		
		if (pow>=31){
			
			System.out.println("plz select power less then 31");
			return;
		}
		
		for (int i = 1; i <=pow; i++) {
			System.out.println(2+" raise to "+i+"="+(Math.pow(2, i)));
		}
		
	}
	
	// question 5 Harmonic number(functional)
	public static void harmonicCal(double n) {
		double sum = 0;
		if (n == 0) {
			System.out.println("enter proper harmonic number");
		}

		for (double i = 1; i <= n; i++) {
			// System.out.println(i);
			sum = sum + (1 / i);

		}

		System.out.println(n + "th harmonic is " + sum);

	}

	// question 6 primefactor (functional)

	public static void factorization(int num) {

		for (int j = 0; j <= num; j++) {

			while (num % 2 == 0) {

				System.out.println(2 + " ");
				num = num / 2;
				break;
			}

			for (int i = 3; i <= num; i = i + 2) {

				if (num % i == 0) {

					System.out.println(i + " ");
					num = num / i;

				}

			}

		}

		if (num != 1) {
			System.out.println(num);
		}

	}
	
	// question 6 prime factorization(functional)

	public static void primeFactor(long n) {
		for (long i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 1)
			System.out.println(n);
		else
			System.out.println();
	}
	
	// question 7 gambler (functional)
	public static void gambling(int stake, int goal, int times) {
		int wins = 0;
		int loss = 0;
		double winPercent = 0;

		for (int i = 1; i <= times; i++) {

			int money = stake;
			while (money > 0 && money < goal) {

				if (Math.random() > 0.5) {

					money++;
					if (money == 0) {

						loss++;
					} else if (money >= goal) {

						wins++;
					}

				} else {

					money--;
					if (money == 0) {

						loss++;
					} else if (money >= goal) {

						wins++;
					}

				}

			}

		}

		winPercent = ((double) wins / (double) times) * 100;
		System.out.println("Number of wins " + wins);

		System.out.println("Percentage of wins " + winPercent);
		System.out.println("Percentage of loss " + (100 - winPercent));

	}
	
	// question 8 Coupon number
	
	
	public static float random() {
		return (float) Math.random() * 9999;
	}
	
	
	public static void distinct(int n) {
		boolean same = false;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			float value = random();
			for (int j = 0; j < n; j++) {
				if (a[j] == value) {
					same = true;
					break;

				}
				if (same == false) {
					a[i] = (int) value;
				}

			}

		}
		System.out.println("Distinct Coupon number are:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
	
	
	
	// question 10 triplet (functional)

	public static void triplet(int size) {

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the value to the array");
			arr[i] = Utility.inputInt();

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length - 2; k++) {

					if (arr[i] + arr[j] + arr[k] == 0) {

						System.out.println(
								arr[i] + " " + arr[j] + " " + arr[k] + " values at index " + i + " " + j + " " + k);
					}

				}
			}

		}

	}
	
	
	
	// question 9 Array library (functional)
	public static void printing(String st) {

		PrintWriter pw = new PrintWriter(System.out);
		pw.println(st);

		pw.flush();
		

	}

		
	public static void prints(String st) {

		PrintWriter pw = new PrintWriter(System.out);
		pw.print(st);

		pw.flush();
		

	}
	
	
	
	
	public static  void arraySelect() {
		
		int size = 0;
		System.out.println("select the array type:- 1.integer 2.boolean 3.double");
	//	Utility.printing("select the array type:- 1.integer 2.boolean 3.double");
		int a= Utility.inputInt();
		System.out.println(a);
		if (a == 1) {

			System.out.println("enter the size of array");
			size = Utility.inputInt();
			int[][] arr = new int[size][size];

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.println("enter the values to array");
					arr[i][j] = Utility.inputInt();

				}

			}
			//reading 

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					
					String val=Integer.toString(arr[i][j]);
						Utility.prints(val);	

				}
				System.out.println();
			}
			

		}
		else if(a==2){
			
			System.out.println("enter the size of array");
			size = Utility.inputInt();
			boolean[][] arr = new boolean[size][size];

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.println("enter the values to array");
					arr[i][j] = Utility.inputBoolean();

				}

			}
			//reading 

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					
					String val=Boolean.toString(arr[i][j]);
						Utility.prints(val);	

				}
				System.out.println();
			}
			
			
		}
		else if (a==3){
			
			System.out.println("enter the size of array");
			size = Utility.inputInt();
			double[][] arr = new double[size][size];

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.println("enter the values to array");
					arr[i][j] = Utility.inputDouble();

				}

			}
			
			//reading 

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					
					String val=Double.toString(arr[i][j]);
						Utility.prints(val);	

				}
				System.out.println();
			}
			
		}
		
		else{
			System.out.println("enter the correct value");
		}
		
		

	}
	
	
	// question 11 euclidian distance
	public static void euclidean (String x1,String y1){
		
		
		
		double x=Double.parseDouble(x1);
		double y=Double.parseDouble(y1);
		
		
		double d=Math.pow(x, 4);
		
		double sum=Math.pow(x, 2)+Math.pow(y, 2);
		
		double result= Math.pow(sum ,0.5);
		System.out.println(result);
		
		
		
	}
	
	//question 12 permutation of string 
	
	//swap
    public static  String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	
	//recursive permute
	
    public static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
             //  str = swap(str,l,i);
            }
        }
    }
	
	
	
	
	// question 13 StopWAtch

	public static double time() {
		double time = System.currentTimeMillis();

		return time;
	}

	public static double stopWatch(double start, double end) {
		double timelapsed = ((end - start));
		System.out.println("Time elapsed is:" + timelapsed +" msec");
		
		return timelapsed ;
	}
	
	// question 15 Quadratic equation 
	
	public static double delta(double a,double b,double c){
		double delta=0;
		double b2=0;
		
		b2=Math.pow(b, 2);
		delta=b2-4*a*c;
		
		return delta;

	} 
	
	public static void roots(double delta,double a,double b,double c){
		
		double dsqt=Math.sqrt(delta);
		
		double r1=(-b+dsqt)/(2*a);
		double r2=(-b-dsqt)/(2*a);
		
		System.out.println("root 1 "+r1);
		System.out.println("root 2 "+r2);
		
	}
	
	//question 16 (wind chill) 
	
	public static void chill(double temperature,double speed) {
		double t=temperature;
		double v= speed;
		double r=0;
		double w=0;
		
		if (t<50 && v>3 && v<120){
			
			r=Math.pow(v, 0.16);
			
			w=35.74+0.6215*t+(0.4275*t-35.75)*r;
			System.out.println("WindChill is "+w);
		}
		else{
			
			System.out.println("entered value is not in range");
		}
	
	}
	
	// ALOGORITHMS -------------

	// QUESTION 1 ANAGRAM detection
	public static void anagram(String s1, String s2) {

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		int count = 0;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {

				for (int j = 0; j < a2.length; j++) {

					if (a1[i] == a2[j]) {

						a2[j] = 0;
						count++;
					}

				}

			}
			if (count == a1.length) {
				System.out.println("Given strings are anagram");
			}

		} else {
			System.out.println("Given strings are no an anagram");
		}

	}
	
	
	
	// question 2 prime number range

	public static void range(int a, int b) {

		for (int i = a; i <= b; i++) {

			Utility.primer(i);

		}

	}

	
	public static void primer(int p) {

		
		int count = 0;
		for (int j = 2; j < p; j++) {

			if (p % j == 0) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println(p + " ");
			 Utility.storeArray(p);
			Utility.palindromic(p);

		}

	}

	// question 3 extension

	public static void palindromic(int num) {

		String st = Integer.toString(num);
		char[] s = st.toCharArray();

		int size = s.length;
		char[] s1 = new char[size];
		int l = 0;
		for (int i = size - 1; i >= 0; i--) {
			s1[l] = s[i];

			l++;
		}

		String st1 = new String(s);

		String st2 = new String(s1);

		if (st1.equals(st2)) {
			System.out.println(st1 + " is palindromic ");
		}

	}
 
	// storing 
	public static void storeArray(int num) {
		
		ArrayList kk=Utility.adder();
		kk.add(num);
		

	}

	//arraylist
	public static ArrayList adder() {

		ArrayList al = new ArrayList();
		
		return al;
		
	}

	// stimulate anagram

	public static void checkAnagram(ArrayList list) {

		for (int i = 0; i < list.size(); i++) {
			int num1 = (int) list.get(i);
			for (int j = i + 1; j < list.size() - 1; j++) {
				int num2 = (int) list.get(j);
				Utility.aCheck(num1, num2);

			}

		}

	}

	// Anagram check

	public static void aCheck(int num1, int num2) {

		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		int count = 0;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {

				for (int j = 0; j < a2.length; j++) {

					if (a1[i] == a2[j]) {

						a2[j] = 0;
						count++;
					}

				}

			}
			if (count == a1.length) {
				System.out.println(s1 + " " + s2 + " are anagram");
			}

		}

	}
	
	// QUESTION 4 Utility methods

	public static void binarySearchInt(int arr[], int sIndex, int eIndex, int x) {

		// int mid=(sIndex+eIndex)/2;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;

			if (arr[mid] == x) {
				System.out.println("match found at index " + mid);
				return;
			}

			if (arr[mid] > x) {

				binarySearchInt(arr, sIndex, mid - 1, x);
			} else {

				binarySearchInt(arr, mid + 1, eIndex, x);
			}

		} else {

			System.out.println("match not found");
		}
	}

	public static void binarySearchString(String st[], int sIndex, int eIndex, String x) {

		// int mid=(sIndex+eIndex)/2;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;

			if (st[mid].equals(x)) {
				System.out.println("match found at index " + mid);
				return;
			}

			if (st[mid].compareTo(x) > 0) {

				binarySearchString(st, sIndex, mid - 1, x);
			} else {

				binarySearchString(st, mid + 1, eIndex, x);
			}

		} else {

			System.out.println("match not found");
		}
	}

	public static void makeArrInt(int size) {
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {

			System.out.println("enter the value to the array");
			arr[i] = Utility.inputInt();

		}

	}

	public static void makeArrString(int size) {

		String st[] = new String[size];
		for (int i = 0; i < size; i++) {

			System.out.println("enter the value to the array");
			st[i] = Utility.inputString();

		}

	}
	
	public static void iSortInt(int arr[]) {

		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

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
	
	public static void bSortInt(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}

	public static void bSortString(String st[]) {

		for (int i = 0; i < st.length; i++) {

			for (int j = i + 1; j < st.length; j++) {

				if (st[i].compareTo(st[j]) > 0) {

					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;

				}

			}

		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}

	}
	
	//StopWatch for binary search integer
	public static double binaryIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		int []arr1={1,2,34,56,78,99};
		start = Utility.time();
		System.out.println(start);
		Utility.binarySearchInt(arr1, 0, arr1.length, 56);
		end = Utility.time();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}
	
	//StopWatch for binary search String
	public static double binaryStringStopWatch(){
		
		double start=0;
		double end=0;
		double result=0;
		String[] st1 ={"acon","bcon","con","dcon","econ","fcon"};
		start = Utility.time();
		System.out.println(start);
		Utility.binarySearchString(st1, 0, st1.length, "con");
		end = Utility.time();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}

	//StopWatch for Insertion sort String
	
	public static double iSortStringStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		String [] st={"zon","bcon","ac","mk","za","ad"};
		start = Utility.time();
		System.out.println(start);
		Utility.iSortString(st);
		end = Utility.time();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}
	//StopWatch for insertion integer
	
	public static double iSortIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
	//	String [] st={"zon","bcon","ac","mk","za","ad"};
		int arr[]= {2,3,1,54,0,7,5};
		start = Utility.time();
		System.out.println(start);
		Utility.iSortInt(arr);
		end = Utility.time();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}
	
	
	
	
	
	
	//StopWatch for bubble sort String
	
	public static double bSortStringStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		String [] st={"zon","bcon","ac","mk","za","ad"};
		start = Utility.time();
		System.out.println(start);
		Utility.bSortString(st);
		end = Utility.time();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}

	//Stopwatch for bubble sort int
	

	public static double bSortIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
	
		int arr[]= {2,3,1,54,0,7,5};
		start = Utility.time();
		System.out.println(start);
		Utility.bSortInt(arr);
		end = Utility.time();
		System.out.println(end);
		result=Utility.stopWatch(start, end);
		return result;
	}

	
	//question number 5 user search binary
	


	public static int[]  createArray(int a , int b){
		int size= (b-a)+1;
		System.out.println(size+" "+a+" "+b);
		
		int [] ary= new int[size];
		System.out.println(Arrays.toString(ary));
		for(int i=0;i<size;i++){
					
			ary[i]=a;
			a++;
			
		}
		System.out.println(Arrays.toString(ary));
		return ary;
	
		
	}
	
	//search method

	public static void binarySearchUser(int arr[], int sIndex, int eIndex) {

		int want = 0;
		// int mid=(sIndex+eIndex)/2;
		if (eIndex >= sIndex) {
			int mid = sIndex + (eIndex - sIndex) / 2;
			System.out.println(arr[mid] + " is this number is your disered value ? ");
			System.out.println("1.yes  2.less then  3.greater then");
			want = Utility.inputInt();

			if (want == 1) {

				System.out.println("match found at index " + mid);

			} else if (want == 2) {

				System.out.println(mid);
				binarySearchUser(arr, sIndex, mid - 1);

			} else if (want == 3) {

				binarySearchUser(arr, mid + 1, eIndex);
			}

		} else {

			System.out.println("match not found");
		}
	}
	
	
	//QUESTION 6 binary search the word from word list
	
	public static String[] wordSort(String st[]) {

		for (int i = 0; i < st.length; i++) {

			for (int j = i + 1; j < st.length; j++) {

				if (st[i].compareTo(st[j]) > 0) {

					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;

				}

			}

		}

		for (int i = 0; i < st.length; i++) {

			System.out.println(st[i]);

		}
		return st;

	}
	
	//question 8 bubble sort Integers list
	
	
	
	
	
	
	
	
}
