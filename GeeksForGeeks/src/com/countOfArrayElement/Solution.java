package com.countOfArrayElement;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// Scanner for input
		Scanner in = new Scanner(System.in);
		// no of test cases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			// length of the array
			int len = in.nextInt();
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = in.nextInt();
			}
			// Retrieving from 1 to N and matching it with array with loop and increasing
			// the count
			for (int j = 1; j <= len; j++) {
				int count = 0;
				for (int k = 0; k < len; k++) {
					if (j == arr[k]) {
						count++;
					}
				}
				System.out.print(count + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
