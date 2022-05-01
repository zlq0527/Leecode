package Leecode;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:51 2022/3/18
 * @ Description：
 */
public class T128 {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 7};
		System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int s : nums) {
			set.add(s);
		}
		int max;
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int begin = nums[i];
			max = 0;
			if (set.contains(begin) && !set.contains(begin - 1)) {
				while (set.contains(begin)) {
					set.remove(begin);
					max++;
					begin++;
				}
			}
			res = Math.max(max, res);
		}
		return res;
	}
}
