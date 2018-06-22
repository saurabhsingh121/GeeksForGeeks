package com.powerof2;

import java.util.Scanner;

public class PowerOf2Copy {
 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		long[] intArray = new long[testCases];
		for (int i = 0; i < testCases; i++) {
			long x = scan.nextLong();
			if(x >= 0 && x <= Math.pow(10, 18))
			intArray[i] = x;
		}
		for (int i = 0; i < testCases; i++) {
			long quotient = intArray[i];
			if (quotient == 1) {
				System.out.println("Yes: It's 0 power of 2");
			} else if(quotient == 0){
				System.out.println("NO");
			}else if (quotient % 2 == 0) {
				while (quotient > 0) {
					if (quotient % 2 != 0) {
						System.out.println("No: It's not power of 2");
						break;
					}
					if (quotient == 2) {
						System.out.println("Yes");
						break;

					}
					quotient = quotient / 2;
				}
			} else {
				System.out.println("No: This is odd number");
			}
		}
	}
}
