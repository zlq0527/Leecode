package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:04 2022/2/19
 * @ Description：
 */
public class T220_1 {
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums.length <= 1) {
			return false;
		}
		for (int i = 0; i < nums.length ; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(Math.abs((long)nums[i] - (long)nums[j]) <= t && Math.abs(i - j) <= k)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,5,6,7,2,4};
//		System.out.println(containsNearbyAlmostDuplicate(nums, 4, 0));

		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(2, 2));
		list.add(Arrays.asList(2, 3));
		list.add(Arrays.asList(1, 4));
		System.out.println(list.get(0).get(1));
		System.out.println(list.get(1).get(1));
		System.out.println(list.get(2).get(1));
	}

}
