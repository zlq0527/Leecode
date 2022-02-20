package Leecode;

import java.util.Arrays;

public class T334 {
	public static void main(String[] args) {
		char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
		new T334().reverseString(s);
	}

	public void reverseString2(char[] s) {
		int n = s.length;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		System.out.println(s);
	}

	public void reverseString(char[] s) {
		char left;
		char right;
		int j = s.length - 1;
		for (int i = 0; i < s.length / 2; i++) {
			left = s[i];
			right = s[j--];
			s[i] = right;
			s[s.length - i - 1] = left;
		}
	}
}
