
public class Test1 {

	public static void main(String[] args) {
		int i,k;
		
		for(i=2;i<=8;i++) {
			if(i==3 || i==5) {
			System.out.println("<"+i+"´Ü>");
			}
			for(k=1;k<=9;k++) {
				System.out.printf("%d*%d=%d\n", i,k,(i*k));
				}
			System.out.printf("\n");
			
		}

	}

}
