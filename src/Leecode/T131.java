package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:38 2022/3/2
 * @ Description：分割回文串 T131
 * https://leetcode-cn.com/problems/palindrome-partitioning/
 */
public class T131 {
	public static void main(String[] args) {
		new T131().partition("baa");
	}
	List<List<String>> list = new ArrayList<>();
	List<String> list1 = new ArrayList<>();
	public List<List<String>> partition(String s) {
		backtrace(s, 0);
		System.out.println(list);
		return list;
	}

	public void backtrace(String s, int index) {
		if (index >= s.length()) {
			list.add(new ArrayList<>(list1));
			return;
		}
		for (int j = index; j < s.length(); j++) {
			if (isPalindrome(s, index, j)) {
				String str = s.substring(index, j + 1);
				list1.add(str);
			} else {
				continue;
			}
			backtrace(s, j + 1);
			list1.remove(list1.size() - 1);
		}
	}

	private boolean isPalindrome(String s, int startIndex, int end) {
		for (int i = startIndex, j = end; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
