package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:50 2022/3/29
 * @ Description：
 */
public class T2024 {
	public static void main(String[] args) {
		System.out.println(maxConsecutiveAnswers(
				"TTFTTFTT",
				1));
	}

	static int n = 0;
	static String s;
	static int k1;
	public static int maxConsecutiveAnswers(String answerKey, int k) {
		n = answerKey.length();
		s = answerKey;
		k1 = k;
		return Math.max(getchar('T'), getchar('F'));
	}

	public static int getchar(char a) {
		int T = 0;
		int left = 0;
		int right = 0;
		int res = 0;
		while (right < n) {
			if (s.charAt(right) == a) {
				T++;
			}
			while (T > k1) {
				if (s.charAt(left++) == a) {
					T--;
				}
			}
			res = Math.max(res, right - left + 1);
			right++;
		}
		return  res;
	}
}
