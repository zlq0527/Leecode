package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:14 2022/2/27
 * @ Description：
 */
public class T553 {
	public static void main(String[] args) {
		int nums[] = new int[]{1000,100};
		System.out.println(optimalDivision(nums));
	}
	public static String optimalDivision(int[] nums) {
		StringBuilder stringBuilder = new StringBuilder();
		if(nums.length==1) return new StringBuilder().append(nums[0]).toString();
		if (nums.length==2) return new StringBuilder().append(nums[0]).append("/").append(nums[1]).toString();
		stringBuilder.append(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			stringBuilder.append("/");
			stringBuilder.append(nums[i]);
		}
		stringBuilder.insert(stringBuilder.indexOf("/")+1, "(");
		stringBuilder.append(")");
		return stringBuilder.toString();
	}
}
