package Leecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class T13 {
	public static void main(String[] args) {
		System.out.println(new T13().romanToInt("MCMXCIV"));
	}

	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);map.put('V', 5);map.put('X', 10);map.put('L', 50);
		map.put('C', 100);map.put('D', 500);map.put('M', 1000);
		char[] chars = s.toCharArray();
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			int value = map.get(chars[i]);
			if (i < s.length() - 1 && value < map.get(chars[i + 1])) {
				res -= value;
			} else {
				res += value;
			}
		}
		return res;

	}


}
