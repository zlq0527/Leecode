package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 17:18 2022/2/13
 * @ Description：力扣
 */
public class T5 {
	public static String longestPalindrome(String s) {
		String ans = "";
		int len = s.length();
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				String test = s.substring(i, j);
				if (isPalindrome(test) && test.length() > max) {
					ans = s.substring(i, j);
					max = Math.max(max, ans.length());
				}
			}
		}
		return ans;
	}

	public static boolean isPalindrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "bbb";
		System.out.println(longestPalindrome(s1));
	}


}
