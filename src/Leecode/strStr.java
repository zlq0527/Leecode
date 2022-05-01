package Leecode;

import java.util.Objects;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:45 2022/1/8
 * @ Description：实现 strStr() 函数。
 * <p>
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnr003/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class strStr {
	public static void main(String[] args) {
		String s1 = "e";
		String s2 = "e";
		System.out.println(new strStr().strStr(s1, s2));
	}

	public int strStr(String haystack, String needle) {
		if (needle.equals("")) return 0;
		int j = 0, i = 0;
		while (i < haystack.length() && j < needle.length()) {
			if (haystack.charAt(i) != needle.charAt(j)) {
				i = i - j + 1;
				j = 0;
			} else {
				i++;
				j++;
			}
		}
		if (j == needle.length())
			return i - j;
		return -1;
	}
}
