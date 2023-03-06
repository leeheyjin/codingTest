package codingTest;

import java.util.Scanner;

public class Main2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt(); // (1)
		int num2 = scanner.nextInt(); // (2)

		int[] num2Arr = new int[3];
		num2Arr[0] = num2 / 100;
		num2Arr[1] = num2 % 100 / 10;
		num2Arr[2] = num2 % 100 % 10;

		int num5 = num1 * num2Arr[0]; // (5)
		int num4 = num1 * num2Arr[1]; // (4)
		int num3 = num1 * num2Arr[2]; // (3)

		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num3 + num4 * 10 + num5 * 100);

		scanner.close();
	}
}
