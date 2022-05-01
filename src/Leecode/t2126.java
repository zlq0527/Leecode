package Leecode;

import java.util.Arrays;

public class t2126 {
	public static void main(String[] args) {
		int[] ast = new int[]{4, 9, 23, 4};
		System.out.println(new t2126().asteroidsDestroyed(5, ast));
	}

	public boolean asteroidsDestroyed(int mass, int[] asteroids) {
		Arrays.sort(asteroids);
		long count = mass;
		if (mass < asteroids[0]) return false;
		for (int i = 1; i < asteroids.length; i++) {
			count += asteroids[i - 1];
			if (count < asteroids[i]) return false;
		}
		return true;
	}
}
