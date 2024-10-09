package com.dest.strings;

public class StringCode2 {
	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "Rama";
		if(s1.compareTo(s2)==0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println(s1.compareTo(s2));
			System.out.println("Strings are not equal");
		}
		String s3 = new String("Rama");
		String s4 = new String("rama");
		if(s3.compareTo(s4)==0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println(s3.compareTo(s4));
			System.out.println("Strings are not equal");
		}
	}

}
