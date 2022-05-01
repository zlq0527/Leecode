package Leecode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:37 2022/3/5
 * @ Description：
 */
public class T521 {
	public static void main(String[] args) {
		System.out.println(new T521().findLUSlength("abaa", "cdc"));
	}
	public  int findLUSlength(String a, String b) {
		int[] num = new int[]{};
		Arrays.sort(num);
		if (a .equals(b)) {
			return -1;
		}
		return Math.max(a.length(), b.length());
	}
}
