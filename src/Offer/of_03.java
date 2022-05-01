package Offer;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:39 2022/2/25
 * @ Description：
 */
public class of_03 {
	public static void main(String[] args) {
		int nums[] = new int[]{2, 3, 1, 0, 2, 5, 3};
		System.out.println(findRepeatNumber(nums));
	}
	public static int findRepeatNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				return nums[i];
			}
		}
		return 0;
	}
}
