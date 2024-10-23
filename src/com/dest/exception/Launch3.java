package com.dest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch3 {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Divison operation started");
			System.out.println("Enter the num-1:");
			int num1 = sc.nextInt();//critical statement
			System.out.println("Enter the num-2:");
			int num2 = sc.nextInt();//critical statement
			int res = num1/num2;//critical statement
			System.out.println(res);
			System.out.println("Divison operation is completed");
			System.out.println("Array opertaions started");
			System.out.println("Enter the array size");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the position to insert the value:");
			int pos = sc.nextInt();
			System.out.println("Enter the value");
			int val = sc.nextInt();
			arr[pos] = val;
			System.out.println("Value is added");
			System.out.println("Array operation is completed");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception is handled");
		}
		catch (InputMismatchException im)
		{
			System.out.println("Input Mismatch Exception is handled");
		}
		catch (NegativeArraySizeException na)
		{
			System.out.println("Negative Array Size Exception is handled");
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index Out Of Bounds Exception is handled");
		}
		catch (Exception e)//generic catch block 
		{
			System.out.println("Exception Occured in main is handled");
		}
	}
}
