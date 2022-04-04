package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:19 2022/3/22
 * @ Description：
 */
public class T2038 {
	public static void main(String[] args) {
		System.out.println(winnerOfGame("ABBBBBBBAAA"));
	}
	public static boolean winnerOfGame(String colors) {
		if (colors.length() <= 2) {
			return false;
		}
		char[] chars = colors.toCharArray();
		int len = chars.length;
		int a=0,b=0;
		int resa=0,resb=0;
		for (int i = 0; i < len; i++) {
			if (chars[i] == 'A') {
				b = 0;
				a++;
				if (a >= 3) {
					resa++;
				}
			} else {
				a=0;
				b++;
				if (b >= 3) {
					resb++;
				}
			}
		}
		return resa > resb;
	}
}
