package Leecode;
import java.util.Stack;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:11 2022/3/7
 * @ Description：
 */
public class T504 {
	public static void main(String[] args) {
		System.out.println(new T504().convertToBase7(-7));
	}
	public String convertToBase7(int num) {
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean flag=num<0;
		if (num == 0) {
			return "0";
		}
		if (num < 0) {
			num = Math.abs(num);
			sb.append("-");
			flag=true;
		}
		while (num != 0) {
			int a=num%7;
			num/=7;
			stack.push(a);
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();

	}
}
