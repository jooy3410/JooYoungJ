package finaltest1;

public class T08253 {

	public static void main(String[] args) {
		 int [] num = new int[90];
		 int k = 11;
		 int hap = 0;
		 
		 for(int i=0; i<=89;i++) {
			 num[i]=k;
			 hap+=num[i];
			 k++;
		 }
		 int i=0;
		 while(i<90) {
			 System.out.printf("num[%d] = %d\n", i, num[i]);
			 i++;
		 }
		 System.out.println(hap);
	}
}