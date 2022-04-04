package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:29 2022/3/29
 * @ Description：
 */
public class T560 {
	public static void main(String[] args) {
		int[] num = new int[]{1,1,1};
		System.out.println(subarraySum(num, 2));
	}
	public static int subarraySum(int[] nums, int k) {
		int sum;
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == k) {
					ans++;
				}
			}
		}
		return ans;
	}
}
