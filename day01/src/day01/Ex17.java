package day01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		//17. 두 개의 정수형 변수 num1과 num2를 선언하고, 사용자로부터 입력을 받아 두 수를 더한 결과를 출력하기
		
		//로직
		//정수형 변수 num1, num2 선언 후 기본값 대입
		//입력 메소드, import
		//nextInt()로 num1, num2에 각각 입력받기
		//println으로 num1, num2를 더한 값 출력
		
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1 + num2);
	}
}
