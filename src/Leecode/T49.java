package Leecode;
import java.util.*;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:46 2022/3/19
 * @ Description：
 */
public class T49 {
	public static void main(String[] args) {
		String[] res = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//		String[] res = new String[]{"", ""};
		System.out.println(new T49().groupAnagrams(res));
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] array = str.toCharArray();
			Arrays.sort(array);
			String key = new String(array);
			List<String> list = map.getOrDefault(key, new ArrayList<>());
			list.add(str);
			map.put(key, list);
		}
		return new ArrayList<>(map.values());
	}
}
