package Offer;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 20:06 2022/2/27
 * @ Description：
 */
public class of_16 {
	public static void main(String[] args) {
		System.out.println(myPow(2.00000,-2));
	}
	private static double myPow(double x, int n) {
		if (n == 0) {
			return  1;
		}
		if (n <0) {
			int i = Math.abs(n);
			while (i!=0) {
				x *= i;
				i--;
			}
			return 1 / x;
		}

		return 0;
	}
}
