

import java.util.Scanner;

public class Main25304 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.nextLine()); // x: 총 구매금액
		int n = Integer.parseInt(scanner.nextLine()); // n: 물건 종류 개수(물건 개수X)
		int total = 0;
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt(); // a: 각 물건의 가격
			int b = scanner.nextInt(); // b: a물건의 개수
			total += a * b;
		}

		if (total == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();

	}
}