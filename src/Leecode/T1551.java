package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:06 2022/4/4
 * @ Description：
 */
public class T1551 {
	public static void main(String[] args) {
		System.out.println(minOperations(9999));
	}

	public static int minOperations(int n) {
		int[] nums = new int[n];
		int sum = 0, res = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 2 * i + 1;
			sum += nums[i];
		}
		int avg = sum / n;
		for (int i = nums.length-1; i > 0; i--) {
			int t = nums[i];
			if (t > avg) {
				res += nums[i] - avg;
			}
		}
		return res;
	}
}
