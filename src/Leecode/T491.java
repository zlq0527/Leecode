package Leecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:23 2022/3/1
 * @ Description：
 */
public class T491 {
	public static void main(String[] args) {
		int[] nums = new int[]{4,6,7,7};
		System.out.println(findSubsequences(nums));
	}
	static List<List<Integer>> list = new ArrayList<>();
	static List<Integer> list1 = new ArrayList<>();
	public static List<List<Integer>> findSubsequences(int[] nums) {
		backtrace(nums,0);
		return list;
	}
	public static void backtrace(int [] nums,int index) {
		if (list1.size()>1) {
			list.add(new ArrayList<>(list1));
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = index; i < nums.length; i++) {
			if(!list1.isEmpty()&&nums[i]<list1.get(list1.size()-1)
					||set.contains(nums[i])) continue;
			set.add(nums[i]);
			list1.add(nums[i]);
			backtrace(nums,i+1);
			list1.remove(list1.size() - 1);

		}
	}

}
