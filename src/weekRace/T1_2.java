package weekRace;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 12:22 2022/3/20
 * @ Description：
 */
public class T1_2 {
	public static void main(String[] args) {
		int[] nums = new int[]{2,4,1,1,6,5};
		System.out.println(new T1_1().countHillValley(nums));
	}
	public int countHillValley(int[] nums) {
		int res=0;
		int n = nums.length;
		for (int i = 0; i+1< n; i++) {
			if (nums[i] != nums[i + 1]) {

			}
		}

		return  res;
	}

}
