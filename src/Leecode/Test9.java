package Leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * 输入：x = 121
 * 输出：true
 * <p>
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 */
public class Test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(test(a));
	}

	public static Boolean test(int a) {
		int sum = 0;
		if (a < 0 || (a % 10 == 0 && a / 10 != 0)) {
			return false;
		} else {
			while (a > sum) {
				sum = sum * 10 + a % 10;
				a /= 10;
			}
			if (a == sum) {
				return true;
			} else {
				if (sum / 10 == a) {
					return true;
				}
			}


		}
		return false;
	}

	public Boolean test2() {
		String a = "abcdbca";
		char res[] = a.toCharArray();
		int l = 0;
		int r = a.length() - 1;
		while (l < r) {
			if (res[l++] != res[r--]) {
				return false;
			}
		}
		return true;
	}

	public void test() {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			hashMap.put(i, 5);
		}
		for (Integer i : hashMap.keySet()) {
			System.out.println(i);
		}
		System.out.println("------------------");
		for (Map.Entry<Integer, Integer> i : hashMap.entrySet()) {
			System.out.println(i);
		}
		System.out.println("------------------");
		System.out.println(hashMap.containsKey(1));
	}
}
