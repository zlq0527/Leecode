package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:11 2022/4/3
 * @ Description：
 */
public class T6034 {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 5};
		System.out.println(triangularSum(nums));
	}

	public static int triangularSum(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			list.add(i);
		}
		while (list.size() >1) {
			for (int i = 1; i < list.size(); i++) {
				list.set(i-1, (list.get(i) + list.get(i-1)) % 10);
			}
			list.remove(list.size() - 1);
		}
		return list.get(0);

	}
}
