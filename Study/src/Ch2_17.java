
public class Ch2_17 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');
		//"3"-->'3' - '0' -->����3���� ���
		System.out.println('3' - '0' +1);
		//'3' - '0' => ����3 + 1 ==>���� 4
		System.out.println(Integer.parseInt("3") +1);
		//"3"-->3
		System.out.println("3" + 1);
		//1�� "1"�� �ٲ��� 3�ϰ� 1�� ���� ������.
		System.out.println(3 + '0');
		//'3'�� �ȴ�.

	}

}
