import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		List<HashMap<String,String>> rList=new ArrayList<>();
		HashMap<String,String> pMap=new HashMap<>();
		pMap.put("name", "가나다");
		pMap.put("email", "가나다@");
		rList.add(pMap);
		pMap=null;
		
		pMap=new HashMap<>();
		pMap.put("name", "abc");
		pMap.put("email", "abc@");
		rList.add(pMap);
		pMap=null;
		
		Iterator<HashMap<String,String>> it = rList.iterator();
		while (it.hasNext()) {
		HashMap<String,String> rMap=it.next();
		
		System.out.println("name : " + rMap.get("name"));
		System.out.println("email : " + rMap.get("email"));
		rMap=null;
		}
		
		
	}

}
