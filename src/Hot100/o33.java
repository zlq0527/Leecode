package Hot100;

import java.util.Random;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:50 2022/4/17
 * @ Description：搜素旋转数组
 */
public class o33 {
	public static void main(String[] args) {
		int[] nums = new int[]{4,5,6,7,0,1,2};
		int target = 5;
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {
		int a = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				a = i;
				break;
			}
		}
		int l = 0;
		int r2 = nums.length-1;
		int res = Integer.MAX_VALUE;
		int r1 = a;
		while (l <= r1) {
			int mid = l + (r1 - l) / 2;
			if (nums[mid] > target) {
				r1 = mid - 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				res = mid;
				break;
			}
		}
		int l1 = a + 1;
		while (l1 <= r2) {
			int mid = l1 + (r2 - l1) / 2;
			if (nums[mid] > target) {
				r2 = mid - 1;
			} else if (nums[mid] < target) {
				l1 = mid + 1;
			} else {
				res = mid;
				break;
			}
		}
		return res == Integer.MAX_VALUE ? -1 : res;

	}
}
