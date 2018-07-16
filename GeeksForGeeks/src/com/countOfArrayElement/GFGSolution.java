package com.countOfArrayElement;

import java.util.Scanner;

public class GFGSolution {
	public static void main(String[] args) {

		// Scanner for input
		Scanner in = new Scanner(System.in);
		// no of test cases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {

			int len = in.nextInt();

			int[] arr = new int[len];
			//Storing 0 initially in the array
			for (int j = 0; j < len; j++) {
				arr[i] = 0;
			}
			//then adding the no of count of elements in the same array
			for (int j = 0; j < len; j++) {
				arr[in.nextInt() - 1] += 1;
			}
			//printing the array's count
			for (int j = 0; j < len; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println("");

		}
		in.close();

	}

}
