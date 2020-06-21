import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("∫Ò±‰æÓ∞‘¿Œ");
		li.add("≥Ó∏Èππ«œ¥œ");
		
		int a=1;
		Iterator<String> it=li.iterator();
		if(a==1) {
			System.out.println("<"+it.next()+">");
		}else {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
