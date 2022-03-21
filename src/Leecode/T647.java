package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:21 2022/2/15
 * @ Description：
 */
public class T647 {
	public static void main(String[] args) {
		System.out.println(countSubstrings("abcba"));
	}

	public static int countSubstrings(String s) {
		int n = s.length();
		char[] letters = s.toCharArray();
		int ans = n;
		for (int k = 0; k < n; k++) {
			// 以letters[k]为中心向两边扩
			int i = k - 1, j = k + 1;
			while (i >= 0 && j < n && letters[i--] == letters[j++]) {
				ans++;
			}
			// 以letters[k]右侧的空白位置为中心向两边扩
			i = k;
			j = k + 1;
			while (i >= 0 && j < n && letters[i--] == letters[j++]) {
				ans++;
			}
		}
		return ans;
	}
}
