package example01;

public class VarEx01 {

	public static void main(String[] args) {
		int year = 0;
		int age = 42;
		long result = 10;
		float result_2 = 10.1f; //float�� default�� �ƴϱ� ������ ���̻� �ʿ�
		
		String str = new String("�ڹ�");
		Object obj1 = new Object();
		//����� ���� Ŭ�����̰ų� toString() �����Ǹ� ���� ����
		//Ŭ������ ���������� ����� �ϰ� �Ǹ�, Ŭ���� Ÿ��@16����(�ּ�)�� ��µȴ�.
		
		
		System.out.println(result);
		System.out.println(str.toString());
		System.out.println(obj1);
		System.out.println(year+3);
		//sys�� ġ�� Ctrl+Space ������ �ڵ��ϼ� ��� ���� (���ڸ����� ���)
	}
}