package example01;

public class VarEx01 {

	public static void main(String[] args) {
		int year = 0;
		int age = 42;
		long result = 10;
		float result_2 = 10.1f; //float는 default가 아니기 때문에 접미사 필요
		
		String str = new String("자바");
		Object obj1 = new Object();
		//사용자 정의 클래스이거나 toString() 재정의를 하지 않은
		//클래스의 참조변수는 출력을 하게 되면, 클래스 타입@16진수(주소)가 출력된다.
		
		
		System.out.println(result);
		System.out.println(str.toString());
		System.out.println(obj1);
		System.out.println(year+3);
		//sys를 치고 Ctrl+Space 누르면 자동완성 기능 실행 (인텔리전스 기능)
	}
}