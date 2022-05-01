package Leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:10 2022/3/8
 * @ Description：
 */
public class T169 {
	public static void main(String[] args) {
		int nums[] = new int[]{2, 2, 1, 1, 1, 2, 2};
		System.out.println(new T169().majorityElement(nums));
	}

	public int majorityElement(int[] nums) {
		int len = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			if (map.get(nums[i]) > len / 2) {
				return nums[i];
			}
		}
		return 0;
	}
}
