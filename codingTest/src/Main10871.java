import java.util.Scanner;

public class Main10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next()); 
		int x = Integer.parseInt(scanner.next()); 
		int[] a = new int[n]; 
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt(); 
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		scanner.close();
	}

}
