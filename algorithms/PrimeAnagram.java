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
		/*boolean status=Utility.FindAnagram(out);
		Utility.displayangaram(status);*/
		
		
		for (int i = 0; i < out.length-1; i++) {
			for (int j = i+1; j < out.length; j++) {
			//	System.out.println(out[i]+" "+out[j]);
				if(out[i]==17&&out[j]==71){
					System.out.println("break");
				}
				Utility.aCheck(out[i],out[j]);
			}
			
		}
		
	}

	/* public static int[] primeNumbers(int n)
	    {
	            int a[]=new int[n];int k=0;
	            for(int i=0;i<n;i++)
	            {
	                if(isPrime(i))
	                {
	                    a[k]=i;
	                    k++;
	                }
	            }
	            int len=0;
	            for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0)
	                        len++;
	                }
	               
	                int [] newArray = new int[len];
	                int j=0;
	                for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0) {
	                        newArray[j] = a[i];
	                        j++;
	                    }
	                }
	                System.out.println();
	              
	                for (int integer : newArray) {
	                    System.out.println(integer);
	                } 
	            return newArray;
	           
	       
	}
	
	//To check number is prime or not
	    public static boolean isPrime (int number) {
	  
	     for(int i=2; i<=number/2; i++){
	         if(number % i == 0){
	             return false;
	         }
	     }
	     return true;
	}
	    
	  //Method to find prime anagram
	    public static boolean FindAnagram(int[] out) {
	        int len=out.length;
	       boolean status=false;
	        for(int i=0;i<len;i++)
	        {
	            for(int j=i+1;j<len;j++)
	            {
	                //System.out.println(out[i]+" "+out[j]);
	            status=	 AnagramInteger(out[i],out[j]);
	           
	            }
	        }
	       return status;
	}
	    
	  //Method to display anagram
	    public static void displayangaram(boolean status) {
			if(status)
			{
				System.out.println("Is Anagram");
			}
			else
				System.out.println("Is Not Anagram");
	}
	    
	  //Method for integer anagram
	    public static boolean AnagramInteger(int n1, int n2) {
	   
	        String num1=String.valueOf(n1);
	        String num2=String.valueOf(n2);
	       boolean status= Anagram(num1, num2);
	       return status;
	}
	  //Method for Anagram String
	    public static boolean Anagram(String str1, String str2)
	    {
	        char[] string1=str1.toCharArray();
	        char[] string2=str2.toCharArray();
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        boolean isAnagram =false;
	        isAnagram = Arrays.equals(string1, string2);
	        if(isAnagram==true)
	        {
	           //pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
	        	 return isAnagram;
	        }
	        else
	           //System.out.println(str1+" , "+str2+" are not Anagram Strings");
	        	  return isAnagram;
	       
	}
	  //Method to display array
	    public static void display(int array[])
	    {
	       
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	}
	*/
}
