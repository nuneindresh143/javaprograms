package com.dest.pratice;

import java.util.Scanner;


public class Code1 {
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
	System.out.println("Display the even index elements");
	for(int i=0; i<arr.length; i++)
	{
		if(i%2==0)
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println();
	System.out.println("Display the odd index elements");
	for(int i=0; i<arr.length; i++)
	{
		if(i%2!=0)
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println();
	System.out.println("Display the odd elements in the array");
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]%2!=0)
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println();
	System.out.println("Display the even elements in the array");
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]%2==0)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
}
