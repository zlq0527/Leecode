package Leecode;

import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int[] a = new int[time];
		for (int i = 0; i < time; i++) {
			int j = sc.nextInt();

			a[i] = j;
		}
		int c[] = a;
		Arrays.sort(c);
		int min = c[0];
		int max = c[a.length - 1];
		double s = max - min;
		int[] b = new int[time];
		for (int i = 0; i < time; i++) {
			b[i] = (int) (100 * ((a[i] - min) / s));
		}
		for (int i = 0; i < time; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
