import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test8 {

	public static void main(String[] args) {
		List<Map<String,String>> rList=new ArrayList<>();
		Map<String,String> pMap=new HashMap<>();
		pMap.put("name", "가나다");
		pMap.put("email", "가나다@");
		rList.add(pMap);
		pMap=null;
		
		pMap=new HashMap<>();
		pMap.put("name", "abc");
		pMap.put("email", "abc@");
		rList.add(pMap);
		pMap=null;
		
		Iterator<Map<String,String>> it = rList.iterator();
		while (it.hasNext()) {
		Map<String,String> rMap=it.next();
		
		System.out.println("name : " + rMap.get("name"));
		System.out.println("email : " + rMap.get("email"));
		rMap=null;
		}
		
		
	}

}
