package finaltest1;

public class Ftest1 {
	public static void main(String[]args) {
		for(int i=3; i<=8; i++) {
			if (i ==3 || i ==5) {
				System.out.println("<"+i+"´Ü>");
				
			}
			for(int k=1; k<=9; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
			System.out.println();
		}
	}

}
