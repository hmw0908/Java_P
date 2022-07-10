package example01;

public class OperatorEx {

	public static void main(String[] args) {
		int v1 =5, v2 =2;
		int result = v1+v2;
		System.out.println(result);
		
		try {
			result = v1/0; //산술 예외 발생 (모든 수는 0으로 나눌 수 없다)
		}catch(Exception e) {
			System.out.println("예외 발생" + e.toString());
		}
	}
}
