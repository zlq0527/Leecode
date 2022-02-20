package Leecode;

import java.util.Stack;

public class T557 {
	public static void main(String[] args) {
		String s1 = "I love u";
		System.out.println(new T557().reverseWords(s1));
	}

	public String reverseWords(String s) {
		char[] chars = s.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < chars.length; i++) {
			while (chars[i] != ' ') {
				stack.push(chars[i]);
				++i;
				if (i > chars.length - 1) break;
			}
			while (!stack.isEmpty()) {
				stringBuilder.append(stack.pop());
				if (stack.isEmpty()) {
//                    stringBuilder.reverse();
					if (stringBuilder.length() == s.length())
						break;
					stringBuilder.append(' ');
				}
			}
		}
		return stringBuilder.toString();
//        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(chars.length);
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i]!=' '){
//                stringBuilder.append(chars[i]);
//            }
//        }
//        System.out.println(stringBuilder);
//
//        return "";

	}
}
