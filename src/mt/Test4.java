package mt;
import java.util.*;


/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:31 2022/4/16
 * @ Description：
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Math.abs(scanner.nextInt());
		int b = Math.abs(scanner.nextInt());
		int res = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		while (max != min) {
			while (max / 2 <= max - min || min / 2 <= max - min) {
				max /= 2;
				res++;
				if (max == min) {
					System.out.println(res);
					return;
				}
				if (max < min) {
					int temp = 0;
					temp = max;
					max = min;
					min = temp;
				}
			}
			while (true) {
				if (max - min < 5) {
					res += max - min;
					System.out.println(res);
					return;
				}
				while (max - min > 2) {
					max /= 2;
					min /= 2;
					res++;
				}

			}
//			while (true) {
//				min++;
//				res++;
//				if (max == min) {
//					System.out.println(res);
//					return;
//				}
//			}
		}
	}
}
