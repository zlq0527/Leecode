package Leecode;

import java.awt.datatransfer.StringSelection;
import java.nio.channels.SelectionKey;
import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:19 2022/4/3
 * @ Description：
 */
public class T30 {
	public static void main(String[] args) {
		String[] words = new String[]{"bar", "foo", "the"};
		String S = "barfoofoobarthefoobarman";
		System.out.println(findSubstring(S, words));
	}

	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int slen = words.length * words[0].length();
		int wlen = words[0].length();
		if (s.length() < slen) {
			return new ArrayList<>();
		}
		for (String s1 : words) {
			map.put(s1, map.getOrDefault(s1, 0) + 1);
		}
		for (int i = 0; i < s.length() - slen + 1; i++) {
			String s1 = s.substring(i, i + slen);
			HashMap<String, Integer> temp_map = new HashMap<>();
			for (int j = 0; j < slen; j +=wlen) {
				String w = s1.substring(j, j + wlen);
				temp_map.put(w, temp_map.getOrDefault(w, 0) + 1);
			}
			if (temp_map.equals(map)) {
				list.add(i);
			}
		}
		return list;

	}
}
