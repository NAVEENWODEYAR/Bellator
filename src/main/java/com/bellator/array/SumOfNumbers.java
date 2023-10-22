package com.bellator.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class SumOfNumbers 
{
	
	// sum of elements in the array.,
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
	
	// using stream API.,
	static void sumOfElements(Integer[] arr)
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
							DoubleSummaryStatistics mapToDouble = list.parallelStream().mapToDouble(Integer::intValue).summaryStatistics();
							System.out.println(mapToDouble.getMax());
							System.out.println(mapToDouble.getSum());
	}
	
	
	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,5};
//		sumOfArray(num);
		sumOfElements(new Integer[] {1,2,3,4,5});
	}

}
