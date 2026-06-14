package com.arrays;

public class CheckedArraySorted {

	public static void main(String args[]) {
		int arr[] = {1,4,3,4,5,6};
		boolean flag = true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag = false;
			}
		}
		
		System.out.println(flag);
	}
}
