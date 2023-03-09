import java.util.Scanner;

public class Main10807 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		int[] numbers = new int[count];
		
		for (int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		int choiceNum = scanner.nextInt();
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == choiceNum) {
				answer++;
			}
		}
		System.out.println(answer);

		scanner.close();
	}

}
