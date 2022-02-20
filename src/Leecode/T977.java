package Leecode;

import java.util.Arrays;

public class T977 {
	public static void main(String[] args) {
		int[] nums = new int[]{-4, -1, 0, 3, 10};
//        System.out.println(sortedSquares(nums));
		int[] a = sortedSquares(nums);
		for (int a1 : a) {
			System.out.println(a1);
		}
	}


	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}
