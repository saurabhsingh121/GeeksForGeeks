package com.factorial;

import java.util.Scanner;

public class UsingRecursion {

	public static void main(String[] args) {
		//Getting the input
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Factorial of given number "+num + " is " +factorial(num));
		
	}
	public static long factorial(int n) {
		if(n ==0 || n ==1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
}
