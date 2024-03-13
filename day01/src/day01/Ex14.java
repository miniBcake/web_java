package day01;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		//14. 사용자로부터 세 개의 정수형태의 문자열을 입력받아 문자열, 정수, 실수를 출력하기
		
		// 로직
		// 문자열 변수 3개 선언 후 기본값 대입
		// 입력 메소드, import
		// 정수 세 개를 입력하시오 출력 println
		// 변수 num1에 입력받은 값 저장 next();
		// 변수 num2에 입력받은 값 저장 next();
		// 변수 num3에 입력받은 값 저장 next();
		// 변수 num1 출력 println
		// 변수 num2를 정수형으로 변환하여 출력 println
		// 변수 num2와 "." num3를 더한 뒤 실수형로 변환하여 출력 println
		
		String num1 = "", num2 = "", num3 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오");
		num1 = sc.next();
		num2 = sc.next();
		num3 = sc.next();
		System.out.println(num1);
		System.out.println(Integer.parseInt(num2));
		System.out.println(Double.parseDouble(num2 + "." + num3));
	}
}
