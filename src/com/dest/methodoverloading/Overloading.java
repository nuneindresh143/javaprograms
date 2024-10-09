package com.dest.methodoverloading;

class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	float add(float a,float b,float c)
	{
		return a+b+c;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	double add(double a,double b,double c)
	{
		return a+b+c;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	float add(float a,int b)
	{
		return a+b;
	}
	double add(int a,float b,double c)
	{
		return a+b+c;
	}
}
public class Overloading {
public static void main(String[] args) {
	Calculator c = new Calculator();
	System.out.println(c.add(10, 10));
	System.out.println(c.add(10.7f, 10.9f));
	System.out.println(c.add(234.432, 345.654));
	System.out.println(c.add(11.5f, 12.4f, 13.6f));
	System.out.println(c.add(10, 10, 10));
	System.out.println(c.add(234.543, 123.321, 876.678));
	System.out.println(c.add(10, 10.5f));
	System.out.println(c.add(10.8f, 20));
	System.out.println(c.add(10, 10.5f, 100.432));
}
}
