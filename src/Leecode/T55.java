package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:30 2022/3/15
 * @ Description：跳跃游戏
 */
public class T55 {
	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 1, 0, 4};
		System.out.println(canJump(nums));
	}
	public static boolean canJump(int[] nums) {
		int k=0;
		for (int i = 0; i < nums.length; i++) {
			if (i > k) {
				return false;
			}
			k = Math.max(k, i+nums[i]);
		}
		return true;
	}
}
