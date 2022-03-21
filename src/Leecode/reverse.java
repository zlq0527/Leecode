package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:56 2022/2/6
 * @ Description：旋转数组
 */
public class reverse {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
		new reverse().rotate(nums, 6);
	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
//        int[] copy = Arrays.copyOfRange(nums, nums.length - k, nums.length);
//        System.arraycopy(nums,0,nums,k,nums.length-k);
//        System.arraycopy(copy, 0, nums, 0, k);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
		int[] res = new int[nums.length];
		int len = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[i];
		}
		for (int i = k; i > 0; i--) {
			nums[len--] = res[i];
		}
		for (int i = 0; i < len; i++) {
			System.out.println("--");
			System.out.println(nums[i]);
		}
//        for (int i = 0; i < k; i++) {
//            nums[i]= res[nums.length-k+i];
//        }
	}
}
