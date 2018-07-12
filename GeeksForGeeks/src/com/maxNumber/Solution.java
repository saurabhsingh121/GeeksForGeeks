package com.maxNumber;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//program to find maximum number with a number where its digit is not present in the maximum
//number
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Storing the number
		Integer num = new Integer(scan.nextInt());
		// Changing the digits of the number in Array as well as setting them in a set
		String str = Integer.toString(num);
		int[] intArray = new int[str.length()];

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = str.charAt(i) - '0';
			set.add(intArray[i]);
		}
		// Creating a superset of 10 number(1 2 3 4 5 6 7 8 9 0)
		Set<Integer> superSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			superSet.add(i);
		}

		// now creating minus of set and superset
		superSet.removeAll(set);
		// Searching the first digit
		//making set of max digit which is greater than first digit, further we will remove these
		Set<Integer> maxDigit = new LinkedHashSet<Integer>();
		int[] resultArray = new int[str.length()];
		for (Integer integer : superSet) {
			if (intArray[0] < integer) {
				maxDigit.add(integer);
			}
		}
		Set<Integer> newSet = new LinkedHashSet<Integer>();
		newSet.addAll(superSet);
		newSet.removeAll(maxDigit);
		// getting the max first digit
		resultArray[0] = Collections.max(newSet);
		// getting the other places max digit
		for (int i = 1; i < resultArray.length; i++) {
			resultArray[i] = Collections.max(superSet);
		}
		//converting result into a normal digit
		int temp = 0, result = 0;
		for (int i = 0, j = (resultArray.length - 1); i < resultArray.length; i++, j--) {
			temp = (int) (resultArray[i] * Math.pow(10, j));
			result += temp;
		}

		System.out.println("Max result: " + result);

	}
}
