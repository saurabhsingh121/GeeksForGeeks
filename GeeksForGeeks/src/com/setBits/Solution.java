package com.setBits;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int testCases = in.nextInt();
	for (int i = 0; i < testCases; i++) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int count = 0;
		int remainder= 0;
		int n = in.nextInt();
		while (n > 0) {
			 remainder = n%2;
			 list.addFirst(remainder);
			 n = n/2;
		} 
		for (Integer integer : list) {
			if(integer == 1)
				count++;
		}
		System.out.println(count);
	}
}
}
