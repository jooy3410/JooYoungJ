import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
	List <String> name =new ArrayList<String>(); //name(배열의 변수명) 변할수있음 
	//리스트를 선언한다음 거기안에 들어갈 문자열을 지정해주고  그배열의 변수명을 name으로 선언해주었다.
	//그리고 어레인리스트도구를 사용한다고 선언 list>arraylist
	
	name.add("정주영");//name이라고 선언된 배열에 add(추가)한다. 정주영을
	name.add("김승범");//김승범을 add로 추가해준다
	System.out.println(name.size());//name(배열)사이즈가 어떻게 되는지 알아보기위해서 출력해준다

	for(int i=0; i<name.size(); i++) {
		System.out.println(name.get(i));//끝을 모를때 iterator로 검사시켜주면서 받는다 get(가져와라)
	}
	Iterator <String> i = name.iterator();
	// i는 iterator(반복하자)의 변수명 for랑 while을 쓸수있지만 최대사이즈를 알수 없으니까 lterator를 써서 출력한다 
	// 속도차이 때문에 iterator를 쓴다
	while(i.hasNext()) {//구분시켜주기위해 대문자  보기만하는거 (인터페이스 출력이랑입력을 도와주는 역할ex)스케너)
		//hasnext 배열의 다음게 있는지 없는지 확인해 주는것 (차있어? 말해줘) while문을 통해서 hasNext말해줘서
		//while문을 통해서 이름을 출력하려한다
	System.out.println(i.next());
	}
		
		

	}

}
