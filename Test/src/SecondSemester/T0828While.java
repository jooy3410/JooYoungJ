package SecondSemester;

public class T0828While {

	public static void main(String[] args) {
		int i=3; 
		int k=1;
		while (i<=9) {
			if((i==3 || i==5) && k==1) {
				System.out.println("<"+i+"´Ü>");
			}
			System.out.printf("%d*%d=%d\n", i, k, i*k );
			k++;
			if (k > 9) {
				k=1;
				i++;
				System.out.println();
			}
			
		}
	}

	}


