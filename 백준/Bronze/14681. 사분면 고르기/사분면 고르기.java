import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.nextLine();
		int y = scan.nextInt();

		if (0 < x) {
			if (0 < y) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}

		} else {
			if (0 < y) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
	}
}