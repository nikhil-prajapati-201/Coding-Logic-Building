package com.arrays;

public class FindSumOfArr {

	public static void main(String args[]) {
		int arr[] = {4,8,14,65,25,4};
		int sum = 0;
		
		for(int n:arr) {
			sum+=n;
		}
		System.out.println(sum);
	}
}
