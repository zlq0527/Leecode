package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 18:22 2022/2/22
 * @ Description：
 */
public class T11 {
	public static void main(String[] args) {
		int[] heig = new int[]{1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(heig));
	}
	public static int maxArea(int[] height) {
		int sum=0;
		int i=0;
		int j=height.length-1;
		while (i < j) {
			int h = Math.min(height[i], height[j]);
			sum = Math.max(h*(j-i), sum);
			if (height[i] < height[j]) {
				i++;
			}else {
				j--;
			}
		}
		return sum;


	}
}
