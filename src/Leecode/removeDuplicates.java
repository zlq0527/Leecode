package Leecode;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class removeDuplicates {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 4};
		//122234    122334  122344
		System.out.println(new removeDuplicates().removeDuplicates1(nums));
	}

	public int removeDuplicates1(int[] nums) {
		int j = 1;
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == nums[i]) {
				continue;
			} else {
				nums[index] = nums[i];
				index++;
				j++;
			}
		}
		return j;
	}
}
