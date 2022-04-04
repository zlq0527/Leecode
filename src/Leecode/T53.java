package Leecode;

import java.lang.reflect.Method;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:47 2022/3/18
 * @ Description：
 */
public class T53 {

	public static void main(String[] args) {
		int[] num = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new T53().maxSubArray(num));
	}
	public int maxSubArray(int[] nums) {
		int res = nums[0];
		int dp=0;
		for (int i : nums) {
			dp = Math.max(dp + i, i);
			res = Math.max(res, dp);
		}
		return res;
	}
}
