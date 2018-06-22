package com.leapYear;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i = 0; i < testCases; i++){
			int year = in.nextInt();
				if( year >= 0 && year < 100){
					if(year%4 == 0)
						System.out.println("YES");
					else
						System.out.println("NO");
				}else if(year%100 == 0){
					if(year%400 != 0)
						System.out.println("NO");
					else
						System.out.println("YES");
				}
				else{
					if(year%4 != 0)
						System.out.println("NO");
					else
						System.out.println("YES");
				}
		}
	}
}
