package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 回文2 {
	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		System.out.println(new 回文2().isPalindrome(s));
	}

	public boolean isPalindrome(String s) {
		String s1 = s.toLowerCase();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isLetterOrDigit(s1.charAt(i))) {
				res.append(s1.charAt(i));
			}
		}
		char[] chars = res.toString().toCharArray();
		int l = 0;
		int r = chars.length - 1;
		while (l < r) {
			if (chars[l++] != chars[r--]) {
				return false;
			}
		}
		return true;
	}
}
