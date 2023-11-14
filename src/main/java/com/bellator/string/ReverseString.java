package com.bellator.string;

public class ReverseString 
{
	// 1. using charAt(),
	static void reverseString(String str)
	{
		String rev = "";
		
			for(int i=str.length()-1; i>=0; i--)
			{
				rev += str.charAt(i);
			}
		System.out.println("\n Original string given:"+str+"\n Reversed string:"+rev);
	}
	
	// 2. using stringBuilder,
	static void strReverse(String st)
	{
		var sb = new StringBuilder(st);
		System.out.println("\n Original string:"+st+"\n Reversed string:"+sb.reverse());	
	}
	
	// 3. Using Java8,
	static void stringReverseJava8(String st)
	{
		String string = new StringBuilder(st).reverse().toString();
		System.out.println("\nOriginal string:"+st+"\nReversed striing:"+string);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nProgram to reverse a string in Java\n");
		System.out.println("\n1. Using charAt(),\n");
		reverseString("Gradle");
		System.out.println("\n2. Using StringBuilder\n");
		strReverse("String");
		System.out.println("\n3. Using StringBuilder\n");
		stringReverseJava8("Java8");
	}

}
