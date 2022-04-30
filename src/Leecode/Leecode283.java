package Leecode;

import java.util.ArrayList;
import java.util.List;

public class Leecode283 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 0, 4, 5, 0, 7};
//		int[] a = new int[]{0,0,0,0,1};
		new Leecode283().moveZeroes(a);
	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		while (j < nums.length) {
			nums[j++] = 0;
		}
		for (int i : nums) {
			System.out.println(i);
		}

	}
}
