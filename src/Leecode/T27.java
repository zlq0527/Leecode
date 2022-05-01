package Leecode;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:48 2022/2/21
 * @ Description：
 */
public class T27 {
	public static void main(String[] args) {
		int[] nums = new int[]{0,1,4,6,6,2,6,9};
		System.out.println(removeElement(nums, 6));
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;










//		int j=0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] !=val) {
//				nums[j] = nums[i];
//				j++;
//			}
//		}
//		return j;
	}
}
