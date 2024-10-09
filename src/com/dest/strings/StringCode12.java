package com.dest.strings;


public class StringCode12 {
public static void main(String[] args) {
	String s1 = new String("sita");
	String s2 = new String("Ravana");
	s1.concat(s2);//direct changes are not reflected
	s1 = s1.concat(s2);
	System.out.println(s1);
	StringBuffer sb1 = new StringBuffer("Sita");
	StringBuffer sb2 = new StringBuffer("Rama");
	sb1.append(sb2);
	System.out.println(sb1);
	StringBuilder sbl1 = new StringBuilder("Rama");
	StringBuilder sbl2 = new StringBuilder("Sita");
	sbl1.append(sbl2);
	System.out.println(sbl1);
}
}
