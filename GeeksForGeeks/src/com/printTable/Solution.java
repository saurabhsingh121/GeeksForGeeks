package com.printTable;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// Scanner for input
		Scanner in = new Scanner(System.in);
		// No of test Cases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			// number whose table needs to be found
			int num = in.nextInt();
			int count = 1;
			//while loop till 10 and then multiplication with 1 to 10
			while (count <= 10) {
				System.out.print((num * count) + " ");
				count++;
			}

		}
		in.close();
	}
}
