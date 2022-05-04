package Leecode;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:34 2022/5/4
 * @ Description：
 */
public class o496 {
	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 3, 5, 2, 4};
		int[] nums2 = new int[]{6, 5, 4, 3, 2, 1, 7};
		new o496().nextGreaterElement(nums1, nums2);
	}

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j < m && nums1[i] != nums2[j]) j++;
			while (j < m && nums1[i] >= nums2[j]) j++;
			res[i] = j < m ? nums2[j] : -1;
		}
		return res;
	}
}
