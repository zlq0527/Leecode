package Leecode;

import java.util.*;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:30 2022/3/3
 * @ Description：
 */
public class T374 {
	public static void main(String[] args) {
		int[] res = new int[]{1};
		int k=3;
		new T374().topKFrequent(res, k);
	}

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else map.put(nums[i], map.get(nums[i]) + 1);
		}
		int len = map.size();
		int[] temp = new int[len];
		int l = 0;
		for (Integer i : map.values()) {
			temp[l++] = i;
		}
		Arrays.sort(temp);
		int target = temp[temp.length - k];
		int[] res = new int[k];
		int i = 0;
		for (Integer tem : map.keySet()) {
			if (map.get(tem) >= target) {
				res[i] = tem;
				i++;
			}
		}
		for (int j = 0; j < res.length; j++) {
			System.out.println(res[j]);
		}
		return res;
	}
}
