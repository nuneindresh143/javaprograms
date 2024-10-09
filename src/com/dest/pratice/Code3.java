package com.dest.pratice;

import java.util.Scanner;

public class Code3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	System.out.println("Insert the values into the array");
	int [] arr = new int[n];
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Displaying the largest element in the array");
	int large = arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] > large)
		{
			large = arr[i];
		}
	}
	System.out.println("largest value is: "+large);
}
}
