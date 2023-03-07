

import java.util.Scanner;

public class Main2525 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int minutes = scanner.nextInt();
		int cookTime = scanner.nextInt();

		hour += (minutes + cookTime) / 60;
		minutes = (minutes + cookTime) % 60;

		if (!(hour >= 0 && hour <= 23)) {
			hour = hour % 24;
		}
		System.out.println(hour + " " + minutes);
		scanner.close();
	}

}
