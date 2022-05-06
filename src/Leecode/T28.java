package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:39 2022/5/6
 * @ Description：字符串搜索普通方法
 * 实现strStr()函数
 */
public class T28 {
	public static void main(String[] args) {
		System.out.println(new T28().strStr("a", "a"));
	}
	public int strStr(String haystack, String needle) {
		int n = haystack.length() - needle.length();
		char[] chars = haystack.toCharArray();
		char[] chars1 = needle.toCharArray();
		for (int i = 0; i <= n; i++) {
			int a = i, b = 0;
			while (b < needle.length() && chars[a] == chars1[b]) {
				a++;
				b++;
			}
			if (b==needle.length()) {
				return i;
			}
		}
		return  -1;
	}
}
