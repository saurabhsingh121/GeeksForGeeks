package com.base2ToBase10Conversion;

import java.util.Scanner;

public class Base2ToBase10Conversion {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int testCases = in.nextInt();
	for(int i = 0; i < testCases; i++){
		int base2No = in.nextInt();
		int length = Integer.toString(base2No).length();
		int[] digitArray = new int[length];
		for(int j = 0, p = (length -1); j < length; j++, p--){
			digitArray[j] = (int) (base2No / Math.pow(10, p));
			int remiander = (int) (base2No % Math.pow(10, p));
			base2No = remiander;
		}
		int decimalNo = 0;
        for (int j = 0, p = (length-1); j < length; j++,p--) {
        	int temp = (int) (digitArray[j] * Math.pow(2, p));
        	decimalNo += temp;
		}
        System.out.println(decimalNo);
	}
}
}
