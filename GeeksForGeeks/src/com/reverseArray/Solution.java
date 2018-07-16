package com.reverseArray;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//Taking input
		Scanner in = new Scanner(System.in);
		//No of testCases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			//length of the array
			int len = in.nextInt();
			int[] arr = new int[len];
			//Storing the data in array
			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
			}
			//Reversing the array
			for (int j = len-1; j >= 0; j--) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
