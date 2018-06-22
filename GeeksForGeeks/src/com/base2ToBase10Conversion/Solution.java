package com.base2ToBase10Conversion;

public class Solution {
 public static void main(String[] args) {
	 int base2No = 10001000;
		//System.out.println(base2No);
		int length = Integer.toString(base2No).length();
		int[] digitArray = new int[length];
	 for(int j = 0, p = (length -1); j < length; j++, p--){
			digitArray[j] = (int) (base2No / Math.pow(10, p));
			System.out.println(digitArray[j]);
			int remiander = (int) (base2No % Math.pow(10, p));
			base2No = remiander;
		}
}
}
