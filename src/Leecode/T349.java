package Leecode;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:13 2022/5/5
 * @ Description：
 */
public class T349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i : nums1) {
			set.add(i);
		}
		for (int i : nums2) {
			if (set.contains(i)) {
				set2.add(i);
			}
		}
		int k = 0;
		int[] res = new int[set2.size()];
		for (int i : set2) {
			res[k++] = i;
		}
		return res;
	}
}
