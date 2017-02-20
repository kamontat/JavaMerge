package com.kamontat;

import java.util.*;


public class Merge {
	/**
	 * merge 2 array and sort it. <br>
	 * running time wil be O((a+b) log(a+b))
	 *
	 * @param a
	 * 		first array
	 * @param b
	 * 		second array
	 * @param ascending
	 * 		if want to sort by ascending
	 * @return merge array with sorted
	 */
	static Integer[] merge(int[] a, int[] b, boolean ascending) {
		// O(1)
		Integer[] returnArray = new Integer[a.length + b.length];
		HashSet<Integer> set = new HashSet<>();
		
		// O(a+b)
		for (int ai : a)
			set.add(ai);
		for (int bj : b)
			set.add(bj);
		
		// O(n log(n))
		TreeSet<Integer> sortedSet = new TreeSet<>(set);
		
		// O(a+b)
		if (ascending) return (Integer[]) sortedSet.toArray(returnArray);
		else return sortedSet.descendingSet().toArray(returnArray);
	}
}
