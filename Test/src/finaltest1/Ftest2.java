package finaltest1;

public class Ftest2 {

	public static void main(String[] args) {
		int i=3;
		int k=1;
		
		while(i<=8) {
			if(i == 3 || i ==8) {
				System.out.println("<"+i+"´Ü>");
			}
			while(k<=9) {
				System.out.println(i+"*"+k+"="+(i*k));
				k++;
			}
			i++;
			k=1;
			System.out.println();
			

	}

}
}
