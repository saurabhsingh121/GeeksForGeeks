package com.aloneInCouple;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Scanner object for taking input
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			// length of the array should be odd
			int len = in.nextInt();
			if (len % 2 == 1) {
				int[] arr = new int[len];
				//storing the array
				for (int j = 0; j < len; j++) {
					arr[j] = in.nextInt();
				}
				//checking if the numbers of array repeats itself then increase the count
				for (int j = 0; j < len; j++) {
					int count = 0;
					for (int k = 0; k < len; k++) {
						if (arr[j] == arr[k]) {
							count++;
						}
					}
					//if count is one then that must be alone member of the array
					if (count == 1) {
						System.out.println("This is the number..." + arr[j]);
					}
				}

			}
		}
		in.close();
	}

}
