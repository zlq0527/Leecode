package Leecode;

import java.util.Arrays;

public class T567 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bbbca";
//        new T567().checkInclusion(s1, s2);
//        new T567().checkInclusion2(s1,s2);
		String a1 = "ab";
		String a2 = "a";
		new T567().testequals(a1, a2);
	}

	public void testequals(String s1, String s2) {
		int[] a = new int[26];
		int[] b = new int[26];
		char[] ans1 = s1.toCharArray();
		char[] ans2 = s2.toCharArray();
		int len1 = s1.length();
		int len2 = s2.length();
		if (s1.length() > s2.length()) {
			System.out.println("已经错了");
			return;
		}


		for (int i = 0; i < len1; i++) {
			++a[ans1[i] - 'a'];
			++b[ans2[i] - 'a'];
		}
		if (Arrays.equals(a, b)) {
			System.out.println("怼了");
			return;
		}

		for (int i = len1; i < len2; i++) {
			++b[ans2[i] - 'a'];
			--b[ans2[i - len1] - 'a'];
			if (Arrays.equals(a, b)) {
				System.out.println("已经对了");
				return;
			}
		}
		System.out.println("错得离谱!");


	}

	public boolean checkInclusion(String s1, String s2) {
		char[] chars = s1.toCharArray();
		char[] chars1 = s2.toCharArray();
		int sum = 0;
		for (int a : chars) {
			sum += a;
		}
		int length = chars.length;
		return false;
//        return s2.contains(s1) || s2.contains(new StringBuilder(s1).reverse());
	}

	public boolean checkInclusion2(String s1, String s2) {
		int n = s1.length(), m = s2.length();
		if (n > m) {
			return false;
		}
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		for (int i = 0; i < n; ++i) {
			++cnt1[s1.charAt(i) - 'a'];
			++cnt2[s2.charAt(i) - 'a'];
		}
		if (Arrays.equals(cnt1, cnt2)) {
			return true;
		}
		for (int i = n; i < m; ++i) {
			++cnt2[s2.charAt(i) - 'a'];
			--cnt2[s2.charAt(i - n) - 'a'];
			if (Arrays.equals(cnt1, cnt2)) {
				return true;
			}
		}
		return false;
	}
}
