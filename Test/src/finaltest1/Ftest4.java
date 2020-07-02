package finaltest1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ftest4 {

	public static void main(String[] args) {
		List<String>rList =new ArrayList<>();
		rList.add("객체지향 프로그래밍");
		rList.add("하둡");
		rList.add("mongoDB");
		
		int a=1;
		
		Iterator<String> it= rList.iterator(); 
		if(a ==1) {
			System.out.println("<"+it.next()+">");
		}else {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
	}


