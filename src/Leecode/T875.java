package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:16 2022/3/29
 * @ Description：
 */
public class T875 {
	public static void main(String[] args) {
		int[] piles = new int[]{30, 11, 23, 4, 20};
		System.out.println(minEatingSpeed(piles, 6));
	}

	public static int minEatingSpeed(int[] piles, int h) {
		int max = 0;
		for (int i : piles) {
			max = Math.max(max, i);
		}
		int min = 1;
		while (min < max) {
			int mid = min + (max - min) / 2;
			if (calu(piles, mid) > h) {
				min = mid + 1;
			} else {
				max = mid;
			}
		}
		return min;
	}

	private static int calu(int[] piles, int mid) {
		int sum = 0;
		for (int i : piles) {
			sum += (i+mid-1)/mid;
		}
		return sum;
	}
}
