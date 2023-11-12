package com.bellator.series;

public class FibonacciSeries 
{
	// using for loop,
	static void fiboNacciSeries(int n)
	{
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=0; i<n; i++)
		{
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	// using recursion,.
	static int fiboNacciUsingRecursion(int n)
	{
		if(n<= 1)
			return n;
		return fiboNacciUsingRecursion(n-1)+fiboNacciUsingRecursion(n-2);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n******Fibonacci Series**********\n");
		fiboNacciSeries(5);
		System.out.println("********");
		int n = 10;
		for(int i=0; i<n; i++)
		{
			System.out.print(fiboNacciUsingRecursion(i));
		}
		
	}

}
