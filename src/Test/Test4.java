package Test;
import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int sum = 0;
			int n = scanner.nextInt();
			double p = scanner.nextDouble();
			for (int i = 1; i <= 10000; i++) {
				if (Math.pow(sum, n) == p) {
					System.out.println(sum);
					break;
				}
				sum += 1;

			}
		}
	}
}
