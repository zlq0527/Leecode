package Offer;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:48 2022/2/25
 * @ Description：
 */
public class of_12 {

	public static void main(String[] args) {
		char[][] res = new char[][]{
//				{'A', 'B', 'C', 'E'},
//				{'S', 'F', 'C', 'S'},
//				{'A', 'D', 'E', 'E'}
				{'a','b'},
				{'c','d'}


		};
		System.out.println(exist(res, "acdb"));
	}

	public static boolean exist(char[][] board, String word) {
		boolean visited[][] = new boolean[board.length][board[0].length];
		char[] chars = word.toCharArray();
		int h = board.length;
		int l = board[0].length;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
				if (bactrace(board, chars, i, j, visited, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean bactrace(char[][] board,
								   char[] word,
								   int i, int j,
								   boolean[][] visited2,
								   int k) {
		if (k >= word.length) {
			return true;
		}
		if (i<0||j<0||i>= board.length||j>=board[0].length) {
			return false;
		}
		if (visited2[i][j]) {
			return false;
		}
		if(board[i][j]!=word[k]){
			return false;
		}
		visited2[i][j]=true;
		boolean flag = bactrace(board, word, i + 1, j, visited2, k+1)||bactrace(board, word, i-1, j, visited2, k+1)||bactrace(board, word, i, j+1, visited2, k+1)||bactrace(board, word, i, j-1, visited2, k+1);
		if (flag) {
			return true;
		}
		visited2[i][j]=false;
		return false;
	}

}
