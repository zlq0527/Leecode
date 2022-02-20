package Leecode;

import java.util.Arrays;

/**
 * @ Author     ：赵棱泉. @ Date       ：Created in 21:15 2022/2/18 @ Description：
 */
public class T300 {
	public static void main(String[] args) {
		int abc[] = new int[]{0,1,0,3,2,3};
		System.out.println(lengthOfLIS(abc));
	}

	public static int lengthOfLIS(int[] nums) {
		if (nums.length == 1) return 1;
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int maxans = 0;
		for (int i = 0; i < nums.length ; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			maxans = Math.max(maxans, dp[i]);
		}
		return maxans;
	}
}
