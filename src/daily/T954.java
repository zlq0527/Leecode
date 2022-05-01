package daily;

import org.ietf.jgss.Oid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:48 2022/4/1
 * @ Description：
 */
public class T954 {
	public static void main(String[] args) {
		int[] nums = new int[]{4, 4, 8, 8, 8, 8, 2, 2, 16, 16, 1, 32};
		System.out.println(canReorderDoubled(nums));
	}

	public static boolean canReorderDoubled(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			}
		}
		for (int i : map.keySet()) {
//			if (map.get(i) == 0) {
//				continue;
//			}
			while (map.get(i) != 0) {
				if (map.containsKey(i)) {
					int t = i * 2;
					int n = i / 2;
					if (map.containsKey(t) && map.get(t) != 0) {
						if (map.get(i) >= 1 && map.get(t) >= 1) {
							map.put(i, map.get(i) - 1);
							map.put(t, map.get(t) - 1);
						} else {
							return false;
						}
					} else {
						if (!map.containsKey(n)) {
							return false;
						} else {
							if (map.get(i) >= 1 && map.get(n) >= 1) {
								map.put(i, map.get(i) - 1);
								map.put(n, map.get(n) - 1);
							} else {
								return false;
							}
						}
					}
				} else {
					return false;
				}
			}

		}
		return true;
	}
}
