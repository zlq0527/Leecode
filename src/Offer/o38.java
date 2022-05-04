package Offer;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:05 2022/5/4
 * @ Description：
 */
public class o38 {
	public static void main(String[] args) {
		int[] nums = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
		new o38().dailyTemperatures(nums);
	}

	public int[] dailyTemperatures(int[] temperatures) {
		int len = temperatures.length;
		Stack<Integer> stack = new Stack<>();
		int[] res = new int[len];
		Arrays.fill(res, 0);
		stack.push(0);
		for (int i = 1; i < len; i++) {
			if (temperatures[i] <= temperatures[stack.peek()]) {
				stack.push(i);
			}else {
				while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]) {
					res[stack.peek()] = i - stack.peek();
					stack.pop();
				}
				stack.push(i);
			}
		}
		return res;
	}
}
