package mt;

import javax.swing.text.html.CSS;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:13 2022/4/16
 * @ Description：
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gcount = scanner.nextInt();
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		int[] num1 = new int[n];
		int[] num2 = new int[n];
		for (int i = 0 ; i < n; i++) {
			num1[i] = scanner.nextInt();
//			int k = scanner.nextInt();
//			map.put(k, map.getOrDefault(k, 0) + 1);
		}
		for (int i = 0 ; i < n; i++) {
			num2[i] = scanner.nextInt();
//			int k = scanner.nextInt();
//			map.put(k, map.getOrDefault(k, 0) + 1);
		}
		int res = 0;
		int[] num3 = new int[100000];
		for (int i = 0; i < num1.length; i++) {
			int k = num1[i];
			while (k >= num1[i] && k <= num2[i]) {
				num3[k]++;
				k++;
			}

		}
//		for (Integer i : map.keySet()) {
//			if (map.get(i) >= 2) {
//				res++;
//			}
//		}
		for (int i = 0; i < num3.length; i++) {
			if (num3[i] >= 2) {
				res++;
			}
		}
		System.out.println(res);


	}
}
