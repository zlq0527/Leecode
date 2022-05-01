package LanQCode;
import java.util.HashMap;
import java.util.Map;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 17:31 2022/3/3
 * @ Description：
 */
public class Card {
	public static void main(String[] args) {
		System.out.println(countCard(3));
	}
	public static int countCard(int nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <= 9; i++) {
			map.put(i, 2021);
		}
		int result = 0;
		int countcard = 1;
		while (testmap(map)) {
			int temp=countcard;
			while (temp!= 0) {
				int res = temp % 10;
				map.put(res, map.get(res) - 1);
				temp/=10;
			}
			if (!testmap(map)) {
				return result;
			}
			countcard++;
			result++;
		}
		return result;
	}
	public static boolean testmap(Map<Integer, Integer> map) {
		for (Integer key : map.keySet()) {
			if (map.get(key) < 0) {
				return false;
			}
		}
		return true;
	}
}
