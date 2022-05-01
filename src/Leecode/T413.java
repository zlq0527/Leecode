package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:25 2022/3/30
 * @ Description：
 */
public class T413 {
	public static void main(String[] args) {
		int[] num1 = new int[]{1, 2, 3, 4};
		System.out.println(numberOfArithmeticSlices(num1));
	}
	public static int numberOfArithmeticSlices(int[] nums) {
		if (nums.length < 3) {
			return 0;
		}
		int t = 0, ans = 0;
		int d = nums[0] - nums[1];
		for (int i = 2; i < nums.length; i++) {
			if (nums[i-1] - nums[i] == d) {
				t++;
			} else {
				d = nums[i-1] - nums[i];
				t = 0;
			}
			ans += t;
		}

		return ans;
	}
}
