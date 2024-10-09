package com.dest.strings;
import java.util.*;

public class StringCode5 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String s1 = sc.next();
	String s2 = "";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2 = s2 + s1.charAt(i);
	}
	if(s1.equals(s2)==true)
	{
		System.out.println("The given String is a palindrome");
	}
	else
	{
		System.out.println("The given String is not a palindrome");
	}
	
}
}
