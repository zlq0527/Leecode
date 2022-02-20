package Leecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class T13 {
	public static void main(String[] args) {
		System.out.println(new T13().romanToInt("III"));
	}

	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] chars = s.toCharArray();
		int res = 0;
		for (int i = 1; i < s.length(); i++) {
			if (map.get(chars[i - 1]) < map.get(chars[i])) {
				res += map.get(chars[i]) - map.get(chars[i - 1]);
			}
			if (map.get(chars[i - 1]) >= map.get(chars[i])) {
				res += map.get(chars[i]) + map.get(chars[i + 1]);
			}

		}
		return res;

	}


}
