package j0119_01;

import java.util.Scanner;

public class C0119_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 이름,국어,영어,수학 입력받아 이름,국어,영어,수학,합계,평균을 출력하시오.
		// 홍길동,100,100,99,299,99.67
		System.out.println("이름,국어,영어,수학 순으로 입력하시오.");
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int math = scanner.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.println("                                       [학생성적프로그램]");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name, kor, eng, math, total, avg);
		System.out.println("이름,국어,영어,수학합계,평균\n");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s,%d,%d,%d,%d,%.2f \n", name, kor, eng, math, total, avg);
		
		
		
		
		
//		System.out.println("숫자를 입력하시오.");
//		int input = scanner.nextInt();
//		String result = ((input%2)==0)?"짝수입니다.":"홀수입니다.";
//		System.out.println(result);
		
//		double a = 0.1;
//		float b = 0.1F;
//		
//		String result = (a==b)?"a와 b는 같다.":"a와 b는 다르다.";
//		System.out.println(result);
//		
//		System.out.println((double)b);
//		
//		float c = (float)a;
//		System.out.println(c);
		
//		int a = 10;
//		System.out.println(10*100/100);
		
		
//		System.out.println("소수점이 있는 숫자를 입력하시오.");
//		double input = scanner.nextDouble();
//		
//		// 소수점 3째자리에서 반올림,올림,버림 모두 해보시오. 3.14927583 -> 3.149
//		// 반올림
//		double Result1 = Math.round(input * 100) / 100.0;
//		// 올림
//		double Result2 = Math.ceil(input * 100) / 100.0;
//		// 버림
//		double Result3 = Math.floor(input * 100) / 100.0;
//		// 출력 방법 1
////		System.out.println("결과값 : " + Result1 + ", " + Result2 + ", " + Result3);
//		// 출력 방법 2
//		System.out.printf("%.2f, %.2f, %.2f \n", Result1, Result2, Result3);
		
		
		// 소수점 2째자리에서 반올림을 하시오. 34.195 -> 34.2
		// 방법 1(절사:소수점 2째까지)
		// double result = (int)(input * 100) / 100.0;
		// 방법 2
//		double result = Math.round(input * 100) / 100.0;
//		System.out.println("결과값 : " + result);
		
		
		
		// 소수점 첫째자리 : 반올림 : round(), 올림 : ceil(), 버림 : floor()
//		System.out.println(Math.round(3.592));
//		System.out.println(Math.ceil(5.12));
//		System.out.println(Math.floor(6.99));

		
		// 숫자를 입력받아 소수점 2자리에서 절사해서 출력하세요.
		// 3.141592 -> 3.14
		// 405.7931 -> 405.79
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오.");
//		double input = scanner.nextDouble();
//		// 소수점 2째자리
//		double result = (int) (input * 100) / 100.0; 
//		// 100.0으로 나누는 이유 : double타입으로 만들기 위해서
//		// 100으로 나누면 int타입이 되어 소수점 이하가 사라짐
//		System.out.println("결과값 : "+result);
////		
//		System.out.println("결과값 : "+input);
	}

}
