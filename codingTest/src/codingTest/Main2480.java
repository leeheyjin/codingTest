package codingTest;

import java.util.Scanner;

public class Main2480 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int money = 0;

		if (a == b && b == c) {
			money = 10000 + a * 1000;
		} else if (a == b) {
			money = 1000 + a * 100;
		} else if (a == c) {
			money = 1000 + c * 100;
		} else if (b == c) {
			money = 1000 + b * 100;
		} else {
			int max = a;
			if (max > b && max > c) {
				money = max * 100;
			} else if (max < b && max > c) {
				max = b;
				money = max * 100;
			} else if (max < b && max < c) {
				max = c;
				money = max * 100;
			}
		}
		System.out.println(money);
		scanner.close();

	}

}
