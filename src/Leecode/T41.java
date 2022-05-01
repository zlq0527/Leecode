package Leecode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:40 2022/4/4
 * @ Description：
 */
public class T41 {
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,0};
		System.out.println(firstMissingPositive(nums));
	}
	public static int firstMissingPositive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return nums.length+1;
	}
}
