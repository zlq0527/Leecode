package sort;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:30 2022/3/20
 * @ Description：插入排序
 */
public class Sort2 {
	public static void main(String[] args) {
		int[] nums = new int[]{3, 44, 38, 5, 47, 15};
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
				temp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = temp;
			}
		}
	}
}
