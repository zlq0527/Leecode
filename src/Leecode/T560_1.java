package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:16 2022/3/29
 * @ Description：
 */
public class T560_1 {
	public static void main(String[] args) {
		int[] num = new int[]{1,2,3};
		System.out.println(subarraySum(num, 3));
	}
	public static int subarraySum(int[] nums, int k) {
		int ans = 0;
		int[] pre = new int[nums.length];
		pre[0] = nums[0];
		for (int i = 1; i < pre.length; i++) {
			pre[i] = pre[i - 1] + nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (pre[j+1] - pre[i] == k) {
					ans++;
				}
			}
		}
		return ans;
	}
}
