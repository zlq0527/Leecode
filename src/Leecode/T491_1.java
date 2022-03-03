package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:11 2022/3/1
 * @ Description：
 */
public class T491_1 {

	private List<Integer> path = new ArrayList<>();
	private List<List<Integer>> res = new ArrayList<>();


	public static void main(String[] args) {
		int nums[] = new int[]{4,6,7,7};
		System.out.println(new T491_1().findSubsequences(nums));
	}
	public List<List<Integer>> findSubsequences(int[] nums) {
		backtracking(nums,0);
		return res;
	}
	private void backtracking (int[] nums, int start) {
		if (path.size() > 1) {
			res.add(new ArrayList<>(path));
		}

		int[] used = new int[201];
		for (int i = start; i < nums.length; i++) {
			if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) ||
					(used[nums[i] + 100] == 1)) continue;
			used[nums[i] + 100] = 1;
			path.add(nums[i]);
			backtracking(nums, i + 1);
			path.remove(path.size() - 1);
		}
	}
}
