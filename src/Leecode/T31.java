package Leecode;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:01 2022/3/21
 * @ Description：下一个排列
 */
public class T31 {
	public static void main(String[] args) {
		int[] nums = new int[]{3, 2, 1};
		new T31().nextPermutation(nums);
	}
	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length == 1) {
			return;
		}
		// 从后往前找
		int i = nums.length - 1;
		while (i > 0) {
			// 找到一个比后面数字小的
			if (nums[i] > nums[i - 1]) {
				// 后面数字的最小值
				int min = nums[i];
				int k = i;
				for (int j = i + 1; j < nums.length; j++) {
					// 该最小值要比nums[i-1]大，这样才可以交换
					if (nums[j] < min && nums[j] > nums[i - 1]) {
						min = nums[j];
						// 标记最小值的位置，以便交换
						k = j;
					}
				}
				exch(nums, i - 1, k);
				// 对交换后,i-1之后的数组排序
				Arrays.sort(nums, i, nums.length);
				break;
			}
			i--;
		}
		// 降序数组直接重排
		if (i == 0) {
			Arrays.sort(nums);
		}
	}

	private void exch(int[] nums, int i, int k) {
		int tmp = nums[i];
		nums[i] = nums[k];
		nums[k] = tmp;
	}

}
