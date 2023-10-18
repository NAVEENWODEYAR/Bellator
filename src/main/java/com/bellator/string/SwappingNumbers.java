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
	public static void main(String[] args) 
	{
		System.out.println("\n Swapping two numbers without using third number.,");
		swap2Numbers(1, 2);
	}

}
