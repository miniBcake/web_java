package day01;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		//19. 반지름을 입력받아 원의 넓이를 계산하여 출력하기
		//(원의 넓이 계산 공식: π * 반지름 * 반지름, π 값은 3.14로 가정)
		
		//정수형 변수 radius 선언 후 기본값
		//입력메소드 import
		//출력메소드 반지름 값을 입력하세요
		//radius에 nextInt()로 입력값 받기
		//출력 3.14*radius*radius
		
		int radius = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 값을 입력하세요");
		radius = sc.nextInt();
		System.out.println(3.14 * radius * radius);
		
	}
}
