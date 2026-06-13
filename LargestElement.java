package com.arrays;

import java.util.PriorityQueue;

public class LargestElement { 		//Find Largest Element from Arrays

	public static void main(String args[]) {
		int nums[] = {2,8,6,15,32,45,1,3,8};

		PriorityQueue<Integer> dq= new PriorityQueue<>();
		
		for(int i=0;i<nums.length;i++) {
			dq.add(nums[i]);
			
			if(dq.size()==2) {
				dq.poll();
			}
		}
		
		System.out.println(dq.peek());
		
	}
}
