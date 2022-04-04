package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:25 2022/3/8
 * @ Description：
 */
public class T169_1 {
	public static void main(String[] args) {
		int nums[] = new int[]{10, 9, 9, 9, 10};
		System.out.println(new T169_1().majorityElement(nums));
	}

	public int majorityElement(int[] nums) {
		int count = 0;
		int len = nums.length;
		int tem = nums[0];
		for (int i = 0; i < len; i++) {
			if (nums[i] == tem) {
				count++;
			} else {
				count--;
			}
			if (count < 0) {
				tem = nums[i];
				count = 0;
			}
		}
		return tem;
	}
}
