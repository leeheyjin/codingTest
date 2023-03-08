import java.util.Scanner;

public class Main10950 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		int num1;
		int num2;
		int answer = 0;
		for (int i = 0; i < testCase; i++) {
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			
			for (int j = 0; j < 2; j++) {
				answer = num1 + num2;
			}
			System.out.println(answer);
		}
		scanner.close();
	}
}
