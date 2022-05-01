package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:53 2022/4/5
 * @ Description：
 */
public class T762 {
	public static void main(String[] args) {
		System.out.println(countPrimeSetBits(10, 15));
	}

	public static int countPrimeSetBits(int left, int right) {
		int cnt = 0;
		for (int i = left; i <= right; i++) {
			if (isPrime(Integer.bitCount(i))) {
				cnt++;
			}
		}
		return  cnt;

	}
	private static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		}
		for (int i = 2; i * i <= x; ++i) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
