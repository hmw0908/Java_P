package example01;

public class VarEx02 {

	public static void main(String[] args) {
		int number;  //변수 4바이트 만큼 메모리(스택)를 할당
		number = 200;
		
		System.out.println(number);
		
		String str = new String("붕어빵");
		System.out.println(str);
		str = null;   //null값으로 대체되고 아무것도 가르키지 않는 값이 된다.
		System.out.println(str);
		
		
		final int MAX = 100;
		//MAX = 200;       상수값이기 때문에 오류 발생
	}
}
