package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:29 2022/3/19
 * @ Description：
 */
public class T739 {
	public static void main(String[] args) {
		int[] res = new int[]{89,62,70,58,47,47,46,76,100,70};
		new T739().dailyTemperatures(res);
	}
	public int[] dailyTemperatures(int[] temperatures) {
		int len = temperatures.length;
		int dp[] = new int[len];
		for (int i = 0; i < len-1; i++) {
			if (temperatures[i+1] - temperatures[i] > 0) {
				dp[i] = 1;
			} else {
				int j = i + 1;
				while (j<len&&temperatures[j] - temperatures[i] <= 0) {
					j++;
				}
				if (j<len&&temperatures[j] - temperatures[i] > 0) {
					dp[i] = j - i;
				}
			}
		}
		return dp;
	}
}
