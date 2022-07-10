package example02;

public class BitOperatorEx {

	public static void main(String[] args) {
		// &, |, ^ 3개를 비트 연산자라고 한다.
		
		int x= 8;
		int y= 5;
		
		System.out.println("x를 2진수로 변환한 결과: " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환한 결과: " + Integer.toBinaryString(y));
	
		System.out.println("x,y를 AND 연산 결과: " + (x&y));
		System.out.println("x,y를 OR 연산 결과: " + (x|y));
		System.out.println("x,y를 XOR 연산 결과: " + (x^y));
	}
}