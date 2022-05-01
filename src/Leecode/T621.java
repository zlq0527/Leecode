package Leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:41 2022/4/4
 * @ Description：
 */
public class T621 {
	public static void main(String[] args) {
		char[] tasks = new char[]{'A','A','A','B','B','B', 'C','C','C', 'D', 'D', 'E'};
		System.out.println(leastInterval(tasks, 2));
	}

	public static int leastInterval(char[] tasks, int n) {
		Map<Character, Integer> map = new HashMap<>();
		if (n == 0) {
			return tasks.length;
		}
		int count = 0;
		int maxcount = 0;
		for (char c : tasks) {
			int t = map.getOrDefault(c, 0) + 1;
			map.put(c, t);
			count = Math.max(count, t);
		}
		for (char i : map.keySet()) {
			if (map.get(i) == count) {
				maxcount++;
			}
		}
		return Math.max((count - 1) * (n + 1) + maxcount,tasks.length);
	}
}
