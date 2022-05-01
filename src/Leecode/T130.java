package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:49 2022/2/26
 * @ Description：
 */
public class T130 {
	public static void main(String[] args) {
		char[][] board = new char[][]{
				{'X', 'X', 'X', 'X'},
				{'X', 'O', 'O', 'X'},
				{'X', 'X', 'O', 'X'},
				{'X', 'O', 'X', 'X'}
		};
		solve(board);
	}

	public static void solve(char[][] board) {
		boolean visited[][] = new boolean[][]{};
		int k = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				boolean flag = backtrace(board, i, j, visited, k);
			}
		}
	}

	public static boolean backtrace(char[][] board, int i, int j, boolean[][] visited, int k) {
		if (i < 0 || i > board.length || j < 0 || j > board[0].length) {
			return false;
		}

	return false;
	}


}
