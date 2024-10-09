package com.dest.arrayprogrammes;

import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size number: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Orginal Array");
	for(int num:arr)
	{
		System.out.print(num +" ");
	}
	reverseArray(arr);

    
    System.out.println("\nReversed array:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
}


public static void reverseArray(int[] arr) {
    int start = 0;             
    int end = arr.length - 1;  

    
    while (start < end) {
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        
        start++;
        end--;
    }
}
}
