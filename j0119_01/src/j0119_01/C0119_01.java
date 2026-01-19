package j0119_01;

import java.util.Scanner;

//내장객체는 import 해야 사용가능 - System,Math 등 자주 사용하는 객체는 import 안해도 사용가능

public class C0119_01 {

	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch); //형변환 - 아스키코드 값으로 출력
		System.out.println(ch + 1); // 자동형변환 - 아스키코드 값으로 출력, byte,short,char -> + 연산 하면 int타입으로 자동형변환
		System.out.println((char)ch); //형변환 - 문자로 출력
		int ch2 = 65;
		System.out.println((char) ch2); //형변환 - 문자로 출력
		
		String str = "aaa";
		System.out.println(str + 77); // 문자열 + 숫자 -> 문자열로, -는 불가능
		System.out.println(77-11+str); // 숫자 - 숫자 + 문자열 -> 문자열로
		System.out.println(str+(77-11)); // 문자열 + (숫자 - 숫자) -> 문자열로

		
		
		
//		int True = 10; //대문자 사용. 
////		int true; // 예약어 사용 불가
//		boolean a = true; //boolean 소문자 사용
//		boolean b = false;
//		byte c = 1; // 256개 -128~127
//		short d = 1; // 32,768개 -32,768~32,767
//		int e = 1; // 21억개 -21억~21억
//		long f = 1000000000000L; // 8byte -21억~21억 이상 숫자 사용시 L 붙여야함
//		float g = 1.0f; //4byte 소수점 7자리까지 정확 f 붙여야함
//		double h = 1.0d; //8byte 소수점 15자리까지 정확 d 붙여도 되고 안붙여도됨
//		char cc = 'a'; //1byte 문자 1개만 가능 ''사용
//		char cc2 = ' '; //공백도 문자로 인식
////		char cc3 = ''; // 아무것도 넣지 않는 것은 안됨,
//		
//		String str = new String("aaa"); //문자열 여러글자 가능 ""사용
//		System.out.println(str);
//		
//		String str2 = "aaa"; //String 은 new 안써도 가능
//		System.out.println(str2);
		
		
		
//		int a = 2_147_483_647; //4byte  _는 자리수 구분
//		System.out.println(a+10);  //오버플로우 발생
		
//		int b = 10;
//		System.out.println(b+1);
		
		
		// 함수 -> 메소드
		// 함수,객체 차이점 -> 이름():함수, 클래스:첫글자가 대문자
//		System.out.println("출력입니다.");
//		
//		// 입력부분 - 객체선언
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int a = scanner.nextInt();
//		
//		//input('숫자를입력하세요.') - 파이썬
//		System.out.println("입력된 숫자 : "+a);
		
		
		

	}

}
