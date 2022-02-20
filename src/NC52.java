import java.util.Scanner;
import java.util.Stack;

/**
 * 括号匹配
 */
public class NC52 {

	public boolean isValid(String s) {
		// write code here
		Stack<Character> stack = new Stack<>();
		if (s.length() < 2 || s.startsWith("}") || s.startsWith("]") || s.startsWith(")")) {
			return false;
		}
		for (Character ch : s.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			} else if (stack.isEmpty()) {
				return false;
			} else {
				Character target = stack.pop();
				if (!(ch == '}' && target == '{' || ch == ']' && target == '[' || ch == ')' && target == '(')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(new NC52().isValid("[]"));
	}
}
