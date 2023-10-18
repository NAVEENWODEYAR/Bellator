package com.bellator.array;

import java.util.Arrays;

public class SumOfNumbers 
{
	static int sumOfArray(int[] num)
	{
		int sum = 0;
		
		for(int i:num)
		{
			sum += i;
		}
		System.out.println("\n Array given,"+Arrays.toString(num));
		System.out.println("\n Sum of the integers in the given array:"+sum);
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,5};
		sumOfArray(num);
	}

}
