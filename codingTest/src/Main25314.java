
import java.util.Scanner;

public class Main25314 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bytes = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i * 4 <= bytes; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		scanner.close();
	}

}
