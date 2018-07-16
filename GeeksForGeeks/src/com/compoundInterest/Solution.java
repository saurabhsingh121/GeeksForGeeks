package com.compoundInterest;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		//Scanner for input
		Scanner in = new Scanner(System.in);
		//Number of testCases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			//input principle
			int p = in.nextInt();
			//input time
			int tm = in.nextInt();
			//input compound time
			int n = in.nextInt();
			//input rate
			int r = in.nextInt();
			//formula for generating compound
			double result = (p * Math.pow((1+((r*0.01)/n)),(n*tm)));
			System.out.println((int)Math.floor(result));
		}
		in.close();
	}
}
