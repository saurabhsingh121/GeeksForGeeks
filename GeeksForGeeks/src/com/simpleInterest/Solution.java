package com.simpleInterest;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//Scanner object for taking input
		Scanner in = new Scanner(System.in);
		//no of test Cases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			//entering principle amount
			int p = in.nextInt();
			//entering time in years
			int tm = in.nextInt();
			//entering rate in percentage
			int r = in.nextInt();
			System.out.println((p*r*tm)/100);
		}
		in.close();
	}
}
