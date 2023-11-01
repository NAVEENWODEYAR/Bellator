package com.bellator.string;

public class PrimeNumber 
{
	static void primeNumber(int n)
	{
		System.out.println("\n Prime number is an number that cannot be evenly divided by any other number except 1 and itself");
		if(n==1 || n ==0)
		{
			System.out.println("");
		}
		if(n == 2)
		{
			System.out.println("");
		}
		for(int i=2; i<n/2; i++ )
		{
			if(i/2 == 0)
			{
				System.out.println("\n ");
			}
		}
		
		
	}
	public static void main(String[] args) 
	{
		System.out.println("\n Prime Number program");
	}

}
