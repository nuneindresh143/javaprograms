package com.dest.strings;

public class StringCode4 {
	public static void main(String[] args) {
		String s1 = "RajaRamMohanRoy";
		System.out.println("original String :"+s1);
		System.out.println("original String :"+s1.toUpperCase());
		System.out.println("original String :"+s1.toLowerCase());
		System.out.println(s1.startsWith("Raja"));
		System.out.println(s1.startsWith("Roja"));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.endsWith("boy"));
		System.out.println(s1.charAt(4));
		/*System.out.println(s1.charAt(56));
		 * here the no.of chars is more the string so this is bounded
		 * Code error
		 */
		System.out.println(s1);
		System.out.println(s1.concat(s1));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('z'));
		String s2 = "          ";
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.length());
		System.out.println(s1.replace('a', '#'));
	}
}
