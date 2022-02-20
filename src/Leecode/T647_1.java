package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 19:22 2022/2/15
 * @ Description：
 */
public class T647_1 {
	public static int countSubstrings(String s) {
		int res = 0;
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i; j <= s.length(); j++) {
				if (isPalindrome(s.substring(i, j))) {
					res++;
				}
			}
		}
		return res;

	}

	public static boolean isPalindrome(String s) {
		int len = s.length();
		if (len == 0) {
			return false;
		}
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(countSubstrings("abcba"));

	}
}
