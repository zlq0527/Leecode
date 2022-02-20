package Leecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 13:45 2022/2/19
 * @ Description：
 */
public class T36 {
	public static void main(String[] args) {
		char[][] res = new char[][]{
				{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
				{'6', '.', '.', '1', '9', '5', '.', '.', '.'}
				, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
				, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
				, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
				, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
				, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
				, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
				, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
		System.out.println(isValidSudoku(res));
	}
	public static boolean isValidSudoku(char[][] board) {
		Map<Integer, HashSet<Integer>> row = new HashMap<>();
		Map<Integer, HashSet<Integer>> line = new HashMap<>();
		Map<Integer, HashSet<Integer>> area = new HashMap<>();
		for (int i = 0; i < 9; i++) {
			row.put(i, new HashSet<>());
			line.put(i, new HashSet<>());
			area.put(i, new HashSet<>());
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char c = board[i][j];
				if (c == '.') continue;
				int u = c - '0';
				int idx = (i / 3) * 3 + (j / 3);
				if (row.get(i).contains(u) || line.get(j).contains(u) || area.get(idx).contains(u)) return false;
				row.get(i).add(u);
				line.get(j).add(u);
				area.get(idx).add(u);
			}
		}
		return true;
	}
}
