
public class Test2 {

	public static void main(String[] args) {
		
		for(int i=3; i<=8; i++) {
			if(i==3 || i==5) {
				System.out.println("<"+i+"��>");
			}
			for (int k=1; k<=9; k++) {
				System.out.printf("%d*%d=%d\n", i,k,(i*k));
			}
		}
	}
}