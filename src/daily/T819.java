package daily;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:04 2022/4/17
 * @ Description：
 */

public class T819 {
	public static void main(String[] args) {
//		String a1 = "Bob hit a ball.., the hit BALL flew far after it was hit. ?";
		String a1 = "a, a, a, a, b,b,b,c, c";
		String[] res = new String[]{"a"};
		System.out.println(mostCommonWord(a1, res));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(banned));
		String paragraph2 = paragraph.toLowerCase();
		String replaceAll = paragraph2.replaceAll(",", " ")
				.replaceAll("\\?","")
				.replaceAll(";","")
				.replaceAll("'","")
				.replaceAll("!","")
				.replaceAll("\\.","");
		String[] s = replaceAll.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			if (list.contains(s[i])||s[i].equals("")) {
			} else {
				map.put(s[i], map.getOrDefault(s[i], 0) + 1);
			}
		}
		String res = "";
		int i = 0;
		for (String s1 : map.keySet()) {
			if (map.get(s1) >= i) {
				res = s1;
				i = map.get(s1);

			}
		}
		return res;


	}
}
