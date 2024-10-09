package com.dest.pratice;

import java.util.Scanner;

public class Code4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	int sum = 0;
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
	System.out.println("Displaying the largest element in the array");
	int small = arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] < small)
		{
			small = arr[i];
		}
	}
	System.out.println("largest value is: "+small);
	System.out.println("Displaying the sum of all elements");
	for(int i=0; i<arr.length; i++)
	{
		sum = sum+arr[i];
	}
	int minSum = sum - arr[arr.length - 1];
    int maxSum = sum - arr[0];
    System.out.println("Minimum sum (n-1 elements): " + minSum);
    System.out.println("Maximum sum (n-1 elements): " + maxSum);
}
}
