package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 12:18 2022/2/21
 * @ Description：
 */
public class T2180 {
	public static void main(String[] args) {
		System.out.println(countEven(1000));
	}

	public static int countEven(int num) {
		int count = 0;
		int i = 1;
		while (i <= num) {
			if ((i/1+i/10+i/100+i/1000)%2==0) {
				count++;
			}
			i++;
		}

		return count;
	}
}
