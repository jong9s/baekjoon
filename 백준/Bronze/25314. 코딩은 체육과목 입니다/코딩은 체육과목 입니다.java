import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String name = "int";
		int L = N / 4;

		if (N % 4 == 0) {
			for (int i = 0; i < L; i++) {
				name = "long " + name;
			}
		}
		System.out.println(name);
	}

}