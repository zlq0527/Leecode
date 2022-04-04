package Leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:22 2022/3/14
 * @ Description：
 */
public class T599 {
	public static void main(String[] args) {
		String[] list1 = new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
		String[] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		findRestaurant(list1, list2);
	}
	public static String[] findRestaurant(String[] list1, String[] list2) {
		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])&&i+j<=min) {
					min = i + j;
					map.put(list1[i], min);
				}
			}
		}
		int min2=Integer.MAX_VALUE;
		for (int i : map.values()) {
			min2 = Math.min(min2, i);
		}
		for (String key : map.keySet()) {
			if (map.get(key) == min2) {
				list.add(key);
			}
		}
		String[] res = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
			System.out.println(list.get(i));
		}
		return  res;
	}
}
