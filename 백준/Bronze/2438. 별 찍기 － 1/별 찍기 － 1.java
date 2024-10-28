import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int l = i; l >= 1; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
