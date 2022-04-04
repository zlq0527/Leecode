package Leecode;
import java.util.ArrayList;
import java.util.List;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:19 2022/3/18
 * @ Description：
 */
public class T189 {
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		int k = 3;
		new T189().rotate(nums, k);
	}
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		if (k > len) {
			k = k % len;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = len-k; i < len; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < len - k ; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < len; i++) {
			nums[i] = list.get(i);
		}
	}
}
