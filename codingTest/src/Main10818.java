import java.util.Scanner;

public class Main10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		int[] number = new int[count];
		for (int i = 0; i < count; i++) { // 0~4
			number[i] = Integer.parseInt(scanner.next());
		}
		
		int max = 0;
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		
		int min = max;
		for (int i = 0; i < number.length; i++) {
			if (min > number[i]) {
				min = number[i];
			}
		}
		System.out.print(min + " ");
		System.out.println(max);
		scanner.close();

	}

}
