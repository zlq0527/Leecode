package Leecode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:05 2022/4/4
 * @ Description：
 */
public class T41_1 {
	public static void main(String[] args) {
		int[] nums = new int[]{3,4,-1,1};
		System.out.println(firstMissingPositive(nums));
	}
	public static int firstMissingPositive(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i]) {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				return i+1;
			}
		}
		return nums.length+1;
	}
}
