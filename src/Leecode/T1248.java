package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:13 2022/3/30
 * @ Description：最优子数组的个数
 */
public class T1248 {
	public static void main(String[] args) {
		int[] num1 = new int[]{2,2,2,1,2,2,1,2,2,2};
		System.out.println(numberOfSubarrays(num1, 2));

	}
	public static int numberOfSubarrays(int[] nums, int k) {
		int ans = 0;
		int t = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {

			}
		}
		return ans;
	}
}
