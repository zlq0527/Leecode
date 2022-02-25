package Offer;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 14:45 2022/2/25
 * @ Description：
 */
public class of_10_2 {
	public static void main(String[] args) {
		System.out.println(numWays(90));
	}
	public static int numWays(int n) {
		if(n==0){
			return 1;
		}else if(n>0&&n<=2){
			return n;
		}
		int dp[] = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		dp[3]=3;
		for (int i = 3; i <=dp.length-1; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
		}
		return dp[n];
	}
}
