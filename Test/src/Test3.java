import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
	List <String> name =new ArrayList<String>(); //name(�迭�� ������) ���Ҽ����� 
	//����Ʈ�� �����Ѵ��� �ű�ȿ� �� ���ڿ��� �������ְ�  �׹迭�� �������� name���� �������־���.
	//�׸��� ��θ���Ʈ������ ����Ѵٰ� ���� list>arraylist
	
	name.add("���ֿ�");//name�̶�� ����� �迭�� add(�߰�)�Ѵ�. ���ֿ���
	name.add("��¹�");//��¹��� add�� �߰����ش�
	System.out.println(name.size());//name(�迭)����� ��� �Ǵ��� �˾ƺ������ؼ� ������ش�

	for(int i=0; i<name.size(); i++) {
		System.out.println(name.get(i));//���� �𸦶� iterator�� �˻�����ָ鼭 �޴´� get(�����Ͷ�)
	}
	Iterator <String> i = name.iterator();
	// i�� iterator(�ݺ�����)�� ������ for�� while�� ���������� �ִ����� �˼� �����ϱ� lterator�� �Ἥ ����Ѵ� 
	// �ӵ����� ������ iterator�� ����
	while(i.hasNext()) {//���н����ֱ����� �빮��  ���⸸�ϴ°� (�������̽� ����̶��Է��� �����ִ� ����ex)���ɳ�)
		//hasnext �迭�� ������ �ִ��� ������ Ȯ���� �ִ°� (���־�? ������) while���� ���ؼ� hasNext�����༭
		//while���� ���ؼ� �̸��� ����Ϸ��Ѵ�
	System.out.println(i.next());
	}
		
		

	}

}
