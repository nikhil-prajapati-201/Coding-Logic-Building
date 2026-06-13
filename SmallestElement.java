package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestElement {

	public static void main(String args[]) {

		int nums[] = {2,8,6,15,32,45,3,8};

		PriorityQueue<Integer> dq= new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<nums.length;i++) {
			dq.add(nums[i]);
			
			if(dq.size()==2) {
				dq.poll();
			}
		}
		
		System.out.println(dq.peek());
		
	
	}
}
