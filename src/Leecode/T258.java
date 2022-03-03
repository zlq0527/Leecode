package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 17:06 2022/3/3
 * @ Description：
 */
public class T258 {
	public static void main(String[] args) {
		new T258().addDigits(843784348);
	}

	public int addDigits(int num) {
		int res = 0;
		if (num / 10 == 0) {
			return num;
		}
		while (num != 0) {
			res += num % 10;
			num /= 10;
		}
		return addDigits(res);

	}
}
