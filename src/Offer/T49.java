package Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:56 2022/3/29
 * @ Description：
 */
public class T49 {
	public static void main(String[] args) {
		System.out.println(nthUglyNumber(100));

	}
	public static int nthUglyNumber(int n) {
		int[] num = new int[n];
		int i = 0, j = 0, k = 0;
		num[0] = 1;
		for (int l = 1; l < num.length; l++) {
			int tem = Math.min(num[i] * 2, Math.min(num[j] * 3, num[k] * 5));
			if (num[i]*2 == tem) i++;
			if (num[j]*3 == tem) j++;
			if (num[k]*5 == tem) k++;
			num[l] = tem;
		}
		return num[n - 1];


	}
}
