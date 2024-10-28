import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int Num = 0;
		int Same = 0;
		
		if(a>b && a> c) {
			Num = a;
		}else if (b > a && b >c) {
			Num = b;
		}else if(c > a && c > b) {
			Num = c;
		}else {
			Num = a;
		}
		
		if(a == b) {
			Same = a;
		}else if(a == c) {
			Same = a;
		}else if(b == c) {
			Same = b;
		}
		
		if (a == b && b == c) {
			System.out.println(10000 + (1000 * Same));
		}else if(a == b || b == c || a == c) {
			System.out.println(1000 + (100 * Same));
		}else {
			System.out.println(100 * Num);
		}
	}
	
}