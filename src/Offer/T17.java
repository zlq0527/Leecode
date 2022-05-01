package Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:17 2022/3/28
 * @ Description：
 */
public class T17 {
	public static void main(String[] args) {
		int n = 1;
		StringBuilder stringBuilder = new StringBuilder();
		while (n != 0) {
			stringBuilder.append(9);
			n--;
		}
		int len = Integer.parseInt(String.valueOf(stringBuilder));
		int[] num = new int[len];
		for (int i = 0; i < len; i++) {
			num[i]=i+1;
		}

	}
}
