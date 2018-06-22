package com.factorial;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			int n = in.nextInt();
			if(n == 1 && n == 0){
				System.out.println(1);
			}else{
				long result = 1;
				while(n > 0){
					System.out.println("n-- "+ n);
					result *= n;
					System.out.println("result-- "+ result);
					//System.out.println(result);
					n--;
				}
				System.out.println(result);
			}
			
		}
	}
}
