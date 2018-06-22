package com.palindorme;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		System.out.println(testCases);
		for(int i = 0; i < testCases; i++){
			String str = in.nextLine();
			System.out.println(str);
			char[] ch = str.toCharArray();
			int length = ch.length;
			//boolean isPalindrome = true;
			for(int j = 0,k = (length-1); j < length/2; j++, k--){
				System.out.println(ch[j]);
				System.out.println(ch[k]);
				//if(ch[k] != ch[j])
					//isPalindrome = false;
				//break;
			}
			//System.out.println((!isPalindrome)? "No" : "Yes");
			//System.out.println(isPalindrome);
		}
	}
}
