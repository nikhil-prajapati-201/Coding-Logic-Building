package com.arrays;

public class AverageOfElement {

	public static void main(String args[]) {
		int nums[]= {4,7,5,62,89,154,210,34,245,625,10};
		int n = nums.length;
		
		double sum = 0;
		for(int i:nums) {
			sum+=i;
		}
		
		System.out.println(sum/n);
	}
}
