package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//ctrl+shift+o�� ������ Scanner ��Ű�� �ڵ� import
		//ScannerŬ������ �Է��� �ޱ� ���� Ŭ����, �Է½�Ʈ��
		//�ڿ�(Resource)�� ����ϰ� ���� �ݵ�� �ݾ���� �ȴ�.
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("������ �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		System.out.println("����ڷκ��� �Է¹��� ������ "+n+"�Դϴ�.");
		
		
		System.out.print("�Ǽ��� �Է��Ͻÿ�: ");
		double d_n = sc.nextDouble();
		System.out.println("����ڷκ��� �Է¹��� �Ǽ��� "+d_n+"�Դϴ�.");
		
		
		System.out.print("���ڿ��� �Է��Ͻÿ�(����): ");
		String str = sc.next(); //next()�� ������ ���������ؼ� ���ڸ� �Է�
		System.out.println("����ڷκ��� �Է¹��� ���ڿ��� "+str+"�Դϴ�.");
		*/
		System.out.print("���ڿ��� �Է��Ͻÿ�(����): ");
		String str_ = sc.nextLine(); //next()�� ����Ű�� ���������ؼ� ���ڸ� �Է�
		System.out.println("����ڷκ��� �Է¹��� ���ڿ��� "+str_+"�Դϴ�.");
		
		int result = Integer.parseInt(str_) * 100;
		System.out.println(result);
		
		
		//Resource �ݾ��ֱ�.
		sc.close();
	}
}