package Leecode;

public class T34 {
	public static void main(String[] args) {
		int[] nums = new int[]{6};
		int target = 6;
		int[] res = new T34().searchRange(nums, target);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public int[] searchRange(int[] nums, int target) {
		int end = 0;
		int begin = 0;
		int res2[] = new int[]{-1, -1};

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				begin = i;
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				j++;
			}
		}

		if (nums.length == 0 || (begin == 0 && end == 0)) {
			return res2;
		}
		end = begin + j - 1;

		int[] res = new int[2];
		res[0] = begin;
		res[1] = end;

		return res;
	}
}
