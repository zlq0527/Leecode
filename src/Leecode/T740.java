package Leecode;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:51 2022/3/16
 * @ Description：
 */
public class T740 {
	public static void main(String[] args) {
		int[] nums = new int[]{3,4,2};
		System.out.println(deleteAndEarn(nums));
	}
	public static int deleteAndEarn(int[] nums) {
		int[] temp = new int[10001];
		int[] dp = new int[10001];
		for (int i = 0; i < nums.length; i++) {
			temp[nums[i]]+=nums[i];
		}
		dp[0]=0;
		dp[1] = temp[1];
		for (int i = 2; i < temp.length; i++) {
			dp[i] = Math.max(temp[i] + dp[i - 2], dp[i - 1]);
		}
		return dp[dp.length-1];
	}
}
