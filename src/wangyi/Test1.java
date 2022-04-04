package wangyi;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:04 2022/3/27
 * @ Description：
 */
// Scanner sc = new Scanner(System.in);
//		 int n = sc.nextInt();
//		 int ans = 0, x;
//		 for(int i = 0; i < n; i++){
//		for(int j = 0; j < n; j++){
//		x = sc.nextInt();
//		ans += x;
//		}
//		}
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0, x = 0, y = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		x = scanner.nextInt();
		y = scanner.nextInt();
		int res=0;
		if (x < y) {
			while (a > 0 || b > 0) {
				a -= y;
				b -= y;
				res++;
			}
		} else if (x < y * 2) {
			while (a > 0 && b > 0) {
				a-=y;
				b -= y;
				res++;
			}
			int t = Math.max(a, b);
			while (t > 0) {
				t -= x;
				res++;
			}
		} else {
			while (a > 0) {
				a -= x;
				res++;
			}
			while (b > 0) {
				b -= x;
				res++;
			}
		}
		System.out.println(res);

	}
}
