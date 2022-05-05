package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:22 2022/5/5
 * @ Description：哈希表,用数组记录字符串每个字符出现的次数.
 */
public class t242 {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] res = new int[26];
		for (char c : s.toCharArray()) {
			res[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			res[c - 'a']--;
			if (res[c - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
