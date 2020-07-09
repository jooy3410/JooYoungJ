
public class Ch2_17 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');
		//"3"-->'3' - '0' -->숫자3으로 출력
		System.out.println('3' - '0' +1);
		//'3' - '0' => 숫자3 + 1 ==>숫자 4
		System.out.println(Integer.parseInt("3") +1);
		//"3"-->3
		System.out.println("3" + 1);
		//1이 "1"로 바껴서 3하고 1이 같이 찍힌다.
		System.out.println(3 + '0');
		//'3'이 된다.

	}

}
