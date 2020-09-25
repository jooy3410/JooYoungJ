import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		List<String> li =new ArrayList<>();
		li.add("name");
		li.add("age");
		
		Iterator<String> it =li.iterator();
		while(it.hasNext()) {
	
		System.out.println(it.next()); 
		}

	}

}
