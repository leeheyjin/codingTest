package codingTest;

import java.util.Scanner;

public class Main2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minutes = scanner.nextInt();

		if (minutes >= 45 && minutes <= 59) {
			minutes -= 45;
		} else if (minutes >= 0 && minutes < 45) {
			minutes += 15;
			if (hour == 0) {
				hour = 23;
			} else {
				hour -= 1;
			}
		}
		System.out.println(hour + " " + minutes);
		scanner.close();
	}

}
