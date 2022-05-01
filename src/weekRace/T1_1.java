package weekRace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:48 2022/3/20
 * @ Description：
 */
public class T1_1 {
	public static void main(String[] args) {
		int[] nums = new int[]{2,4,1,1,6,5};
		System.out.println(new T1_1().countHillValley(nums));
	}
	public int countHillValley(int[] nums) {
		int res=0;
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				continue;
			}
			list.add(nums[i-1]);
		}
		list.add(nums[nums.length - 1]);
		for (int i = 1; i < list.size()-1; i++) {
			if (list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1)) {
				res++;
			}
			if (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
				res++;
			}
		}

		return  res;
	}
}
