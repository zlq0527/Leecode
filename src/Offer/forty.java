package Offer;

import java.util.Arrays;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 17:04 2022/2/13
 * @ Description：剑指offer40
 */
public class forty {
	public static void main(String[] args) {
		int[] arr = new int[]{0, 1, 6, 5, 3, 6};
		int k = 5;
		System.out.println(getLeastNumbers(arr, k));
	}

	public static int[] getLeastNumbers(int[] arr, int k) {
		Arrays.sort(arr);
		return Arrays.copyOfRange(arr, 0, k);

	}

}
