
//Algorithm : reverse first k elements , reverse last n- k elements , reverse full array, 

/*
reverse(nums , 0 , k - 1);
reverse(nums , k , nums.length - 1);
reverse(nums, 0 ,nums.length - 1);
*/

package com.kaur.harmandeep;

public class RotateArrayLeft {

	public static void main(String[] args) {
		// int [] nums = {1,2,3,4};
		// int [] nums = {1,2,3,4,5,6,7};
		int[] nums = new int[]{ -1, -100, 3, 99 };
		int k = 2;
		rotate(nums, k);
		for(int n : nums){
			System.out.println(n);
		}
	}

	public static void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
