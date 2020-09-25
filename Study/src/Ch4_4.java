import java.util.Scanner;

public class Ch4_4 {

	public static void main(String[] args) {
		int score =0;// 점수를 저장하기 위한 변수
		char grade= ' ';//학점을 저장하기 위한 변수
		//공백으로 초기화 한다.
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		//화면을 통해 입력받은 숫자를 score에 저장
		
		if(score >= 90) {
			grade = 'A';
			//score가 90점보다 같거나 크면 A학점
		}else if(score >= 80) {
			grade = 'B';
			//score가 80점보다 같거나 크면 B학점
		}else if(score >= 70) {
			grade = 'C';
			//score가 80점보다 같거나 크면 C학점
		}else {
			grade = 'D';
			//나머지는 D학점
			//else 블럭 생략가능
		}
		System.out.println("당신의 학점은"+grade+"입니다.");

	}

}
