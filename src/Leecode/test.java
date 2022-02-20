package Leecode;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3};
		System.out.println(new test().permute(nums));
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i])) continue; // 已经存在的元素，跳过
				tempList.add(nums[i]); //将当前元素加入
				backtrack(list, tempList, nums); //向后继续添加
				tempList.remove(tempList.size() - 1); //将 tempList 刚添加的元素，去掉，尝试新的元素
			}
		}
	}
}
