package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:21 2022/3/7
 * @ Description：x的平方根
 * 用二分法
 */
public class T69 {
	public static void main(String[] args) {
		System.out.println(new T69().mySqrt(8));
	}

	public int mySqrt(int x) {
		int res = 0;
		int l = 0, r = x;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if ((long) mid * mid <= x) {
				res = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return res;
	}
}
