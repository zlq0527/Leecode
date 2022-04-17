package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 12:37 2022/4/17
 * @ Description：
 * 原地数组排序 嵌套for 也可,但是时间复杂度太高, 本题概述 有三个数字,0,1,2 给定一个数组, 原地排序, 顺序必须是0, 1,2
 * 在不使用库函数的条件下解决问题. 思路 一次循环 如果nums[i]是0,移到前面, 然后用ptr当指针,移动完之后ptr++, 循环遍历数组一次
 * 第二次循环 判断nums[i]是否为1 然后和ptr交换位置
 */

public class T75 {
	public static void main(String[] args) {
		int[] nums = new int[]{2,0,2,0,1,0};
		sortColors(nums);
	}
	public static void sortColors(int[] nums) {
		int ptr = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				int temp;
				temp = nums[i];
				nums[i] = nums[ptr];
				nums[ptr] = temp;
				ptr++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				int temp;
				temp = nums[i];
				nums[i] = nums[ptr];
				nums[ptr] = temp;
				ptr++;
			}
		}

	}
}
