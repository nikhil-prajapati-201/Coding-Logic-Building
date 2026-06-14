package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindSecondSmallestElement {  //Second Smallest Element from array

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		PriorityQueue<Integer> dq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			dq.add(arr[i]);
			
			if(dq.size()==3) {
				dq.poll();
			}
		}
		
		System.out.println(dq.poll());
	}
}
