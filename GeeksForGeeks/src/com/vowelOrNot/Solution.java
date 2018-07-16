package com.vowelOrNot;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		//Scanner object for input
		Scanner in = new Scanner(System.in);
		//Number of testCases
		int t = in.nextInt();
		//making an array of vowels
		String[] vowels = {"a", "e", "i", "o","u"};
		//converting it into a list so that directly check the input with contains() method
		List<String> list = Arrays.asList(vowels);
		for (int i = 0; i < t; i++) {
			String c = in.next();
			if(list.contains(c.toLowerCase()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
