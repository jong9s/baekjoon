import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine();
		int b = scan.nextInt();
		scan.nextLine();
		
		System.out.println(a * (b % 10));
		System.out.println(a * (b % 100 / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}

}
