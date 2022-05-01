package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:32 2022/4/30
 * @ Description：
 */
public class T216 {
	static List<List<Integer>> list = new ArrayList<>();
	static List<Integer> list1 = new ArrayList<>();

	public static void main(String[] args) {
		int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = 45, k = 9;
		dfs(n, k, 1,n);
		System.out.println(list);
	}
	public static void dfs(int n, int k, int o,int target) {
		if (list1.size() == k &&target==0) {
			list.add(new ArrayList<>(list1));
			return;
		}
		for (int i = o; i <= 9; i++) {
			if (target < 0) {
				return;
			}
			list1.add(i);
			dfs(n, k, i + 1,target-i);
			list1.remove(list1.size() - 1);
		}
	}
}
