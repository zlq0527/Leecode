package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:25 2022/4/18
 * @ Description：按照字典序排序 1-n的数字
 * 若n为13 排序结果为1 10 11 12 13 2 3 4 5 6 7 8 9
 */
public class o386 {
	public static void main(String[] args) {
		System.out.println(lexicalOrder(13));
	}

	public static List<Integer> lexicalOrder(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			dfs(n, i, list);
		}
		return list;
	}
	private static void dfs(int n, int target, List<Integer> list) {
		if (target > n) {
			return;
		}
		list.add(target);
		target *= 10;
		for (int j = 0; j < 10; j++) {
			dfs(n, target + j, list);
		}
	}
}
