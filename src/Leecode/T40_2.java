package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:31 2022/4/30
 * @ Description：
 */
public class T40_2 {
	static List<List<Integer>> list = new ArrayList<>();
	static List<Integer> list1 = new ArrayList<>();

	public static void main(String[] args) {
		int[] can = new int[]{5};
		combinationSum(can, 5);
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		boolean[] flag = new boolean[candidates.length];
		backtrace(candidates, 0, target,flag);
		System.out.println(list);
		return list;
	}

	public static void backtrace(int[] res, int i, int target,boolean[] flag) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			list.add(new ArrayList<>(list1));
			return;
		}
		for (int j = i; j < res.length; j++) {
			if (j>0 && res[j-1] == res[j]&&!flag[j-1]) {
				continue;
			}
//			if (target - res[i] < 0) {
//				return;
//			}
			list1.add(res[j]);
			flag[j] = true;
			backtrace(res, j + 1, target - res[j],flag);
			list1.remove(list1.size() - 1);
			flag[j] = false;
		}
	}
}
