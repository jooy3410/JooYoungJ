package SecondSemester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T0909 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=new ArrayList<>();
		li.add("��ü���� ���α׷���");
		li.add("�ϵ�");
		li.add("MongoDB");
		
		int a=0;
		
		Iterator<String>it= li.iterator();
		if(a==0) {
			System.out.println("<"+it.next()+">");
		}else {
			System.out.println("it.next()");
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
