package example01;

public class OperatorEx {

	public static void main(String[] args) {
		int v1 =5, v2 =2;
		int result = v1+v2;
		System.out.println(result);
		
		try {
			result = v1/0; //��� ���� �߻� (��� ���� 0���� ���� �� ����)
		}catch(Exception e) {
			System.out.println("���� �߻�" + e.toString());
		}
	}
}
