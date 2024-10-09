package com.dest.pratice;

import java.util.Scanner;

public class Code5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	System.out.println("Insert the values into the array");
	int [] arr = new int[n];
	int [] res = {};
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("To print the orginial array");
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=arr.length; i<=0; i--)
	{
		res[n-i] = arr[i];
	}
	for(int i=0; i<res.length; i++)
	{
		System.out.print(res[i]+" ");
	}
}
}
