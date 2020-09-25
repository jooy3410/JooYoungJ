import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test13 {

	public static void main(String[] args) {
		List<String> li =new ArrayList<>();
		li.add("°¡³ª´Ù");
		li.add("abc");
		li.add("name");
		
		int a=1;
		
		Iterator<String> it=li.iterator();
			if(a == 1) {
				System.out.println("<"+it.next()+">");
			}else{
				System.out.println(it.next());
				}
			while(it.hasNext()) {
				System.out.println(it.next());
		}
			
//			Iterator<String> it= li. iterator();
//			if(a==1) {
//				System.out.println("<"+it.next()+">");
//			}else {
//				System.out.println(it.next());
//			}
//			while(it.hasNext()) {
//				System.out.println(it.next());
	}

}
