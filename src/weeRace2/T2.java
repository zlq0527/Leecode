package weeRace2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:29 2022/4/3
 * @ Description：
 */
public class T2 {
	public static void main(String[] args) {
		int[][] res = new int[][]{
				{1, 3},
				{2, 3},
				{3, 6},
				{5, 6},
				{5, 7},
				{4, 5},
				{4, 8},
				{4, 9},
				{10, 4},
				{10, 9},
		};
		System.out.println(findWinners(res));
	}

	public static List<List<Integer>> findWinners(int[][] matches) {
		List<List<Integer>> list = new ArrayList<>();
		Set<Integer> human = new HashSet<>();
		Map<Integer, Integer> winmap = new HashMap<>();
		Map<Integer, Integer> losemap = new HashMap<>();
		for (int[] i : matches) {
			for (int i1 : i) {
				if (!human.contains(i1)) human.add(i1);
			}
		}
		for (int i = 0; i < matches.length; i++) {
			int win = matches[i][0];
			int lose = matches[i][1];
			winmap.put(win, winmap.getOrDefault(win, 0) + 1);
			losemap.put(lose, losemap.getOrDefault(lose, 0) + 1);
		}
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i : human) {
			if (!losemap.containsKey(i)) list1.add(i);
			if (losemap.containsKey(i) && losemap.get(i) == 1) {
				list2.add(i);
			}
		}
		Collections.sort(list1);
		Collections.sort(list2);
		list.add(list1);
		list.add(list2);
		return list;
	}


}
