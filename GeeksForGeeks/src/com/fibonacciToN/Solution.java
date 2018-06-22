package com.fibonacciToN;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i = 0; i < testCases; i++){
			int intNumber = in.nextInt();
			System.out.print(0+ " ");
			System.out.print(1+ " ");
			long temp = 1;
			long result = 0;
			long series = 0;
			while(series <= intNumber){
				series = temp + result;
				if(series > intNumber){
					break;
				}
				System.out.print(series+ " ");
				result = temp;
				temp = series;
			}
				
			}
		
	}
}
