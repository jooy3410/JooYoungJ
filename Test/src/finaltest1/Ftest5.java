package finaltest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ftest5 {

	public static void main(String[] args) {
		List<HashMap<String,String>>rList =new ArrayList<>();
		HashMap<String,String>pMap = new HashMap<>();
		pMap.put("name", "���ֿ�");
		pMap.put("email", "jjy@");
		pMap.put("addr", "����");
		rList.add(pMap);
		pMap=null;
		
		pMap = new HashMap<>();
		pMap.put("name", "������");
		pMap.put("email", "������@");
		pMap.put("addr", "abc");
		rList.add(pMap);
		pMap=null;
		
		Iterator<HashMap<String,String>>it = rList.iterator();
		while(it.hasNext()) {
		HashMap<String,String>rMap=it.next();
		System.out.println("#################");
			System.out.println("name" + rMap.get("name"));
			System.out.println("email" + rMap.get("email"));
			System.out.println("addr" + rMap.get("addr"));
			System.out.println("#################");
		}

	}

}
