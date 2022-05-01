package LanQCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:35 2022/3/6
 * @ Description：
 */
public class T1204 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k=0;
		int a = Integer.parseInt(scanner.nextLine());
		int[] nums = new int[10];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a; i++) {
			String str = scanner.nextLine();
			String[] s = str.split(" ");
			for (String res : s) {
				map.put(Integer.parseInt(res),map.getOrDefault(Integer.parseInt(res),0)+1);
				nums[k++] = Integer.parseInt(res);
			}
		}
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
}
