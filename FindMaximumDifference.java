package com.arrays;

public class FindMaximumDifference {

	public static void main(String args[]) {
		int nums[] = new int[10];
		nums[0] = 12;
		nums[1] = 54;
		nums[2] = 26;
		nums[3] = 78;
		nums[4] = 32;
		nums[5] = 1;
		nums[6] = 24;
		nums[7] = 84;
		nums[8] = 124;
		nums[9] = 15;
		
		int diff = 0;
		
		for(int i=0;i<nums.length-1;i++) {
			
			diff = Math.max(Math.abs(diff), nums[i] - nums[i+1]);
		}
		
		System.out.println(diff);
		
		
	}
}
