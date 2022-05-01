package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:55 2022/2/15
 * @ Description：
 */
public class T5_1 {
	public static String longestPalindrome(String s) {
		char[] s1 = s.toCharArray();
		int maxlength = 0;
		int max = 0;
		int min = 0;
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = i; j < s.length(); j++) {
				if (s1[i] == s1[j]) {
					if (j - i <= 1) {
						dp[i][j] = true;
					} else if (dp[i + 1][j - 1]) {
						dp[i][j] = true;
					}
				}
				if (dp[i][j] && j - i + 1 > maxlength) {
					maxlength = j - i + 1;
					min = i;
					max = j;
				}
			}
		}
		return s.substring(min, max + 1);
	}

	public static void main(String[] args) {
		String s = "cbbd";
		System.out.println(longestPalindrome(s));
	}
}
