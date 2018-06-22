package com.averageCountArray;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	int[] intArray;
	int[] compareArray;
	int[] resultArray;
	Scanner in = new Scanner(System.in);
	int testCases = in.nextInt();
	for (int i = 0; i < testCases; i++) {
		int length = in.nextInt();
		intArray = new int[length];
		compareArray = new int[length];
		resultArray = new int[length];
		int compare = in.nextInt();
		for (int j = 0; j < length; j++) {
			intArray[j] = in.nextInt();
			int average = (intArray[j] + compare) / 2;
			//System.out.println(average);
			compareArray[j] = average;
		}
		for (int j = 0; j < length; j++) {
			int yes = 0;
			for (int k = 0; k < length; k++) {
				//System.out.println(compareArray[j] + " " +intArray[k]);
				if(compareArray[j] == intArray[k]){
					yes++;
				}
			}
			resultArray[j] = yes;
		}
		for (int j = 0; j < length; j++) {
			System.out.print(resultArray[j]+" ");
		}
	}
}
}
