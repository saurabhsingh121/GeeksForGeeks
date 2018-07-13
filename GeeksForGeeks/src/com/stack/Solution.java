package com.stack;

import java.util.Scanner;
import java.util.Stack;

/*Java provides an inbuilt object type called Stack. It is a collection that is based on the last in first out (LIFO) principle. On Creation, a stack is empty. Try this problem using Stack. 

Given n elements of a stack , delete the middle element of the stack without using any additional data structure.

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a integer n. Second line consists of n spaced integers. 

Output: Print the elements of the stack after deleting the middle element.*/
public class Solution {

	public static void main(String[] args) {
		//create scanner object
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i < testCases; i++) {
			//taking the length of the stack
			int len = scan.nextInt();
			//finding the mid number
			//minus 1 because index start from 0
			int midNum = ((len+1)/2)-1;
			
			Stack<Integer> stack = new Stack<Integer>();
			//adding number to the stack
			for(int j = 0; j < len; j++) {
					stack.push(scan.nextInt());
			}
			
			//removing the mid index number-> this method will resize the stack
			stack.removeElementAt(midNum);
			
			//printing the stack(LIFO)
			for(int j = stack.size()-1; j >= 0; j--) {
				System.out.print(stack.get(j)+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
