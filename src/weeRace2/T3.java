package weeRace2;

import sun.rmi.runtime.Log;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:29 2022/4/3
 * @ Description：
 */
public class T3 {
	public static void main(String[] args) {
		int[] candies = new int[]{4,7,5};
		System.out.println(maximumCandies(candies, 4));
	}

	public static int maximumCandies(int[] candies, long k) {
		long total = 0;
		for (int i : candies) {
			total += i;
		}
		long a = total / k;
		if (a == 0) {
			return 0;
		}
		int res = 0;
		long l = 1L, r = total;
		long mid = 0;
		while (l <= r) {
			mid = l + (r - l) / 2;
			res = 0;
			for (int i = 0; i < candies.length; i++) {
				res += ((long)candies[i] / mid);
			}
			if (res >= k) {
				a = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return (int) a;
	}
}
