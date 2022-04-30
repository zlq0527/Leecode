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
		int k = nums.length - 1;
		int i = 0;
		int j = nums.length - 1;
		int[] result = new int[nums.length];
		while (i <= j) {
			if (nums[i] * nums[i] < nums[j] * nums[j]) {
				result[k--] = nums[j] * nums[j];
				j--;
			} else {
				result[k--] = nums[i] * nums[i];
				i++;
			}
		}
		return nums;

	}
}
