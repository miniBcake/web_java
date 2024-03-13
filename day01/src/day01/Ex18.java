package day01;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		//18. 사용자로부터 이름과 나이를 입력받아 
		// "안녕하세요, [이름]님. [나이]살이시군요." 형식으로 환영 메시지를 출력하기
		
		//로직
		//문자형 변수 name, age 선언 후 기본값 대입
		//입력메소드 import
		//이름을 입력하세요 출력
		//name에 입력받기
		//나이를 입력하세요 출력
		//age에 입력받기
		//printf로 "안녕하세요, $s님. %s살이시군요.", name, age
		
		String name = "", age = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("나이을 입력하세요");
		age = sc.next();
		System.out.printf("안녕하세요, $s님. %s살이시군요.", name, age);
		
		
	}
}
