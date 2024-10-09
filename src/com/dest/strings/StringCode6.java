package com.dest.strings;

import java.util.*;

class Vowelsoperations
{
	Scanner sc = new Scanner(System.in);
	void countVowelConstant(String s)
	{
		int vowel_count = 0;
		int consonant_count = 0;
		System.out.println("Calculating the vowel and consonant count: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				vowel_count++;
			}
			else
			{
				consonant_count++;
			}
		}
		System.out.println("The vowel count is = "+vowel_count);
		System.out.println("The consonant count is = "+consonant_count);
		System.out.println("===============================");
	}
	void lowerCaseVowel(String s)
	{
		int lower_vowel_count = 0;
		System.out.println("Calculating the lower case vowel count: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				lower_vowel_count++;
			}
		}
		System.out.println("The lower case vowel count: "+lower_vowel_count);
		System.out.println("======================================");
	}
	void upperCaseVowel(String s)
	{
		int upper_vowel_count = 0;
		System.out.println("Calculating the upper case vowel count: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				upper_vowel_count++;
			}
		}
		System.out.println("The upper case vowel count: "+upper_vowel_count);
		System.out.println("======================================");
	}
	void replaceAllVowels(String s)
	{
		String str_temp ="";
		System.out.println("Replacing the all vowels with the special  charcter: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				str_temp = str_temp + '@';
			}
			else
			{
				str_temp = str_temp + s.charAt(i);
			}

		}
		System.out.println("Replace string: "+str_temp);
		System.out.println("======================================");
	}
	void repalceUpperCaseVowels(String s)
	{
		String str_temp ="";
		System.out.println("Replacing the upper case vowels with the special  charcter: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				str_temp = str_temp + '@';
			}
			else
			{
				str_temp = str_temp + s.charAt(i);
			}

		}
		System.out.println("Replace string: "+str_temp);
		System.out.println("======================================");
	}
	void replaceLowerCase(String s)
	{
		String str_temp ="";
		System.out.println("Replacing the lower case vowels with the special  charcter: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				str_temp = str_temp + '@';
			}
			else
			{
				str_temp = str_temp + s.charAt(i);
			}

		}
		System.out.println("Replace string: "+str_temp);
		System.out.println("======================================");
	}
	void replaceIndiviualVowels(String s)
	{
		String str_temp ="";
		System.out.println("Replacing the lower case vowels with the special  charcter: ");
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='A')
			{
				str_temp = str_temp + '@';
			}
			else if(s.charAt(i)=='e'||s.charAt(i)=='E')
			{
				str_temp = str_temp + '$';
			}
			else if(s.charAt(i)=='i'||s.charAt(i)=='I')
			{
				str_temp = str_temp + '#';
			}
			else if(s.charAt(i)=='o'||s.charAt(i)=='O')
			{
				str_temp = str_temp + '&';
			}
			else if(s.charAt(i)=='u'||s.charAt(i)=='U')
			{
				str_temp = str_temp + '*';
			}
			else
			{
				str_temp = str_temp + s.charAt(i);
			}

		}
		System.out.println("Replace string: "+str_temp);
		System.out.println("======================================");
	}
}
public class StringCode6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		Vowelsoperations vo = new Vowelsoperations();
		vo.countVowelConstant(s);
		vo.lowerCaseVowel(s);
		vo.upperCaseVowel(s);
		vo.replaceAllVowels(s);
		vo.repalceUpperCaseVowels(s);
		vo.replaceLowerCase(s);
		vo.replaceIndiviualVowels(s);


	}

}
