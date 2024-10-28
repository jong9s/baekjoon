import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();

		if (M < 45) {
			M = M + 60 - 45;
			if (H == 0) {
				H = H + 24 - 1;
			} else {
				H = H - 1;
			}
			System.out.println(H + " " + M);
		} else if (M >= 45) {
			M = M - 45;
			System.out.println(H + " " + M);
		}
	}

}