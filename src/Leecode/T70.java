package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:18 2022/3/14
 * @ Description：
 */
public class T70 {
	public static void main(String[] args) {
		System.out.println(new T70().climbStairs(10));

	}
	public int climbStairs(int n) {
		int[] res = new int[46];
		res[1]=1;
		res[2]=2;
		for (int i = 3; i < res.length; i++) {
			res[i] = res[i - 1] + res[i - 2];
		}
		return res[n];
	}
}
