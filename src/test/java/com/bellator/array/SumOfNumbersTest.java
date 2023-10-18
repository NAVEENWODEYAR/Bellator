package com.bellator.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SumOfNumbersTest
{
	@Test
	public void sumOfArrayTest()
	{
		var sumOfArr = new SumOfNumbers();
		int actual = sumOfArr.sumOfArray(new int[]{1,2,3,4,5,6});
		int expected = 15;
		
		assertEquals(expected, actual);
	}
}
