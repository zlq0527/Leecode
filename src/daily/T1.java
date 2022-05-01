package daily;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:33 2022/4/13
 * @ Description：
 */
public class T1 {
	public int[] numberOfLines(int[] widths, String s) {
		int[] res = new int[2];
		int res1 = 0;
		int res2 = 0;
		int sum = 0;
		for (int i = 0; i < widths.length; i++) {
			if (sum + widths[i] <= 100) {
				sum += widths[i];
			} else {
				sum = 0;
				res1++;
			}
		}
		res2 = sum;
		res[0] = res1;
		res[1] = res2;
		System.out.println(res1);
		System.out.println(res2);

		return res;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		System.out.println(new T1().numberOfLines(nums, "bbbcccdddaaa"));
	}
}
