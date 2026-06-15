package com.arrays;

public class CountEvenOddInArray {

	public static void main(String args[]) {
		int arr[] = {41,6,7,84,15};
		int even = 0;
		int odd = 0;
		
		for(int n:arr) {
			if(n%2==0) {
				even++;
			}else
				odd++;
		}
		System.out.println("Enev: "+even+"\n"+"Odd: "+odd);
	}
}
