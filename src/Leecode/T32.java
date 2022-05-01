package Leecode;

import java.util.Stack;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:25 2022/3/7
 * @ Description：
 */
public class T32 {
	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {
		System.out.println(new T32().longestValidParentheses("()(())"));
	}

	public int longestValidParentheses(String s) {
		if (s.equals("") || s.length() < 2) {
			return 0;
		}
		if (s.length() == 2 && s.charAt(0) == ')') {
			return 0;
		}
		int res = 0;

		return res;
	}
}
