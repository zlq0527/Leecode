package Leecode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:25 2022/5/5
 * @ Description：快乐数
 */
public class T202 {
	public static void main(String[] args) {
		System.out.println(new T202().isHappy(2));
	}
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (true) {
			int sum = getsum(n);
			if (set.contains(sum)) {
				return false;
			}else {
				set.add(sum);
			}
			if (sum == 1) {
				return true;
			}
			n = sum;
		}
	}

	public int getsum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}
		return sum;
	}
}
