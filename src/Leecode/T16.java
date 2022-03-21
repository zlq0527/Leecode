package Leecode;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:02 2022/2/18
 * @ Description：
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * 返回这三个数的和。
 * 假定每组输入只存在恰好一个解。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T16 {
	public static void main(String[] args) {
		int a[] = new int[]{-1, 0, 1, 1, 55};
		System.out.println(threeSumClosest(a, 3));
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int res = 10000000;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == target) {
					return sum;
				}
				if (Math.abs(sum - target) < Math.abs(res - target)) {
					res = sum;
				}
				if (sum < target) {
					int j0 = j + 1;
					while (j0 < k && nums[j0] == nums[j]) {
						++j0;
					}
					j = j0;
				} else {
					int k0 = k - 1;
					while (j < k0 && nums[k0] == nums[k]) {
						--k0;
					}
					k = k0;
				}
			}
		}
		return res;
	}


//	public static int threeSumClosest(int[] nums, int target) {
//		Arrays.sort(nums);
//		int res = 10000000;
//		for (int i = 0; i < nums.length - 2; i++) {
//			int j = i + 1;
//			int k = nums.length - 1;
//			if (i > 0 && nums[i] == nums[i - 1]) continue;
//			while (j < k) {
//				int sum = nums[i] + nums[j] + nums[k];
//				if (sum == target) {
//					return sum;
//				}
//				if (Math.abs(sum - target) < Math.abs(res - target)) {
//					res = sum;
//				}
//				if (sum < target) {
//					j++;
//				} else {
//					k--;
//				}
//			}
//		}
//		return res;
//	}

}
