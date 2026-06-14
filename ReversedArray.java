package com.arrays;

public class ReversedArray {

	public static void main(String args[]) {
		int arr[] = {7,8,9,10,11,12};
		int n = arr.length;
		
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
	}
}
