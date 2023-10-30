package com.bellator.array;

import java.util.Arrays;

public class SplitArray 
{
	static void splitArray(int[] arr)
	{
		System.out.println("\nOriginal size of the array:"+arr.length);
		int[] subArray1 = Arrays.copyOfRange(arr, 0, 3);
		int[] subArray2 = Arrays.copyOfRange(arr, 3, 6);
		System.out.println("\1. Original Array:"+Arrays.toString(arr));
		System.out.println("\2. Original Array:"+Arrays.toString(subArray1));
		System.out.println("\3. Original Array:"+Arrays.toString(subArray2));
	}
	public static void main(String[] args) 
	{
		System.out.println("\n Program to split the Array\n.,");
		splitArray(new int[]{1,2,3,4,5,6,7,8,9});
	}

}
