package wangyi;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:22 2022/3/27
 * @ Description：
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] chars = str.toCharArray();
		int res = 0;
		int[] dp = new int[str.length()];
		dp[0] = 0;
		//aabb-6    abb-4 bbc-5
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == chars[i + 1] || Math.abs(chars[i] - chars[i + 1]) == 1) {
				res += chars[i] - 'a' + 1;
				res += chars[i + 1] - 'a' + 1;
			}
		}
//		for (int i = 0; i < chars.length-1; i++) {
//			if (chars[i] == chars[i + 1] || Math.abs(chars[i] - chars[i + 1]) == 1) {
//				dp[i + 1] = Math.max(dp[i], chars[i] - 'a' + 1 + chars[i + 1] - 'a' + 1);
//			} else {
//				dp[i + 1] = dp[i];
//			}
//		}
		res = dp[dp.length - 1] + dp[dp.length - 2];
		System.out.println(res);

	}
}
