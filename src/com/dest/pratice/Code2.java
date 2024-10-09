package com.dest.pratice;

import java.util.Scanner;

public class Code2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	int sum=0;
	int mul=1;
	int [] arr = new int[n];
	System.out.println("Insert the elements into the array");
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Displaying the sum of all elements");
	for(int i=0; i<arr.length; i++)
	{
		sum = sum+arr[i];
	}
	System.out.println("The sum is: "+sum);
	System.out.println("Displaying the product of all elements");
	for(int i=0; i<arr.length; i++)
	{
		mul = mul*arr[i];
	}
	System.out.println("The sum is: "+mul);
}
}
