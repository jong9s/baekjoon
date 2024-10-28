import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.nextLine();
		int C = scan.nextInt();

		int min = A * 60 + B;
		min = min + C;

		int hour = (min / 60) % 24;
		int minute = (min % 60);

		System.out.println(hour + " " + minute);
	}
}