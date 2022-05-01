package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:13 2022/2/22
 * @ Description：
 */
public class T921 {
	public static void main(String[] args) {
		String s = "((()(()";
		System.out.println(minAddToMakeValid(s));
	}
	public static int minAddToMakeValid(String s) {
		char[] chars = s.toCharArray();
		int need=0;//对右括号的需求
		int res=0;
		for (char i : chars) {
			if (i == '(') {
				need++;
			} else {
				need--;
				if (need == -1) {
					need=0;
					res++;
				}
			}
		}
		return res+need;
	}
}
