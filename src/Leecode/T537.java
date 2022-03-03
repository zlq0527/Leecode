package Leecode;

import java.util.Locale;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:04 2022/2/26
 * @ Description：
 */
public class T537 {
	public static void main(String[] args) {


		String num1 = "1+-1i";
		String num2 = "0+0i";
		System.out.println(complexNumberMultiply(num1, num2));
	}

	public static String complexNumberMultiply(String num1, String num2) {
		String[] res;
		String[] res2;
		res = num1.split("\\+|i");
		res2 = num2.split("\\+|i");
		int a = Integer.parseInt(res[0]);
		int b = Integer.parseInt(res[1]);
		int c = Integer.parseInt(res2[0]);
		int d = Integer.parseInt(res2[1]);
		return String.format("%d+%di", a * c - b * d, a * d + b * c);

		//(x1+x2)*(y1+y2)
		//x2系数是a2
		//y2系数是b2


	}
}
