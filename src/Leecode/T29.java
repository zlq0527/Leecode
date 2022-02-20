package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 22:46 2022/2/18
 * @ Description：
 */
public class T29 {
	public static void main(String[] args) {
		System.out.println(divide(-2147483648, 1));
	}
	public static int divide(int dividend, int divisor) {
		if (divisor ==1) {
			return dividend;
		}
		if (divisor == -1) {
			return -dividend;
		}
		int a = Math.abs(dividend);
		int b = Math.abs(divisor);
		int res=0;
		while (a > b) {
			a-=b;
			res++;
		}
		if (dividend < 0 && divisor < 0) {
			return res;
		}else if (dividend<0&&divisor>0||dividend>0&&divisor<0){
			return -res;
		}
		return res;
	}
}
