package example02;

public class BitOperatorEx {

	public static void main(String[] args) {
		// &, |, ^ 3���� ��Ʈ �����ڶ�� �Ѵ�.
		
		int x= 8;
		int y= 5;
		
		System.out.println("x�� 2������ ��ȯ�� ���: " + Integer.toBinaryString(x));
		System.out.println("y�� 2������ ��ȯ�� ���: " + Integer.toBinaryString(y));
	
		System.out.println("x,y�� AND ���� ���: " + (x&y));
		System.out.println("x,y�� OR ���� ���: " + (x|y));
		System.out.println("x,y�� XOR ���� ���: " + (x^y));
	}
}