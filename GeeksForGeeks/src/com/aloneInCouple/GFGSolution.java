package com.aloneInCouple;

import java.util.Scanner;

public class GFGSolution {
	
	public static void main(String[] args) {
		//Scanner object
		Scanner in = new Scanner(System.in);
		//number of testCases
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			//length of the array
			int len = in.nextInt();
			int res=0;
			for (int j = 0; j < len; j++) {
				int num = in.nextInt();
				if(j==0)
					res = num;
				else
					res ^= num; //using bitwise XOR operator, finally all couple member will be zero
				//like 2- 10(10 ^ 10 = 00) so at last alone member will remain
			}
			System.out.println("Alone member is..."+ res);
		}
		in.close();
	}
}
