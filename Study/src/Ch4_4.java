import java.util.Scanner;

public class Ch4_4 {

	public static void main(String[] args) {
		int score =0;// ������ �����ϱ� ���� ����
		char grade= ' ';//������ �����ϱ� ���� ����
		//�������� �ʱ�ȭ �Ѵ�.
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		//ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		if(score >= 90) {
			grade = 'A';
			//score�� 90������ ���ų� ũ�� A����
		}else if(score >= 80) {
			grade = 'B';
			//score�� 80������ ���ų� ũ�� B����
		}else if(score >= 70) {
			grade = 'C';
			//score�� 80������ ���ų� ũ�� C����
		}else {
			grade = 'D';
			//�������� D����
			//else �� ��������
		}
		System.out.println("����� ������"+grade+"�Դϴ�.");

	}

}
