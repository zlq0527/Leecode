package Offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:10 2022/2/25
 * @ Description：
 */
public class of_10 {
	public static void main(String[] args) {
		System.out.println(fib(100));
	}
	public static int fib(int n) {
		if (n < 2) {
			return n;
		}
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= dp.length-1; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
		}
		return dp[n];
	}
}
