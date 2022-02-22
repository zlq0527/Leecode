package Leecode;

import java.util.Arrays;

public class T34 {
	public static void main(String[] args) {
		int[] num = new int[]{1,1,3,3,6,6,6,6,6,8};
		searchRange(num, 6);
	}

	public static int[] searchRange(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		if (r == -1) {
			return new int[]{-1, -1};
		}
		while (l < r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] < target) {
				l = mid + 1;
			} else if (nums[mid] > target) {
				r = mid - 1;
			} else {
				r=mid;
			}
		}
		int res = 0;
		int t = nums[l] == target ? l : l + 1;
		while (t < nums.length && nums[t] == target) {
			res++;
			t++;
		}
		if (l > l + res - 1) {
			System.out.println("error");
		}else {
			System.out.println(l);
			System.out.println(l + res - 1);
		}

		return new int[]{0, 0};

	}
}
