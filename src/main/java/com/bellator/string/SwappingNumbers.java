package com.bellator.string;

public class SwappingNumbers
{
	static void swap2Numbers(int a, int b)
	{
		System.out.println("\n Before swapping,a:"+a+",b:"+b);
		a = a+b;	// 3
		b = a-b;	// 1
		a = a-b;	// 2
		System.out.println("\n After swapping,a:"+a+",b:"+b);
	}
	
	// Write a Java program to check if a vowel is present in a string
	static boolean vowelIsPresent(String st)
	{
		boolean matches = st.toLowerCase().matches(".*[aeiou].*");
		return matches;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Swapping two numbers without using third number.,");
		swap2Numbers(1, 2);
		System.out.println("*******");
		boolean vowelIsPresent = vowelIsPresent("vowel");
		System.out.println(vowelIsPresent);
	}

}
