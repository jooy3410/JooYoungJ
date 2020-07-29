import java.util.Scanner;

public class Main2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k=sc.nextInt();
		
		if(k % 4 ==0) {
			if(k % 100 != 0 || k % 400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			
		} else {
			System.out.println("0");
		}

	}

}
