import java.util.ArrayList;
import java.util.List;

public class Spring {

	public static void main(String[] args) {
		List<String> rList=new ArrayList<>();
		
		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		
		System.out.println("�迭�� ũ��"+ rList.size());
		
		for (int i = 0; i < rList.size(); i++) {
			System.out.println("["+i+"]��° �迭 ������: " + rList.get(i));
		}

	}

}
