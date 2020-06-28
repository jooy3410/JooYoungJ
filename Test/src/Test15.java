import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test15 {

	public static void main(String[] args) {
		List<String> rList =new ArrayList<>();
		rList.add("abc");
		rList.add("¤¡¤¤¤§");
		
		int a=1;
		
		Iterator it =rList. iterator();
		while(it.hasNext()) {
			if(a==1) {
				System.out.println("<"+it.next()+">");
			} else {
				System.out.println(it.next());
			}
			
			System.out.println(it.next());
		}
		

	}

}
