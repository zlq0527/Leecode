package Leecode;

import java.util.Scanner;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 22:46 2022/2/18
 * @ Description：
 */
public class T29 {
	public static void main(String[] args) {
		System.out.println(divide(-2147483648,-3));
		//Integer.MIN_VALUE	-2147483648
		//Integer.MAX_VALUE	2147483647

	}
	public static int divide(int dividend, int divisor) {
		if (divisor ==1) {
			return dividend;
		}
		if (divisor == -1) {
			if (dividend == Integer.MIN_VALUE) {
				return Integer.MAX_VALUE;
			}
		}
		long a = Math.abs((long) dividend);
		long b = Math.abs((long) divisor);
		int res=0;
//		if (dividend == Integer.MIN_VALUE) {
//			int res2=0;
//			while (dividend != 0) {
//				dividend += Math.abs(divisor);
//				res2++;
//			}
//			if (divisor < 0) {
//				return res2;
//			}
//			return -res2;
//		}
		while (a >= b) {
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
