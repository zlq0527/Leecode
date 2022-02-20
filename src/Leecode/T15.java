package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15 {
	public static void main(String[] args) {
		int[] nums = new int[]{0, 0, 0, 0};
		int[] nums1 = new int[]{-1, 0};
		System.out.println(new T15().threeSum(nums));
	}

		public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0) break;
			int j = i + 1, k = nums.length - 1;
			if(i>0&&nums[i]==nums[i-1]) continue;

			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum > 0) k--;
				else if (sum < 0) j++;
				else {
					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					while (j < k && nums[j] == nums[++j]) ;
					while (j < k && nums[k] == nums[--k]) ;
				}
			}
		}
		return list;
	}


//	public List<List<Integer>> threeSum(int[] nums) {
//		List<List<Integer>> list = new ArrayList<>();
//		Arrays.sort(nums);
//		for (int k = 0; k < nums.length - 2; k++) {
//			if (nums[k] > 0) break;
//			if (k > 0 && nums[k] == nums[k - 1]) continue;
//			int i = k + 1, j = nums.length - 1;
//			while (j > i) {
//				int sum = nums[i] + nums[k] + nums[j];
//				if (sum < 0) {
//					while (i < j && nums[i] == nums[++i]) ;
//				} else if (sum > 0) {
//					while (i < j && nums[j] == nums[--j]) ;
//				} else {
//					list.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
//					while (i < j && nums[i] == nums[++i]) ;
//					while (i < j && nums[j] == nums[--j]) ;
//				}
//			}
//		}
//		return list;
//	}
}
