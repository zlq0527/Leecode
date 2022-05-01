package Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:38 2022/4/10
 * @ Description：
 */
public class of_59 {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
		System.out.println(maxSlidingWindow(nums, 3));
	}
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int l = 0;
		int r = l+k-1;
		List<Integer> list = new ArrayList<>();
		int k1 = k;
		while (l <= r) {
			if (r - l < k-1) {
				r++;
			}
//			int max = 0;
			int max = nums[l];
			while (k1 != 0) {
				int temp = nums[l + k1-1];
				max = Math.max(temp, max);
				k1--;
			}
			k1 = k;
			list.add(max);
			if (r < nums.length - 1) {
				r++;
				l++;
			} else {
				break;
			}
		}
		System.out.println(list);
		int[] res = new int[list.size()];
		int i1=0;
		for (int i : list) {
			res[i1++] = i;
		}
		return res;
	}
}
