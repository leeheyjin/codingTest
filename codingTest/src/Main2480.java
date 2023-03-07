

import java.util.Scanner;

public class Main2480 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int money = 0;

		if (num1 == num2 && num2 == num3) {
			money = 10000 + num1 * 1000;
		} else if (num1 == num2) {
			money = 1000 + num1 * 100;
		} else if (num1 == num3) {
			money = 1000 + num3 * 100;
		} else if (num2 == num3) {
			money = 1000 + num2 * 100;
		} else {
			int max = 0;
			int[] numbers = { num1, num2, num3 };
			for (int i = 0; i < numbers.length; i++) {
				if (max < numbers[i]) {
					max = numbers[i];
				}
			}
			money = max * 100;
		}
		System.out.println(money);
		scanner.close();

	}

}
