package Leecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:43 2022/3/27
 * @ Description：
 */
public class T5236 {
	public static void main(String[] args) {
		int[] num = new int[]{1, 1, 2, 2, 3, 3};
		System.out.println(new T5236().minDeletion(num));
	}

	public int minDeletion(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < list.size()-1; i++) {
			if (i%2==0&&list.get(i).equals(list.get(i + 1))) {
				list.remove(i);
				res++;
				i--;
			}
		}
		return res;
	}
}
