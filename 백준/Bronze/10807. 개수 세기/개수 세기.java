import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int N = scan.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		int v = scan.nextInt();

		for (int j = 0; j < arr.length; j++) {
			if (v == arr[j]) {
				count++;
			}

		}

		System.out.println(count);

	}

}