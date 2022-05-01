package weeRace2;

import java.text.DateFormat;
import java.util.Date;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:29 2022/4/3
 * @ Description：
 */
public class T1 {
	public static void main(String[] args) {
		System.out.println(convertTime("02:30", "04:35"));
	}

	public static int convertTime(String current, String correct) {
		String[] s1 = current.split(":");
		String[] s2 = correct.split(":");
		int res = 0;
		int t1 = Integer.parseInt(s1[0]) * 60 + Integer.parseInt(s1[1]);
		int t2 = Integer.parseInt(s2[0]) * 60 + Integer.parseInt(s2[1]);
		if (t2 == t1) {
			return 0;
		}
		while (t2 > t1) {
			while (t2 - 60 >= t1) {
				t2 -= 60;
				res++;
			}
			while (t2 - 15 >= t1) {
				t2 -= 15;
				res++;
			}
			while (t2 - 5 >= t1) {
				t2 -= 5;
				res++;
			}
			while (t2 - 1 >= t1) {
				t2 -= 1;
				res++;
			}
		}
		return res;
	}
}
