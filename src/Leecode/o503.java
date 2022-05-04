package Leecode;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:05 2022/5/4
 * @ Description：
 */
public class o503 {

	public static void main(String[] args) {
		int[] nums = new int[]{100,1,11,1,120,111,123,1,-1,-100};
		new o503().nextGreaterElements(nums);
	}

	public int[] nextGreaterElements(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		Arrays.fill(res, -1);
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while (j < n - 1 && nums[i] >= nums[j + 1]){
				j++;
			}
			if (j ==n-1) {
				for (int k = n - 1; k >= 0; k--) {
					if (nums[k] > nums[i]) {
						res[i] = nums[k];
					}
				}
			} else {
				j++;
				if (j < n) {
					res[i] = nums[j];
				}
			}
		}
		return  res;
	}
}
