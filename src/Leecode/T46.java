package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:23 2022/2/28
 * @ Description：给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
public class T46 {
	static List<List<Integer>> list=new ArrayList<>();
	public static void main(String[] args) {
		int nums[] = new int[]{0,1,2};
		System.out.println(permute(nums));
	}
	public static List<List<Integer>> permute(int[] nums) {
		List<Integer> list2 = new ArrayList<>();
		backtrace(nums, list2);
		return list;
	}

	public static void backtrace(int [] nums,List<Integer> list2) {
		if (list2.size() == nums.length) {
			list.add(new ArrayList<>(list2));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (list2.contains(nums[i])) {
				continue;
			}
			list2.add(nums[i]);
			backtrace(nums,list2);
			list2.remove(list2.size() - 1);
		}
	}
}
