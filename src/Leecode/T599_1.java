package Leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:51 2022/3/14
 * @ Description：
 */
public class T599_1 {
	public static void main(String[] args) {
		String[] list1 = new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
		String[] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		findRestaurant(list1, list2);
	}
	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		int min = Integer.MAX_VALUE;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i])) {
				int a = map.get(list2[i]);
				if (a + i < min) {
					list.clear();
					list.add(list2[i]);
					min = a + i;
				}else if (a + i == min) {
					list.add(list2[i]);
				}
			}
		}
		return list.toArray(new String[list.size()]);
	}
}
