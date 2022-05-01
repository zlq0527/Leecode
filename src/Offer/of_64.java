package Offer;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:49 2022/3/15
 * @ Description：
 */
public class of_64 {
	public static void main(String[] args) {
		System.out.println(sumNums(100));
	}
	public static int sumNums(int n) {
		if (n == 1) {
			return 1;
		}
		return n+sumNums(n-1);
	}
}
