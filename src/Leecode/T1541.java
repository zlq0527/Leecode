package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:30 2022/2/22
 * @ Description：
 */
public class T1541 {
	public static void main(String[] args) {
		String s = "()()))))";
		System.out.println(minInsertions(s));
	}

	public static int minInsertions(String s) {

		char[] chars = s.toCharArray();
		int need = 0;
		int res = 0;
		for (Character i : chars) {
			if (i == '(') {
				need += 2;
//				if (need % 2 == 1) {
//					res++;
//					need--;
//				}
			}
			if (i==')'){
				need--;
				if (need == -1) {
					need = 1;
					res++;
				}
			}
		}
		return res + need;
	}
}
