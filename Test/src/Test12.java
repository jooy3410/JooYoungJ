
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= new int[90];
		int k=11;
		int hap=0;
		
		for(int i=0; i<90;i++) {
			num[i]=k;
			hap +=num[i];
			k++;
		}
		int i=0;
		
		while(i<90) {
			System.out.printf("num[%d] = %d\n", i,num[i]);
			i++;
		}
		System.out.println("�� : " + hap);

	}

}
