package Leecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:26 2022/3/27
 * @ Description：
 */
public class T5268 {
	public static void main(String[] args) {

		int[] nums1 = new int[]{1, 2, 3, 3};
		int[] nums2 = new int[]{1, 1, 2, 2};
		System.out.println(new T5268().findDifference(nums1, nums2));
	}

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			set2.add(nums2[i]);
		}
		for (Object k : set.toArray()) {
			if (!set2.contains(k)) {
				list1.add((Integer) k);
			}
		}
		list.add(new ArrayList<>(list1));
		list1.clear();
		for (Object k : set2.toArray()) {
			if (!set.contains(k)) {
				list1.add((Integer) k);
			}
		}
		list.add(new ArrayList<>(list1));
		return list;
	}
}
