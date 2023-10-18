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
		System.out.println("\n Original string given:"+st+"\n Reversed string:"+sb.reverse());	
	}
	
	// 3. Using Java8,
	static void stringReverseJava8(String st)
	{
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nProgram to reverse a string in Java\n");
		System.out.println("\n1. Using charAt(),");
		reverseString("Gradle");
		System.out.println("\n2. Using StringBuilder");
		strReverse("String");
	}

}
