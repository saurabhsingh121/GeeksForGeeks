package com.powerof2;

import java.util.LinkedList;
import java.util.Scanner;

public class Base10ToBase2Conversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
        int n = in.nextInt();
        int remainder = 0;
        while(n > 0){
        	remainder = n%2;
        	list.addFirst(remainder);
        	n = n/2;
        }
        long bitwiseNo = 0;
        for (int i = 0, p = (list.size()-1); i < (list.size()); i++,p--) {
        	long temp = (long) (list.get(i) * Math.pow(10, p));
        	bitwiseNo += temp;
		}
        System.out.println(bitwiseNo);
        System.out.println(list);
	}
}
