package com;

import org.junit.Assert;
import org.junit.Test;

import static com.Merge.merge;

/**
 * @author kamontat
 * @version 1.0
 * @since 2/21/2017 AD - 12:04 AM
 */
public class MergeTest {
	private Integer[] expected = new Integer[]{2, 3, 11, 22, 31, 34, 44, 53, 71, 100};
	private Integer[] expectedReverse = new Integer[]{100, 71, 53, 44, 34, 31, 22, 11, 3, 2};
	
	@Test
	public void testEqualsSortArray() {
		int[] a = new int[]{2, 11, 44, 53, 100};
		int[] b = new int[]{3, 22, 31, 34, 71};
		
		Integer[] result = merge(a, b, true);
		Integer[] resultReverse = merge(a, b, false);
		
		Assert.assertArrayEquals(expected, result);
		Assert.assertArrayEquals(expectedReverse, resultReverse);
	}
	
	@Test
	public void testNotEqualsSortArray() {
		int[] a = new int[]{3, 11, 34};
		int[] b = new int[]{2, 22, 31, 44, 53, 71, 100};
		
		Integer[] result1 = merge(a, b, true);
		Integer[] result2 = merge(b, a, true);
		
		Assert.assertArrayEquals(expected, result1);
		Assert.assertArrayEquals(expected, result2);
		
		Integer[] resultReverse1 = merge(a, b, false);
		Integer[] resultReverse2 = merge(b, a, false);
		
		Assert.assertArrayEquals(expectedReverse, resultReverse1);
		Assert.assertArrayEquals(expectedReverse, resultReverse2);
	}
	
	@Test
	public void testEqualsArray() {
		int[] a = new int[]{71, 44, 53, 11, 2};
		int[] b = new int[]{3, 31, 22, 34, 100};
		
		Integer[] result = merge(a, b, true);
		Integer[] resultReverse = merge(a, b, false);
		
		Assert.assertArrayEquals(expected, result);
		Assert.assertArrayEquals(expectedReverse, resultReverse);
	}
	
	@Test
	public void testNotEqualsArray() {
		int[] a = new int[]{100, 31, 2};
		int[] b = new int[]{3, 71, 34, 53, 11, 22, 44};
		
		Integer[] result1 = merge(a, b, true);
		Integer[] result2 = merge(b, a, true);
		
		Assert.assertArrayEquals(expected, result1);
		Assert.assertArrayEquals(expected, result2);
		
		Integer[] resultReverse1 = merge(a, b, false);
		Integer[] resultReverse2 = merge(b, a, false);
		
		Assert.assertArrayEquals(expectedReverse, resultReverse1);
		Assert.assertArrayEquals(expectedReverse, resultReverse2);
	}
	
}