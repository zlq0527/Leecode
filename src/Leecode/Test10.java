package Leecode;

import java.util.Scanner;

/**
 * 换酒瓶
 * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
 * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
 * 请你计算 最多 能喝到多少瓶酒。
 * <p>
 * 输入：numBottles = 9, numExchange = 3
 * 输出：13
 * 解释：你可以用 3 个空酒瓶兑换 1 瓶酒。
 * 所以最多能喝到 9 + 3 + 1 = 13 瓶酒。
 */
public class Test10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numBottles = scanner.nextInt();
		int numExchange = scanner.nextInt();
		System.out.println(numWaterBottles2(numBottles, numExchange));
	}

	public static int numWaterBottles2(int numBottles, int numExchange) {

		int buttom = numBottles;
		int res = numBottles;
		while (buttom >= numExchange) {
			buttom -= numExchange;
			++buttom;
			++res;

		}
		return res;

	}
}
