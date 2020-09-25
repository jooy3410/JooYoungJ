import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		List<HashMap<String, String>> rList =new ArrayList<>();
		HashMap<String,String>pmap= new HashMap<>();
		
		pmap. put("name", "가나다");
		pmap. put("email", "가나다");
		
		rList.add(pmap);
		
		pmap = null;
		
		pmap = new HashMap<>();
		pmap.put("name",  "홍길동");
		pmap.put("eamil", "g.hong");
		
		rList.add(pmap);
		
		pmap = null;
		
		Iterator<HashMap<String, String>> it = rList.iterator();
		while (it.hasNext()) {
			HashMap<String,String> rmap = it.next();
			
			System.out.println("name : " + rmap.get("name"));
			System.out.println("eamil : " + rmap.get("eamil"));
			
			rmap=null;
		}
		
	}

}
