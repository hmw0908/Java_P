package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//ctrl+shift+o를 누르면 Scanner 패키지 자동 import
		//Scanner클래스는 입력을 받기 위한 클래스, 입력스트림
		//자원(Resource)은 사용하고 나서 반드시 닫아줘야 된다.
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("정수를 입력하시오: ");
		int n = sc.nextInt();
		System.out.println("사용자로부터 입력받은 정수는 "+n+"입니다.");
		
		
		System.out.print("실수를 입력하시오: ");
		double d_n = sc.nextDouble();
		System.out.println("사용자로부터 입력받은 실수는 "+d_n+"입니다.");
		
		
		System.out.print("문자열을 입력하시오(공백): ");
		String str = sc.next(); //next()는 공백을 기준으로해서 문자를 입력
		System.out.println("사용자로부터 입력받은 문자열는 "+str+"입니다.");
		*/
		System.out.print("문자열을 입력하시오(엔터): ");
		String str_ = sc.nextLine(); //next()는 엔터키를 기준으로해서 문자를 입력
		System.out.println("사용자로부터 입력받은 문자열은 "+str_+"입니다.");
		
		int result = Integer.parseInt(str_) * 100;
		System.out.println(result);
		
		
		//Resource 닫아주기.
		sc.close();
	}
}