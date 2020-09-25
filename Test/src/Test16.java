import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test16 {

	public static void main(String[] args) {
		List<HashMap<String, String>> rList =new ArrayList<>();
		HashMap<String, String> pMap = new HashMap<>();
		pMap.put("num", "123");
		pMap.put("name", "abc");
		rList.add(pMap);
		pMap=null;
		
		pMap = new HashMap<>();
		pMap.put("num", "456");
		pMap.put("name", "°¡³ª´Ù");
		rList.add(pMap);
		pMap=null;
		
		Iterator<HashMap<String,String>> it =rList.iterator();
		while(it.hasNext()) {
			HashMap<String, String> rMap = it.next();
			System.out.println("num : " +  rMap.get("num"));
			System.out.println("name : "+  rMap.get("name"));
			
		}
		
		
		
	}

}
