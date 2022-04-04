package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:00 2022/3/15
 * @ Description：
 */
public class T746 {
	public static void main(String[] args) {
		int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost) {
		if (cost.length == 2) {
			return Math.min(cost[0], cost[1]);
		}
		int[] dp = new int[cost.length + 1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i <= cost.length; i++) {
			dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
		}
		return dp[cost.length];
	}
}
