package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:44 2022/3/14
 * @ Description：
 */
public class T40 {
	public static void main(String[] args) {
		int res[] = new int[]{10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		System.out.println(combinationSum2(res, target));
	}

	static List<List<Integer>> list = new ArrayList<>();

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		if (candidates.length <= 0) {
			return new ArrayList<>();
		}
		List<Integer> list2 = new ArrayList<>();
		backtrace(candidates, 0, target, list2);
		return list;
	}

	public static void backtrace(int[] candidates, int i, int target, List<Integer> list2) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			list.add(new ArrayList<>(list2));
			return;
		} else {
			for (int j = i; j < candidates.length; j++) {
				if (target < 0) {
					break;
				}
				list2.add(candidates[j]);
				backtrace(candidates, j + 1, target - candidates[j], list2);
				list2.remove(list2.size() - 1);
			}

		}
	}
}
