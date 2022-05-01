package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:32 2022/4/4
 * @ Description：
 */
public class T6033 {
	public static void main(String[] args) {
		System.out.println(minBitFlips(10, 7));
	}
	public static int minBitFlips(int start, int goal) {
		char[] chars = Integer.toBinaryString(start).toCharArray();
		char[] chars1 = Integer.toBinaryString(goal).toCharArray();
		int res = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != chars1[i]) {
				res++;
			}
		}
		return  res;
	}
}
