package Leecode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T3 {
	public static void main(String[] args) {
		String s1 = "pwwkew";
		System.out.println(new T3().lengthOfLongestSubstring(s1));

	}

	public int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		int max = 0;
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < chars.length; i++) {
			while (queue.contains(chars[i])) {
				queue.poll();
			}
			queue.add(chars[i]);

			max = Math.max(max, queue.size());
		}
		return max;
	}
}
