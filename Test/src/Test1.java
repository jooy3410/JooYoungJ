
public class Test1 {

	public static void main(String[] args) {
		int i,k;
		
		i=2;
		k=1;
		
		while(i<=9) {
			if(i==3 || i==5) {
				System.out.println("<"+i+"´Ü>");
			}
			
			
			while(k<=9) {
				System.out.printf("%d*%d=%d\n", i,k,(i*k));
				k++;
				
			}                      
			k=1;
			i++;
			System.out.printf("\n");
			
		}

	}
}


