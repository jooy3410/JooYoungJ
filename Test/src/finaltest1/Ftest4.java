package finaltest1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ftest4 {

	public static void main(String[] args) {
		List<String>rList =new ArrayList<>();
		rList.add("��ü���� ���α׷���");
		rList.add("�ϵ�");
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


