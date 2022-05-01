package Leecode;

import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:08 2022/3/17
 * @ Description：
 */
public class T45 {
	public static void main(String[] args) {
		int[] nums = new int[]{2,2,1,4,1,4};
		System.out.println(jump(nums));
	}
	public static int jump(int[] nums) {
		int temp = 0;
		int k=0;
		int end=0;
		for (int i = 0; i < nums.length; i++) {
			k = Math.max(i + nums[i], k);
			if (k >= nums.length - 1) {
				return temp+1;
			}
			if (end == i) {
				temp ++;
				end=k;
			}
		}
		return temp;
	}
}
