package Hot100;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:34 2022/4/17
 * @ Description：接雨水
 */
public class o42 {

	public static void main(String[] args) {
//		int[] nums = new int[]{4,2,0,3,2,5};
//		int[] nums = new int[]{2,0,2,0,3};
		int[] nums = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(trap(nums));
	}

	public static int trap(int[] height) {
		int res = 0;
		int max = 0;
		for (int i : height) {
			max = Math.max(i, max);
		}
		int l = 0;
		int ptr = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[ptr] > height[i]) {
				res += height[ptr] - height[i];
			} else {
				ptr = i;
			}
			if (height[i] == max) {
				l = i;
				continue;
			}
		}
		ptr = l+1;
		for (int i = l+1; i < height.length-1; i++) {
			if (height[ptr] > height[i]) {
				res += height[ptr] - height[i];
			} else {
				ptr = i;
			}
		}
		return res;
	}
}
