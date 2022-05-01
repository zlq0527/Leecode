package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:01 2022/3/29
 * @ Description：长度最小的子数组  滑动窗口解决!
 */
public class T209 {
	public static void main(String[] args) {
		int[] num = new int[]{2, 3, 1, 2, 4, 3};
		System.out.println(minSubArrayLen(7, num));
	}

	public static int minSubArrayLen(int target, int[] nums) {
		int sum = 0;
		int ans = Integer.MAX_VALUE;
		int len = nums.length;
		int left = 0;
		int right = 0;
		while (right < len) {
			sum += nums[right];
			while (sum >= target) {
				ans = Math.min(ans, right - left + 1);
				sum -= nums[left];
				left++;
			}
			right++;
		}
		return ans == Integer.MAX_VALUE ? 0 : ans;
	}
}
