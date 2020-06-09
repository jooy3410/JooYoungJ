import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i =s.nextInt();
		for(int k=1;k<=9;k++) {
			System.out.println(i + "*" + k + "=" + (i*k));
		}

	}

}
