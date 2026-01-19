package j0119_01;

import java.util.Scanner;

public class C0119_03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 숫자 5개를 연속으로 입력받아 합계를 출력하세요. 12345 -> 15
		System.out.println("숫자 5개를 연속으로 입력하시오.");
		String num = scanner.next();
		char ch1 = num.charAt(0);
		char ch2 = num.charAt(1);
		char ch3 = num.charAt(2);
		char ch4 = num.charAt(3);
		char ch5 = num.charAt(4);
		int i = (ch1 - '0') + (ch2 - '0') + (ch3 - '0') + (ch4 - '0') + (ch5 - '0');
		System.out.println("결과값: " + i);
		
		
		
//		// 1+3 = 4
//		System.out.println("숫자를 한번에 입력하시오.");
//		String num = scanner.next();
//		char ch = num.charAt(0); // 
//		char ch2 = num.charAt(1); // 
//		System.out.println(ch+","+ch2);
//		// 결과값이 9가 나오도록 출력하세요.
//		// 방법 1
//		System.out.printf("결과값 : %d \n", (ch - '0') + (ch2 - '0'));
		// 방법 2
//		int i = (ch - '0') + (ch2 - '0'); // char - char = int
//		System.out.println("결과값: " + i);
		
		
		
		
		
//		System.out.println("숫자1를 입력하세요.>> ");
//		int num = scanner.nextInt();
//		System.out.println("숫자2를 입력하세요.>> ");
//		int num2 = scanner.nextInt();
//		System.out.printf("숫자1: %d, 숫자2:%d \n",num,num2);
		
//		int i = 'b'-'a'; //98-97=1
//		System.out.println(i); //1
//		
//		int j = '2'-'0'; //50-48=2
//		System.out.println(j); //2
//		
//		int k = '5'-'0'; //53-48=5
//		System.out.println(k); //5
//		
//		char ch = '5';
//		int num = (int)ch; //53
//		int num2 = (int)ch-48; //53-48=5
//		int num3 = ch - '0'; //53-48=5, num2와 동일
//		System.out.println(num); //53
//		System.out.println(num2); //5
//		System.out.println(num3); //5
		
//		char ch1 = 'a';
//		System.out.println(ch1);        //a
////		char ch2 = ch1+1; // char + int = int -> 형변환 오류
//		int ch2 = ch1 + 1; // char + int = int -> 자동형변환
//		System.out.println(ch2);        //98
//		System.out.println((char)ch2);  //b
//		char ch3 = ch1++; //char 특징 : 후위연산자 사용시 먼저 대입 후 증가 : ch3='a', ch1='b'
//		char ch4 = ++ch1; //char 특징 : 전위연산자 사용시 먼저 증가 후 대입 : ch1='c', ch4='c'
//		System.out.println(ch3);        //a
//		System.out.println(ch4);        //c
		
//		int a = 1_000_000;
//		int b = 2_000_000;
//		long c = a * b; // int * int = int -> 오버플로우 발생
//		System.out.println(c); //-1454759936 -> 오버플로우 발생
//		// 해결방법
//		long d = (long)a * (long)b; // long * long = long
//		System.out.println(d); //2000000000000
		
		// 단항연산자 :  부호연산자, 증감연산자, 논리연산자
		// 부호연산자 : +,-
//		int a = -10;
//		System.out.println(a);
//		int b = +10;
//		System.out.println(b);
//		// 증감연산자
//		a++; // a=a+1, a+=1
//		b--; // b=b-1, b-=1
//		// 전위연산자
//		System.out.println(++a); // a=a+1 -> 출력
//		System.out.println(--b); // b=b-1 -> 출력
//		// 후위연산자
//		System.out.println(a++); // 출력 -> a=a+1
//		System.out.println(b--); // 출력 -> b=b-1
//		System.out.println(a);
//		System.out.println(b);
//		// 논리연산자 : &&(and), ||(or), !(not)
//		System.out.println((a > 5) && (b < 15)); // false && true -> false
//		System.out.println((a > 5) || (b < 15)); // false || true -> true
//		System.out.println(!(a > 5)); // !(false) -> true
		
		// 산술연산자 : +,-,*,/,%
//		System.out.println(10+3);
//		System.out.println(10-3);
//		System.out.println(10*3);
//		System.out.println(10/3);
//		System.out.println(10%3);
		
		// 비교연산자 : >,<,>=,<=,==,!=
		
		// 삼항연산자 : (조건) ? 참일때값 : 거짓일때값
//		String str = (a > b) ? "맞습니다." : "틀렸습니다.";
//		System.out.println(str);
		
		// 이항연산자 : byte,short,char -> int로 자동형변환
		// 피연산자 중 표현범위가 큰 타입으로 형변환 후 연산
		

	}

}
