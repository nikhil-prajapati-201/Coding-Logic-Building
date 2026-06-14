package com.arrays;

import java.util.PriorityQueue;

public class FindSecondLargestElement {

	public static void main(String args[]) {
		int arr[] = {4,21,7,83,14,75,96,2};
		
		PriorityQueue<Integer> dq = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			dq.add(arr[i]);
			
			if(dq.size()==3) {
				dq.poll();
			}
		}
		
		System.out.println(dq.peek());
	}
}
