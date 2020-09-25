package finaltest1;

public class FtestStar {

	public static void main(String[] args) {
		
		for(int i=0; i<11; i++) {
			if(i<6)
			{
				for(int k=0; k<=(4-i); k++) 
				{
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) 
				{
					System.out.print("*");
				}
			}
			else 
			{
				for(int k=0; k<=(i-6); k++)
				{
					System.out.print(" ");
				}
				for(int k=0; k<=(10-i); k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
