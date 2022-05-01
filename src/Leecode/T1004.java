package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:20 2022/3/29
 * @ Description：
 */
public class T1004 {
	public static void main(String[] args) {
		int[] num = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		System.out.println(longestOnes(num, 2));
	}
	public static int longestOnes(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int zero = 0;
		int res=0;
		while (right < nums.length) {
			if (nums[right] == 0) {
				zero++;
			}
			while (zero > k) {
				if (nums[left++] == 0) {
					zero--;
				}
			}
			res = Math.max(res, right - left + 1);
			right++;
		}
		return  res;
	}
}
