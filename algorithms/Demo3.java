package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list= new ArrayList<String>();
		System.out.println("Enter the size of list:");
		int n=Utility.inputInt();
		System.out.println("Enter values in to the list:");
		for(int i=0;i<n;i++)
		{
			list.add(Utility.inputString());
		}
		String[] array=new String[list.size()];
		array=list.toArray(array);
		insertionSort(array);
		
		
	}

	//Method For Insertion Sort
    public static <T extends Comparable<T>> void insertionSort(T array[]) {
        int length=array.length;
        int j;
        T temp;
        for(int i=0;i<length;i++)
        {
            j=i;
            temp = array[i];
            while(j>0&&temp.compareTo(array[j-1])<0)
            {//
                array[j]=array[j-1];
                j=j-1;
            }
            array[j]=temp;//insert unsorted element
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

	
	
}
