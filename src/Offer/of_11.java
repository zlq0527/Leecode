package Offer;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:43 2022/2/25
 * @ Description：
 */
public class of_11 {
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,0};
		System.out.println(minArray(nums));
	}
	public static int minArray(int[] numbers) {
		int l=0;
		int r=numbers.length-1;
		int min = numbers[0];
			while (l < r) {
				if (numbers[l] <= numbers[l + 1]) {
					l++;
				}else {
					if (numbers[l] > numbers[l + 1]) {
						min = Math.min(min, numbers[l + 1]);
					}
					r--;
				}
			}
		return min;
	}
}
