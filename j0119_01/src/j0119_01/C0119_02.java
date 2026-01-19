package j0119_01;

import java.util.Scanner;

public class C0119_02 {

	public static void main(String[] args) {	
		// 변수 - boolean, char, (정수:byte, short, int ,long), (실수:float, double), String
		// Scanner -> (string) nextline() - 공백포함, next() - 공백제외
		// nextBoolean(), nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble() 다 가능
		// 입력순서와 변수선언 순서 동일해야함.		
		
		// 이름과 실수를 입력해서(실수 소수점 3자리까지 입력) 첫째자리까지 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>> ");
//		String name = scanner.next(); //문자열 입력 
//		System.out.println("실수를 입력하세요.>> ");
//		double num = scanner.nextDouble(); //실수 입력
//		
//		// 출력하시오
//		// 방법 1
//		System.out.println("이름: " + name);
//		System.out.printf("실수: %.1f", num); //소수점 첫째자리까지 출력
//		System.out.println();
//		// 방법 2
//		System.out.printf("이름:%s, 숫자:%.1f", name, num);
		
		// 책 53페이지 6번문제
//		System.out.println("안녕"+5.8);      //안녕5.8
//		System.out.println(3+5+"방가"+4+2+"\n");  //8방가42
//		System.out.printf(" %s:%d","홍길동",15);  // 홍길동:15
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.>> ");
		String name = scanner.next(); // 사이띄우기 안됨, enter키 입력없음. 
		System.out.println("이름 : "+name);
		
		

		
		
		
		
		
//		int a = 10;
//		int b = 3;
//		System.out.println(a/(double)b);  //3.3333333333333335
//		//printf - 형식지정 출력(소수점자릿수,공백크기,공백0표시), %.2f 소수점 2자리까지 출력
//		System.out.printf("%.2f",(a/(double)b)); 
		
	}
}