package example02;

public class DefaultTypeEx {

	public static void main(String[] args) {
		byte b1 = 127;
		byte b2 = 1;
		char ch = 'A';
		float f1 = 15.5f;
		double d1 = 10.5;
		
		/*byte b3 = b1 + b2;*/ //byte + byte = int + int 가 되므로 오류가 발생한다.
		//1번째 방법 (자동캐스팅 방법)
		int s1 = b1+b2;
		//2번째 방법 (강제캐스팅)
		byte s2 = (byte)(b1+b2);
		
		
		int s3 = ch + b2; // 65 + 1 
		
		float f2 = b1+f1;
		double d2 = f1 + d1;
		
		System.out.println(s1+", "+s2+", "+s3);
		System.out.println(f2+", "+d2);

	}

}
