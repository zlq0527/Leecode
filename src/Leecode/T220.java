package Leecode;

import java.util.*;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 12:46 2022/2/19
 * @ Description：
 */
public class T220 {
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		if (nums.length <= 1) {
			return false;
		}
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			list.add(Arrays.asList(nums[i],i));
		}
		for (int i = 0; i < nums.length; i++) {
			int j=nums.length-1;
			while (i < j) {
				if (Math.abs((long)nums[i] - (long)nums[j]) <= t && Math.abs(list.get(nums[i]).get(1)-list.get(nums[j]).get(1)) <= k) {
					return true;
				}else if (Math.abs(list.get(nums[i]).get(1)-list.get(nums[j]).get(1)) > k){
					i++;
				} else if (Math.abs(nums[i] - nums[j]) > t) {
					j--;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,5,9,1,5,9};
		System.out.println(containsNearbyAlmostDuplicate(nums, 2,3));
	}
}
