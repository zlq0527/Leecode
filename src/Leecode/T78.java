package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:47 2022/3/22
 * @ Description：
 */
public class T78 {
	public static void main(String[] args) {
		int[] num = new int[]{1,2,3};
		System.out.println(subsets(num));
	}

	static List<List<Integer>> list = new ArrayList<>();
	public static List<List<Integer>> subsets(int[] nums) {
		List<Integer> list1 = new ArrayList<>();
		backtrace(nums, list1,0);
		list.add(new ArrayList<>());
		return list;
	}

	public static void backtrace(int [] nums,List<Integer> list1,int j) {
		if (!list.contains(list1)&&!list1.isEmpty()) {
			list.add(new ArrayList<>(list1));
		}
		for (int i = j; i < nums.length; i++) {
			list1.add(nums[i]);
			backtrace(nums, list1,i+1);
			list1.remove(list1.size() - 1);
		}
	}
}
