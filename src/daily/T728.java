package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 17:35 2022/3/31
 * @ Description：
 */
public class T728 {
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
	}
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (check(i)) {
				list.add(i);
			}
		}
		return list;
	}

	private static boolean check(int i) {
		int a1 = i % 10;
		int b = i;
		while (i != 0) {
			int a = i % 10;
			if (a == 0) {
				return false;
			}
			if (b % a != 0) {
				return false;
			}
			i /= 10;
		}
		return true;
	}
}
