package Offer;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:04 2022/2/27
 * @ Description：
 */
public class of_13 {
	public static void main(String[] args) {
		System.out.println(new of_13().movingCount(3, 3, 17));

	}
	static int res = 0;
	public int movingCount(int m, int n, int k) {
		boolean[][] visited = new boolean[m][n];
		backtrace(0, 0, m, n, k, visited);
		return res;
	}

	public static void backtrace(int i, int j, int m, int n, int k, boolean[][] visited) {
		if (i < 0 || i >= m || j < 0 || j >= n) {
			return ;
		}
		if ((i/10 + i%10 + j/10 + j%10) > k) {
			return;
		}
		if (visited[i][j]) {
			return;
		}
		visited[i][j]=true;
		res++;
		backtrace(i,j+1,m,n,k,visited);
		backtrace(i+1,j,m,n,k,visited);
	}
}
