package example01;

public class VarEx02 {

	public static void main(String[] args) {
		int number;  //���� 4����Ʈ ��ŭ �޸�(����)�� �Ҵ�
		number = 200;
		
		System.out.println(number);
		
		String str = new String("�ؾ");
		System.out.println(str);
		str = null;   //null������ ��ü�ǰ� �ƹ��͵� ����Ű�� �ʴ� ���� �ȴ�.
		System.out.println(str);
		
		
		final int MAX = 100;
		//MAX = 200;       ������̱� ������ ���� �߻�
	}
}
