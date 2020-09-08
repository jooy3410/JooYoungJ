package SecondSemester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class T0908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String,String>>bList=  new ArrayList<>();
		Map<String,String>pmap=new HashMap<>();
		
		pmap.put("name", "가나다");
		pmap.put("email", "가나다@");
		
		bList.add(pmap);
		
		pmap = null;
		
		pmap = new HashMap<>();
		
		pmap.put("name", "abc");
		pmap.put("email", "abc@");
		
		bList.add(pmap);
		
		pmap = null;
		
		Iterator<Map<String,String>>its=bList.iterator();
		while (its.hasNext() ) {
			Map<String,String> amap = its.next();
					
			System.out.println("name : "+ amap.get("name"));
			System.out.println("email :" + amap.get("email"));
			
			amap=null;
			System.out.println();
		}
		

	}

}
