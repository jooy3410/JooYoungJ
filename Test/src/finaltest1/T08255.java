package finaltest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class T08255 {

	public static void main(String[] args) {
		List<Map<String,String>>rList = new ArrayList<>();
		Map<String,String>pmap=new HashMap<>();
		
		pmap.put("name", "ÀÌÇù°Ç");
		pmap.put("email", "h.lee@");
		pmap.put("addr", "¼­¿ï");
		
		rList.add(pmap);
		
		pmap =null;
		pmap = new HashMap<>();
		
		pmap.put("name", "È«±æµ¿");
		pmap.put("email", "g.hong@");
		pmap.put("addr", "°æ±â");
		
		rList.add(pmap);
		
		pmap = null;
		
		Iterator<Map<String,String>>it=rList.iterator();
		while (it.hasNext()) {
			Map<String,String> rmap = it.next();
			
			System.out.println("name : "+ rmap.get("name"));
			System.out.println("email : " + rmap.get("email"));
			System.out.println("addr : " + rmap.get("addr"));
			
			rmap=null;
			System.out.println();
		}

	}

}
