import java.util.Scanner;

public class Main2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(i * (k % 10));
		System.out.println(i * ((k % 100) / 10));
		System.out.println(i * (k / 100));
		System.out.println(i * k);
	}

}
